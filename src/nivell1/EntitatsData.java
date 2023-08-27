package nivell1;

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
	
	private Arbre[] arbres;
	private Compra[] compres;
	private Decoracio[] decoracions;
	private Flor[] flors;
	private Floristeria[] floristeries;
	private Indexacio[] indexacions;
	private LiniaCompra[] liniesCompres;
	private LiniaVenda[] liniesVendes;
	private Producte[] productes;
	private Venda[] vendes;
	
	
	
	public EntitatsData() {
		super();
	}


	

	public Arbre[] getArbres() {
		return arbres;
	}




	public Compra[] getCompres() {
		return compres;
	}




	public Decoracio[] getDecoracions() {
		return decoracions;
	}




	public Flor[] getFlors() {
		return flors;
	}




	public Floristeria[] getFloristeries() {
		return floristeries;
	}




	public Indexacio[] getIndexacions() {
		return indexacions;
	}




	public LiniaCompra[] getLiniesCompres() {
		return liniesCompres;
	}




	public LiniaVenda[] getLiniesVendes() {
		return liniesVendes;
	}




	public Producte[] getProductes() {
		return productes;
	}




	public Venda[] getVendes() {
		return vendes;
	}




	public EntitatsData loadEntitatsData(String nomFloristeria) {
		this.arbres=getArbres();
		this.compres=getCompres();
		this.decoracions=getDecoracions();
		this.flors=getFlors();
		this.floristeries=getFloristeries();		
		this.indexacions=getIndexacions();
		this.liniesCompres=getLiniesCompres();
		this.liniesVendes=getLiniesVendes();
		this.productes=getProductes();
		this.vendes=getVendes();
		return this;
	}
	

}
