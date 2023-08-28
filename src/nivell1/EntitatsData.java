package nivell1;

import java.util.ArrayList;

import entitats.Arbre;
import entitats.Compra;
import entitats.Decoracio;
import entitats.Flor;
import entitats.Floristeria;
import entitats.Indexacio;
import entitats.LiniaCompra;
import entitats.LiniaVenda;
import entitats.Producte;
import entitats.Venda;

public class EntitatsData {

	private Floristeria floristeria;
	private ArrayList<Arbre> arbres;
	private ArrayList<Compra> compres;
	private ArrayList<Decoracio> decoracions;
	private ArrayList<Flor> flors;
	private ArrayList<Floristeria> floristeries;
	private ArrayList<Indexacio> indexacions;
	private ArrayList<LiniaCompra> liniesCompres;
	private ArrayList<LiniaVenda> liniesVendes;
	private ArrayList<Producte> productes;
	private ArrayList<Venda> vendes;

	public EntitatsData(Floristeria floristeria) {

		this.floristeria = floristeria;
	}

	public ArrayList<Arbre> getArbres() {
		this.arbres = Persistencia.getData("Arbre");
		return this.arbres;
	}

	public ArrayList<Compra> getCompres() {
		this.compres = Persistencia.getData("Compra");
		return this.compres;
	}

	public ArrayList<Decoracio> getDecoracions() {
		this.decoracions = Persistencia.getData("Decoracio");
		return this.decoracions;
	}

	public ArrayList<Flor> getFlors() {
		this.flors = Persistencia.getData("Flor");
		return this.flors;
	}

	public ArrayList<Floristeria> getFloristeries() {
		this.floristeries = Persistencia.getData("Floristeria");
		return this.floristeries;
	}

	public ArrayList<Indexacio> getIndexacions() {
		this.indexacions = Persistencia.getData("Indexacio");
		return this.indexacions;
	}

	public ArrayList<LiniaCompra> getLiniesCompres() {
		this.liniesCompres = Persistencia.getData("LiniaCompra");
		return this.liniesCompres;
	}

	public ArrayList<LiniaVenda> getLiniesVendes() {
		this.liniesVendes = Persistencia.getData("LiniaVenda");
		return this.liniesVendes;
	}

	public ArrayList<Producte> getProductes() {
		this.productes = Persistencia.getData("Producte");
		return this.productes;
	}

	public ArrayList<Venda> getVendes() {
		this.vendes = Persistencia.getData("Venda");
		return this.vendes;
	}

	public void setArbres(ArrayList<Arbre> arbres) {
		this.arbres = arbres;
		Persistencia.saveData(this.arbres, "Arbre");
	}

	public void setCompres(ArrayList<Compra> compres) {
		this.compres = compres;
		Persistencia.saveData(this.arbres, "Compra");
	}

	public void setDecoracions(ArrayList<Decoracio> decoracions) {
		this.decoracions = decoracions;
		Persistencia.saveData(this.arbres, "Decoracio");
	}

	public void setFlors(ArrayList<Flor> flors) {
		this.flors = flors;
		Persistencia.saveData(this.arbres, "Flor");
	}

	public void setFloristeries(ArrayList<Floristeria> floristeries) {
		this.floristeries = floristeries;
		Persistencia.saveData(this.arbres, "Floristeria");
	}

	public void setIndexacions(ArrayList<Indexacio> indexacions) {
		this.indexacions = indexacions;
		Persistencia.saveData(this.arbres, "Indexacio");
	}

	public void setLiniesCompres(ArrayList<LiniaCompra> liniesCompres) {
		this.liniesCompres = liniesCompres;
		Persistencia.saveData(this.arbres, "LiniaCompra");
	}

	public void setLiniesVendes(ArrayList<LiniaVenda> liniesVendes) {
		this.liniesVendes = liniesVendes;
		Persistencia.saveData(this.arbres, "LiniaVenda");
	}

	public void setProductes(ArrayList<Producte> productes) {
		this.productes = productes;
		Persistencia.saveData(this.arbres, "Producte");
	}

	public void setVendes(ArrayList<Venda> vendes) {
		this.vendes = vendes;
		Persistencia.saveData(this.arbres, "Venda");
	}

	public void saveEntitatsData(String nomFloristeria) {

		Persistencia.saveData(this.arbres, "Arbre");
		Persistencia.saveData(this.arbres, "Compra");
		Persistencia.saveData(this.arbres, "Decoracio");
		Persistencia.saveData(this.arbres, "Flor");
		Persistencia.saveData(this.arbres, "Floristeria");
		Persistencia.saveData(this.arbres, "Indexacio");
		Persistencia.saveData(this.arbres, "LiniaCompra");
		Persistencia.saveData(this.arbres, "LiniaVenda");
		Persistencia.saveData(this.arbres, "Producte");
		Persistencia.saveData(this.arbres, "Venda");

	}

	public EntitatsData loadEntitatsData(String nomFloristeria) {
		this.arbres = getArbres();
		this.compres = getCompres();
		this.decoracions = getDecoracions();
		this.flors = getFlors();
		this.floristeries = getFloristeries();
		this.indexacions = getIndexacions();
		this.liniesCompres = getLiniesCompres();
		this.liniesVendes = getLiniesVendes();
		this.productes = getProductes();
		this.vendes = getVendes();
		return this;
	}

	public Floristeria getFloristeria() {
		return floristeria;
	}

	public void setFloristeria(Floristeria floristeria) {
		this.floristeria = floristeria;
	}

}
