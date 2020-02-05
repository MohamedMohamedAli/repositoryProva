package it.gestioneordini.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ordine")
public class Ordine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nomeDestinatario;
	private String indirizzoSpedizione;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ordine", orphanRemoval = true)
	private Set<Articolo>articoli = new HashSet<Articolo>();
	
	//COSTRUTTORI
	public Ordine() {
	}	
	public Ordine(String nomeDestinatario, String indirizzoSpedizione) {
		this.nomeDestinatario = nomeDestinatario;
		this.indirizzoSpedizione = indirizzoSpedizione;
	}	
	public Ordine(Long id, String nomeDestinatario, String indirizzoSpedizione) {
		this.id = id;
		this.nomeDestinatario = nomeDestinatario;
		this.indirizzoSpedizione = indirizzoSpedizione;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeDestinatario() {
		return nomeDestinatario;
	}
	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}
	public String getIndirizzoSpedizione() {
		return indirizzoSpedizione;
	}
	public void setIndirizzoSpedizione(String indirizzoSpedizione) {
		this.indirizzoSpedizione = indirizzoSpedizione;
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
		return ("ID:["+id+"],  NOME DESTINATARIO:["+nomeDestinatario+"],  INDIRIZZO SPEDIZIONE:["+indirizzoSpedizione);
	}
}
