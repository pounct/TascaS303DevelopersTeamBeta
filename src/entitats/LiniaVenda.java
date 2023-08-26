package entitats;

public class LiniaVenda {

	private int id;
	private int vendaId;
	private int producteId;
	private double preu;
	

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

	@Override
	public String toString() {
		return id + "\t" + vendaId + "\t" + producteId + "\t" + preu;
	}

	
}
