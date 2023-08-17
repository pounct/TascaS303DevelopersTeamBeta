package nivell1;

public class Flor  extends Producte{

	private String color;
	

	public Flor() {
	}

	public Flor(String designacio,double preu, double preuCompra, String color) {
		super(designacio, preu, preuCompra);
		this.color = color;
	}
	
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Flor [color=" + color + ", preu=" + preu + ", id=" + id + "]";
	}
	
	
}
