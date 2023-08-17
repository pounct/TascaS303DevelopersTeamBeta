package nivell1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
	
	private Date date = new Date();
	
	private List<Producte> productes=new ArrayList<Producte>();
	
	private List<Arbre> arbres=new ArrayList<Arbre>();
	
	private List<Flor> flors=new ArrayList<Flor>();
	
	private List<Decoracio> decoracio=new ArrayList<Decoracio>();
	
	

	public Compra(Date date, List<Producte> productes) {
		
		this.date = date;
		this.productes = productes;
	}

	public Compra(Date date, List<Arbre> arbres, List<Flor> flors, List<Decoracio> decoracio) {
	
		this.date = date;
		this.arbres = arbres;
		this.flors = flors;
		this.decoracio = decoracio;
	}

	public Compra() {
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	/*public void addProducte(List<Producte> list, Producte producte) {
		list.add(producte);
	}
	
	public void removeProducte(List<Producte> list, Producte producte) {
		list.remove(producte);
	}*/
	
	public void addArbre(Arbre arbre) {
		this.arbres.add(arbre);
	}
	
	public void addFlor(Flor flor) {
		this.flors.add(flor);
	}
	
	public void addDecoracio(Decoracio decoracio) {
		this.decoracio.add(decoracio);
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

	@Override
	public String toString() {
		return "Compra \n[date=" + date + ", \narbres=\n\t" + arbres + ", \nflors=\n\t" + flors + ", \ndecoracio=\n\t" + decoracio + "]";
	}
	
	
	

}
