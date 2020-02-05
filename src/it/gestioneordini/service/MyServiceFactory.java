package it.gestioneordini.service;

import it.gestioneordini.dao.MyDaoFactory;
import it.gestioneordini.service.articolo.ArticoloService;
import it.gestioneordini.service.articolo.ArticoloServiceImpl;
import it.gestioneordini.service.categoria.CategoriaService;
import it.gestioneordini.service.categoria.CategoriaServiceImpl;
import it.gestioneordini.service.ordine.OrdineService;
import it.gestioneordini.service.ordine.OrdineServiceImpl;

public class MyServiceFactory {
	
	public static ArticoloService getArticoloServiceInstance() {
		ArticoloService articoloServiceInstance = new ArticoloServiceImpl();
		articoloServiceInstance.setArticoloDAO(MyDaoFactory.getArticoloDAOInstance());
		return articoloServiceInstance;
	}
	public static CategoriaService getCategoriaServiceInstance() {
		CategoriaService categoriaServiceInstance = new CategoriaServiceImpl();
		categoriaServiceInstance.setCategoriaDAO(MyDaoFactory.getCategoriaDAOInstance());
		return categoriaServiceInstance;
	}
	public static OrdineService getOrdineServiceInstance() {
		OrdineService ordineServiceInstance = new OrdineServiceImpl();
		ordineServiceInstance.setOrdineDAO(MyDaoFactory.getOrdineDAOInstance());
		return ordineServiceInstance;
	}
}
