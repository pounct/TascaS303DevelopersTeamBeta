package entitats;

import java.sql.Date;

public class Venda {

	private int id;
	private Date date;

	public Venda() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return id + " " + date;
	}
}
