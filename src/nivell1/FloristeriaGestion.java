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

	private Floristeria floristeria;
	private Indexacio indexacio;

	private List<Arbre> arbres = Stock.getArbres();
	private List<Flor> flors = Stock.getFlors();
	private List<Decoracio> decoracio = Stock.getDecoracions();

	private List<Compra> compres = new ArrayList<Compra>();
	private List<Venda> vendes = new ArrayList<Venda>();

	public FloristeriaGestion() {
	}

	public Floristeria getFloristeria() {
		return floristeria;
	}

	public void setFloristeria(Floristeria floristeria) {
		this.floristeria = floristeria;
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
