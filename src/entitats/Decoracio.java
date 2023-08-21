package entitats;

public class Decoracio extends Producte {

	public enum Material {
		FUSTA, PLASTIC
	}

	private Material material;

	public Decoracio() {
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
}
