package entitats;

public class LiniaVenda {

	private int id;
	private double preu;
	private int vendaId;
	private int producteId;

	public LiniaVenda() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	public int getVendaId() {
		return vendaId;
	}

	public void setVendaId(int vendaId) {
		this.vendaId = vendaId;
	}

	public int getProducteId() {
		return producteId;
	}

	public void setProducteId(int producteId) {
		this.producteId = producteId;
	}

	
}
