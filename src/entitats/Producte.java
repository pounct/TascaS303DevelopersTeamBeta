package entitats;

public abstract class Producte {
	
	protected int id;
	protected String designacio;

	public Producte() {
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

}
