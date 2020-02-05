package it.gestioneordini.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String descrizione;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "categorie")
	private Set<Articolo>articoli=new HashSet<Articolo>();
	
	//COSTRUTTORI
	public Categoria() {
	}

	public Categoria(String descrizione, Set<Articolo> articoli) {
		this.descrizione = descrizione;
		this.articoli = articoli;
	}

	public Categoria(Long id, String descrizione, Set<Articolo> articoli) {
		this.id = id;
		this.descrizione = descrizione;
		this.articoli = articoli;
	}

	public Categoria(String descrizione) {
		this.descrizione = descrizione;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Set<Articolo> getArticoli() {
		return articoli;
	}

	public void setArticoli(Set<Articolo> articoli) {
		this.articoli = articoli;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("ID:["+id+"],  DESCRIZIONE:["+descrizione+"]");
	}
}
