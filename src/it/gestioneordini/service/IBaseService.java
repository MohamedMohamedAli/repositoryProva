package it.gestioneordini.service;

import java.util.List;

public interface IBaseService<T> {
	public List<T> listFinal() throws Exception;

	public T getFinal(Long id) throws Exception;

	public void updateFinal(T o) throws Exception;

	public void insertFinal(T o) throws Exception;

	public void deleteFinal(T o) throws Exception;

	public List<T> findByExampleFinal(T o) throws Exception;
}
