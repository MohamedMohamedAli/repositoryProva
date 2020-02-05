package it.gestioneordini.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import it.gestioneordini.model.Articolo;
import it.gestioneordini.model.Categoria;
import it.gestioneordini.model.Ordine;
import it.gestioneordini.service.MyServiceFactory;
import it.gestioneordini.service.articolo.ArticoloService;
import it.gestioneordini.service.categoria.CategoriaService;
import it.gestioneordini.service.ordine.OrdineService;

public class TestGestioneOrdini {
	public static void main(String[] args) {
		
		//ORDINI
		
		Ordine ordine2 = new Ordine("PERSONA 2","VIA DI PERSONA 2");
		
		//ARTICOLI
		
//		Articolo articolo2 = new Articolo("ARTICOLO 2",50,ordine1);
//		Articolo articolo3 = new Articolo("ARTICOLO 3",70,ordine1);
//		
//		
//		Set<Articolo> articoliCategoria2 = new HashSet<Articolo>();
//		Set<Articolo> articoliCategoria3 = new HashSet<Articolo>();
//		
//		
//		
//		articoliCategoria2.add(articolo3);
//		articoliCategoria2.add(articolo4);
//		
//		articoliCategoria3.add(articolo5);
//		articoliCategoria3.add(articolo6);
//		
//		//CATEGORIE
//		Categoria categoria1 = new Categoria("CATEGORIA 1",articoliCategoria1);
//		
//		//COLLEGAMENTI ARTICOLI----> CATEGORIE
//		Set<Categoria> CategorieArticolo1 = new HashSet<Categoria>();
//		CategorieArticolo1.add(categoria1);
//		CategorieArticolo1.add(categoria2);
//		articolo1.setCategorie(CategorieArticolo1);
		
//		Set<Categoria> CategorieArticolo2 = new HashSet<Categoria>();
//		CategorieArticolo2.add(categoria1);
//		CategorieArticolo2.add(categoria3);
//		articolo2.setCategorie(CategorieArticolo2);
//		
//		Set<Categoria> CategorieArticolo3 = new HashSet<Categoria>();
//		CategorieArticolo3.add(categoria2);
//		CategorieArticolo3.add(categoria3);
//		articolo3.setCategorie(CategorieArticolo3);
//		
//		Set<Categoria> CategorieArticolo4 = new HashSet<Categoria>();
//		CategorieArticolo4.add(categoria2);
//		CategorieArticolo4.add(categoria1);
//		articolo4.setCategorie(CategorieArticolo4);
//		
//		Set<Categoria> CategorieArticolo5 = new HashSet<Categoria>();
//		CategorieArticolo5.add(categoria3);
//		CategorieArticolo5.add(categoria2);
//		articolo5.setCategorie(CategorieArticolo5);
//		
//		Set<Categoria> CategorieArticolo6 = new HashSet<Categoria>();
//		CategorieArticolo6.add(categoria1);
//		CategorieArticolo6.add(categoria2);
//		articolo6.setCategorie(CategorieArticolo6);
//		
//		ordine1.setArticoli(articoliCategoria1);
		
		ArticoloService articoloService = MyServiceFactory.getArticoloServiceInstance();
		OrdineService ordineService = MyServiceFactory.getOrdineServiceInstance();
		CategoriaService categoriaService = MyServiceFactory.getCategoriaServiceInstance();
		try {
		/*	Ordine ordine1 = new Ordine("PERSONA 1","VIA DI PERSONA 1");
			ordineService.insertFinal(ordine1);
			
			//Ordine ordineGiaPresenteSullaBaseDati = ordineService.getFinal(4L);
			
			Articolo articolo1 = new Articolo("ARTICOLO 1",100,ordineService.getFinal(6L));
			articoloService.insertFinal(articolo1);
			
			Categoria categoria1 = new Categoria("CATEGORIA 1");
			//ora la collego al contesto di persistenza, la 'attacco' al contesto
			categoriaService.insertFinal(categoria1);
			
			//voglio collegare la categoria 3 all'articolo 6
			Categoria categoriaSulDb = categoriaService.getFinal(3L);
			Articolo articoloSulDb = articoloService.getFinal(6L);
			//dopo averli caricati dal contesto di persistenza ora li collego
			//siccome Articolo è l'owner è lui a comandare quindi caro articolo ti aggiungo la categoria
			articoloSulDb.getCategorie().add(categoriaSulDb);
			// devo fare la stessa cosa anche dal lato opposto
			categoriaSulDb.getArticoli().add(articoloSulDb);
			//devo chiamare l'aggiorna su articoloSulDb
			articoloService.updateFinal(articoloSulDb);  */
			
			System.out.println();
			
			
			
//			Set<Articolo> articoliCategoria1 = new HashSet<Articolo>();
//			articoliCategoria1.add(articolo1);
//			articoliCategoria1.add(articolo2);
//			categoriaService.insertFinal(categoria1);
//			ordineService.deleteFinal(new Ordine("via mosca 3","paolo"));
			
//			Ordine cercaOrdine = new Ordine();
//			cercaOrdine.setIndirizzoSpedizione("via mosca 3");
//			List<Ordine>listaOrdini=ordineService.findByExampleFinal(cercaOrdine);
//			for(Ordine o:listaOrdini) {
//				System.out.println(o);
//			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
