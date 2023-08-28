package nivell1;

import java.util.ArrayList;
import java.util.List;

import entitats.Arbre;
import entitats.Compra;
import entitats.Decoracio;
import entitats.Flor;
import entitats.Floristeria;
import entitats.Indexacio;
import entitats.Venda;

public class FloristeriaGestion {

	// gestion floristeria
	private Floristeria floristeria;
	private ArrayList<Floristeria> floristeries;
	private EntitatsData entitatsData;
	// gestion indexacio
	
	private Indexacio indexacio;
	// gestion producte
	private List<Arbre> arbres;
	private List<Flor> flors = Stock.getFlors();
	private List<Decoracio> decoracio = Stock.getDecoracions();
	// gestion Stock
	private Stock stock;
	//stock.setArbres(Stock.getArbres());
	private List<Compra> compres = new ArrayList<Compra>();
	private List<Venda> vendes = new ArrayList<Venda>();
	//////
	private ArrayList<Indexacio> indexacions;
	//////

	public FloristeriaGestion() {
		floristeries = Persistencia.getData("Floristeria");
	}
	
	public <T> void addToList(List<T> list, T o) {
		list.add(o);
	}
	public <T> void removeFromList(List<T> list, T o) {
		list.remove(o);
	}

	public <T>  void imprimirList(List<T> list) {
		for(T t :list) {System.out.println(t);}
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public void setFloristeries(ArrayList<Floristeria> floristeries) {
		this.floristeries = floristeries;
	}

	public ArrayList<Floristeria> getFloristeries() {
		return floristeries;
	}

	public void setFloristeries(Floristeria[] floristeries) {
		//this.floristeries = floristeries;
	}

	public Indexacio[] getIndexacions() {
		return null;
		//return indexacions;
	}

	public void setIndexacions(ArrayList<Indexacio> indexacions) {
		this.indexacions = indexacions;
	}

	public Floristeria getFloristeria() {
		return floristeria;
	}
	public void setFloristeria(Floristeria floristeria) {
		
		
	}
	
	public void loadFloristeria(Floristeria floristeria) {
		if (floristeries.contains(floristeria)) {
			entitatsData.loadEntitatsData(floristeria.getNom());
			arbres=entitatsData.getArbres();
		}
		this.floristeria = floristeria;
		this.setIndexacions(Persistencia.getData("Indexacio"));
		this.indexacio=indexacions.get(0);
		this.setArbres(Persistencia.getData("arbre"));
	}
	
	
	
	
	

	public List<Arbre> getArbres() {
		return  Stock.getArbres();
	}

	public void setArbres(List<Arbre> arbres) {
		Stock.setArbres(arbres);
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

	public void save(Floristeria floristeria) {
		Persistencia.saveFloristeria(floristeria);
	}

	public Indexacio getIndexacio() {
		return indexacio;
	}

	public void setIndexacio(Indexacio indexacio) {
		this.indexacio = indexacio;
	}

	/*
	 * public void inicialitzarIndexacio() { this.indexacio = indexacio; }
	 */
	@Override
	public String toString() {
		return "FloristeriaGestion [arbres=" + arbres + ", flors=" + flors + ", decoracio=" + decoracio + ", compres="
				+ compres + ", vendes=" + vendes + "]";
	}

	// funcionalitats:

}
