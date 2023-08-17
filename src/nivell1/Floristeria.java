package nivell1;

import java.util.ArrayList;
import java.util.List;

public class Floristeria {

	private String nom;

	// private List<Producte> productes=new ArrayList<Producte>();

	private Stock stock= new Stock();;

	private List<Arbre> arbres = new ArrayList<Arbre>();

	private List<Flor> flors = new ArrayList<Flor>();

	private List<Decoracio> decoracio = new ArrayList<Decoracio>();

	private List<Compra> compres = new ArrayList<Compra>();

	private List<Venda> vendes = new ArrayList<Venda>();

	public Floristeria(String nom) {

		this.setNom(nom);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public <T> void addToList(List<T> list, T o) {
		list.add(o);
	}

	public <T> void removeFromList(List<T> list, T o) {
		list.remove(o);
	}

	public <T> void imprimirList(List<T> list) {
		list.forEach(System.out::println);
	}

	public List<Flor> getFlors() {
		return flors;
	}

	public List<Arbre> getArbres() {
		return arbres;
	}

	public List<Decoracio> getDecoracio() {
		return decoracio;
	}

	public void setDecoracio(List<Decoracio> decoracio) {
		this.decoracio = decoracio;
	}

	/*"""
	public void stock() {

		// Imprimeix per pantalla tots els arbres, flors i decoració que té la
		// floristeria.

	}
	"""*/

	public List<Compra> getCompres() {
		return compres;
	}

	public void setCompres(List<Compra> compres) {
		this.compres = compres;
	}

	public List<Venda> getVendes() {
		return vendes;
	}

	public void setVendes(List<Venda> vendes) {
		this.vendes = vendes;
	}

	public List<Producte> getProductes() {

		return stock.getProductes();
	}

	public void stockAmbQuantitats() {

	}

	public void valorTotalStock() {

	}

}
