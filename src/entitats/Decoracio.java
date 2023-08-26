package entitats;

public class Decoracio extends Producte {

	private int id;

	public enum Material {
		FUSTA, PLASTIC
	}

	private Material material;

	public Decoracio() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return id + " " + designacio + " " + material;
	}
}
