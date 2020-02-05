package it.gestioneordini.dao.articolo;

import it.gestioneordini.dao.IBaseDAO;
import it.gestioneordini.model.Articolo;
import it.gestioneordini.model.Categoria;

public interface ArticoloDAO extends IBaseDAO<Articolo>{
	public int sommaPrezziConCategoria(Categoria categoria) throws Exception;
}
