package it.gestioneordini.dao.categoria;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;

import it.gestioneordini.model.Categoria;
import it.gestioneordini.model.Ordine;

public class CategoriaDAOImpl implements CategoriaDAO{

	private EntityManager entityManager;
	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager=entityManager;
		
	}	
	
	@Override
	public List<Categoria> list() throws Exception {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from Categoria",Categoria.class).getResultList();
	}

	@Override
	public Categoria get(Long id) throws Exception {
		// TODO Auto-generated method stub
		return entityManager.find(Categoria.class, id);
	}

	@Override
	public void update(Categoria categoria) throws Exception {
		// TODO Auto-generated method stub
		if (categoria == null) {
			throw new Exception("Problema valore in input");
		}
		categoria = entityManager.merge(categoria);		
	}

	@Override
	public void insert(Categoria categoria) throws Exception {
		// TODO Auto-generated method stub
		if (categoria == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.persist(categoria);			
	}

	@Override
	public void delete(Categoria categoria) throws Exception {
		// TODO Auto-generated method stub
		if (categoria == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.remove(entityManager.merge(categoria));			
	}

	@Override
	public List<Categoria> findByExample(Categoria categoria) throws Exception {
		// TODO Auto-generated method stub
		if (categoria == null) {
			throw new Exception("Problema valore in input");
		}

		Session session = (Session) entityManager.getDelegate();
		Example categoriaExample = Example.create(categoria).excludeZeroes();
		Criteria criteria = session.createCriteria(Categoria.class).add(categoriaExample);
		return criteria.list();
	}

	@Override
	public List<Categoria> findAllByOrdine(Ordine input) throws Exception {//forma alternativa da provare ("select c from Categoria c join  c.articoli art where art.ordine.id = ?1")
		TypedQuery<Categoria> query = entityManager.createQuery("select c from Categoria c join c.articoli art join art.ordine or where or.id = ?1", Categoria.class);
		return query.setParameter(1, input.getId()).getResultList();
	}


}
