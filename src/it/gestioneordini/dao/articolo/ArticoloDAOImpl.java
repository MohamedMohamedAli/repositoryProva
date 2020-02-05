package it.gestioneordini.dao.articolo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;

import it.gestioneordini.model.Articolo;
import it.gestioneordini.model.Categoria;

public class ArticoloDAOImpl implements ArticoloDAO{

	private EntityManager entityManager;
	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager=entityManager;
		
	}

	@Override
	public List<Articolo> list() throws Exception {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from Articolo",Articolo.class).getResultList();
	}

	@Override
	public Articolo get(Long id) throws Exception {
		// TODO Auto-generated method stub
		return entityManager.find(Articolo.class, id);
	}

	@Override
	public void update(Articolo articolo) throws Exception {
		// TODO Auto-generated method stub
		if (articolo == null) {
			throw new Exception("Problema valore in input");
		}
		articolo = entityManager.merge(articolo);		
	}

	@Override
	public void insert(Articolo articolo) throws Exception {
		// TODO Auto-generated method stub
		if (articolo == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.persist(articolo);		
	}

	@Override
	public void delete(Articolo articolo) throws Exception {
		// TODO Auto-generated method stub
		if (articolo == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.remove(entityManager.merge(articolo));		
	}

	@Override
	public List<Articolo> findByExample(Articolo articolo) throws Exception {
		if (articolo == null) {
			throw new Exception("Problema valore in input");
		}

		Session session = (Session) entityManager.getDelegate();
		Example articoloExample = Example.create(articolo).excludeZeroes();
		Criteria criteria = session.createCriteria(Articolo.class).add(articoloExample);
		return criteria.list();
	}

	@Override
	public int sommaPrezziConCategoria(Categoria categoria) throws Exception {
		TypedQuery<Articolo> query = entityManager.createQuery("select sum (a.prezzosingolo) from Articolo a join a.categorie c where c.id = ?1", Articolo.class);
		return query.setParameter(1, categoria.getId()).getFirstResult();
	}



}
