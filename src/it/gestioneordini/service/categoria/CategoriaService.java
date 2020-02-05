package it.gestioneordini.service.categoria;

import it.gestioneordini.dao.categoria.CategoriaDAO;
import it.gestioneordini.model.Categoria;
import it.gestioneordini.service.IBaseService;

public interface CategoriaService extends IBaseService<Categoria>{
	//per injection
	public void setCategoriaDAO(CategoriaDAO categoriaDAO);
}
