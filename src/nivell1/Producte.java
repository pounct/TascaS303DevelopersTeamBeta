package nivell1;

public abstract class Producte {
	
	protected static int index = 0;
	protected int id;
	protected String designacio;
	protected double preu;
	protected double preuCompra;	
	
	

	public Producte() {
		
		this.id = index;
		index++;
	}

	public Producte(String designacio, double preu, double preuCompra) {
		
		this.id = index;
		index++;
		this.designacio = designacio;
		this.preu = preu;
		this.preuCompra = preuCompra;
	}	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignacio() {
		return designacio;
	}

	public void setDesignacio(String designacio) {
		this.designacio = designacio;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	public double getPreuCompra() {
		return preuCompra;
	}

	public void setPreuCompra(double preuCompra) {
		this.preuCompra = preuCompra;
	}
}
