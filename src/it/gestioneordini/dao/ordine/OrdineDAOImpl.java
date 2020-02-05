package it.gestioneordini.dao.ordine;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;

import it.gestioneordini.model.Categoria;
import it.gestioneordini.model.Ordine;

public class OrdineDAOImpl implements OrdineDAO{

	private EntityManager entityManager;
	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager=entityManager;
		
	}
	
	@Override
	public List<Ordine> list() throws Exception {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from Ordine",Ordine.class).getResultList();
	}

	@Override
	public Ordine get(Long id) throws Exception {
		// TODO Auto-generated method stub
		return entityManager.find(Ordine.class, id);
	}

	@Override
	public void update(Ordine ordine) throws Exception {
		// TODO Auto-generated method stub
		if (ordine == null) {
			throw new Exception("Problema valore in input");
		}
		ordine = entityManager.merge(ordine);		
	}

	@Override
	public void insert(Ordine ordine) throws Exception {
		// TODO Auto-generated method stub
		if (ordine == null) {
			System.out.println("non arrivo 1");
			throw new Exception("Problema valore in input");
		}
		System.out.println("arrivo 1");
		entityManager.persist(ordine);	
		System.out.println("arrivo 2");
	}

	@Override
	public void delete(Ordine ordine) throws Exception {
		// TODO Auto-generated method stub
		if (ordine == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.remove(entityManager.merge(ordine));			
	}

	@Override
	public List<Ordine> findByExample(Ordine ordine) throws Exception {
		// TODO Auto-generated method stub
		if (ordine == null) {
			throw new Exception("Problema valore in input");
		}

		Session session = (Session) entityManager.getDelegate();
		Example ordineExample = Example.create(ordine).excludeZeroes();
		Criteria criteria = session.createCriteria(Ordine.class).add(ordineExample);
		return criteria.list();
	}

	@Override
	public List<Ordine> findAllByCategoria(Categoria input) throws Exception {
		TypedQuery<Ordine> query = entityManager.createQuery("select o from Ordine o join o.articoli art join art.categorie ca where ca.descrizione= ?1", Ordine.class);
		return query.setParameter(1, input.getDescrizione()).getResultList();
	}



}
