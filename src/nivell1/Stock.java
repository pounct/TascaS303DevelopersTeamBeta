package nivell1;

import java.util.ArrayList;
import java.util.List;

import entitats.Producte;
import entitats.Arbre;
import entitats.Decoracio;
import entitats.Flor;

public class Stock {

	private static List<Producte> productes = new ArrayList<Producte>();

	private static List<Arbre> arbres = new ArrayList<Arbre>();
	private static List<Flor> flors = new ArrayList<Flor>();
	private static List<Decoracio> decoracions = new ArrayList<Decoracio>();

	public static List<Producte> getProductes() {
		return productes;
	}

	public void setProductes(List<Producte> productes) {
		Stock.productes = productes;
	}

	public List<Arbre> getArbres() {
		return arbres;
	}

	public void setArbres(List<Arbre> arbres) {
		Stock.arbres = arbres;
	}

	public List<Flor> getFlors() {
		return flors;
	}

	public void setFlors(List<Flor> flors) {
		Stock.flors = flors;
	}

	public List<Decoracio> getDecoracions() {
		return decoracions;
	}

	public void setDecoracions(List<Decoracio> decoracions) {
		Stock.decoracions = decoracions;
	}

}
