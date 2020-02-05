package it.gestioneordini.dao;

import it.gestioneordini.dao.articolo.ArticoloDAO;
import it.gestioneordini.dao.articolo.ArticoloDAOImpl;
import it.gestioneordini.dao.categoria.CategoriaDAO;
import it.gestioneordini.dao.categoria.CategoriaDAOImpl;
import it.gestioneordini.dao.ordine.OrdineDAO;
import it.gestioneordini.dao.ordine.OrdineDAOImpl;

public class MyDaoFactory {
	
	public static ArticoloDAO getArticoloDAOInstance(){
		return new ArticoloDAOImpl();
	}
	public static CategoriaDAO getCategoriaDAOInstance(){
		return new CategoriaDAOImpl();
	}
	public static OrdineDAO getOrdineDAOInstance(){
		return new OrdineDAOImpl();
	}
}
