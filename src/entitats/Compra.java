package entitats;

import java.sql.Date;

public class Compra {

	private int id;
	private Date date;

	public Compra() {
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

}
