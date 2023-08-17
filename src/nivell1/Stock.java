package nivell1;

import java.util.ArrayList;
import java.util.List;

public class Stock {

	//private List<Producte> productes=new ArrayList<Producte>();

	private List<Arbre> arbres = new ArrayList<Arbre>();

	private List<Flor> flors = new ArrayList<Flor>();

	private List<Decoracio> decoracio = new ArrayList<Decoracio>();

	public Stock() {
		
	}

	public Stock(List<Arbre> arbres, List<Flor> flors, List<Decoracio> decoracio) {
		
		this.arbres = arbres;
		this.flors = flors;
		this.decoracio = decoracio;
	}

	public List<Arbre> getArbres() {
		return arbres;
	}

	public void setArbres(List<Arbre> arbres) {
		this.arbres = arbres;
	}

	public List<Flor> getFlors() {
		return flors;
	}

	public void setFlors(List<Flor> flors) {
		this.flors = flors;
	}

	public List<Decoracio> getDecoracio() {
		return decoracio;
	}

	public void setDecoracio(List<Decoracio> decoracio) {
		this.decoracio = decoracio;
	}
	
	
	public List<Producte> getProductes() {
		List<Producte> productes=new ArrayList<Producte>();
		productes.addAll(arbres);
		productes.addAll(flors);
		productes.addAll(decoracio);
		return productes;
	}
	
	

}
