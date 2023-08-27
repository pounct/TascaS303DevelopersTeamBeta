package entitats;

public class Floristeria {

	private int id;
	private String nom;

	public Floristeria() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return id + "\t" + nom;
	}
	
	public Floristeria fromString(String linia) {
		String[] campos = linia.split("\t");
		this.setId(Integer.parseInt(campos[0]));
		this.setNom(campos[1]);
		return this;
	}
	

}
