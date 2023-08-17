package nivell1;

public class Arbre  extends Producte{
	
	
	private float alcada; // alçada
	
	public Arbre() {
	}

	public Arbre(String designacio, double preu, double preuCompra, float alcada) {
		super(designacio, preu, preuCompra);
		this.alcada = alcada;
	}

	public Arbre(double preu, float alcada, double preuCompra) {
		this.alcada = alcada;
	}

	@Override
	public String toString() {
		return "Arbre [alcada=" + alcada + ", preu=" + preu + ", id=" + id + "]";
	}
}
