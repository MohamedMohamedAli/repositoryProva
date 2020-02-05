package it.gestioneordini.dao.categoria;

import java.util.List;

import it.gestioneordini.dao.IBaseDAO;
import it.gestioneordini.model.Categoria;
import it.gestioneordini.model.Ordine;

public interface CategoriaDAO extends IBaseDAO<Categoria>{
	
	public List<Categoria> findAllByOrdine(Ordine input) throws Exception;

}
