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
		
		this.floristeria=floristeria;
	}

	public ArrayList<Arbre> getArbres() {
		arbres=Persistencia.getData("Arbre");
		return arbres;
	}

	public ArrayList<Compra> getCompres() {
		return Persistencia.getData("Compra");
	}

	public ArrayList<Decoracio> getDecoracions() {
		return Persistencia.getData("Decoracio");
	}

	public ArrayList<Flor> getFlors() {
		return Persistencia.getData("Flor");
	}

	public ArrayList<Floristeria> getFloristeries() {
		return Persistencia.getData("Floristeria");
	}

	public ArrayList<Indexacio> getIndexacions() {
		return Persistencia.getData("Indexacio");
	}

	public ArrayList<LiniaCompra> getLiniesCompres() {
		return Persistencia.getData("LiniaCompra");
	}

	public ArrayList<LiniaVenda> getLiniesVendes() {
		return Persistencia.getData("LiniaVenda");
	}

	public ArrayList<Producte> getProductes() {
		return Persistencia.getData("Producte");
	}

	public ArrayList<Venda> getVendes() {
		return Persistencia.getData("Venda");
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
