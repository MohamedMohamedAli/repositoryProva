package it.gestioneordini.service.ordine;

import it.gestioneordini.dao.ordine.OrdineDAO;
import it.gestioneordini.model.Ordine;
import it.gestioneordini.service.IBaseService;

public interface OrdineService extends IBaseService<Ordine> {
	//per injection
	public void setOrdineDAO(OrdineDAO ordineDAO);
}
