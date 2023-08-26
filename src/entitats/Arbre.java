package entitats;

public class Arbre extends Producte {

	private int id;
	private float alcada; // alçada

	public Arbre() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getAlcada() {
		return alcada; // cm
	}

	public void setAlcada(float alcada) {
		this.alcada = alcada;
	}

	@Override
	public String toString() {
		return id + " " + designacio + " " + alcada;
	}

}
