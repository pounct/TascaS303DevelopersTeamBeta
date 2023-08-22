package nivell1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import entitats.Producte;
import entitats.Arbre;
import entitats.Flor;
import entitats.Decoracio;
import entitats.Compra;
import entitats.Venda;

public class ServeisTXT {

	public void writeProducte(Producte p) {
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter("\\src\\database\\ProducteData.txt", true));
			writer.write(p.getId() + " " + p.getDesignacio() + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void writeArbre(Arbre a) {
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter("\\src\\database\\ArbreData.txt", true));
			writer.write(a.getId() + " " + a.getAlcada() + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void writeFlor(Flor f) {
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter("\\src\\database\\FlorData.txt", true));
			writer.write(f.getId() + " " + f.getColor() + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void writeDecoracio(Decoracio d) {
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter("\\src\\database\\DecoracioData.txt", true));
			writer.write(d.getId() + " " + d.getMaterial() + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void writeCompra(Compra c) {
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter("\\src\\database\\CompraData.txt", true));
			writer.write(c.getId() + " " + c.getDate() + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void writeVenda(Venda v) {
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter("\\src\\database\\VendaData.txt", true));
			writer.write(v.getId() + " " + v.getDate() + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void writeLiniaCompra(Producte p, Compra c, double preu) {
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter("\\src\\database\\LiniaCompraData.txt", true));
			writer.write(p.getId() + " " + c.getId() + preu + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void writeLiniaVenda(Producte p, Compra c, double preu) {
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter("\\src\\database\\LiniaVendaData.txt", true));
			writer.write(p.getId() + " " + c.getId() + preu + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
