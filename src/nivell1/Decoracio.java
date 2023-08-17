package nivell1;

public class Decoracio extends Producte{
	
	public enum Material {
		  FUSTA,
		  PLASTIC
		}
	private Material material;
	
	public Decoracio() {
		super();
	}


	public Decoracio( String designacio, double preu, double preuCompra, Material material) {
		super(designacio,preu, preuCompra);
		this.material = material;
	}


	public Material getMaterial() {
		return material;
	}


	public void setMaterial(Material material) {
		this.material = material;
	}


	@Override
	public String toString() {
		return "Decoracio [material=" + material + ", preu=" + preu + ", id=" + id + "]";
	}
}
