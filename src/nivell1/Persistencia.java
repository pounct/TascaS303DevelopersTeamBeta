package nivell1;

import java.lang.reflect.Field;
import java.util.ArrayList;

import entitats.Arbre;
import entitats.Compra;
import entitats.Decoracio;
import entitats.Decoracio.Material;
import entitats.Flor;
import entitats.Floristeria;
import entitats.LiniaCompra;
import entitats.LiniaVenda;
import entitats.Producte;
import entitats.Venda;

public class Persistencia {

	public void LoadData() {

	}

	public void updateData() {

	}

	public <T> ArrayList<T> getData(String nomClasse, String fitxer) {

		ArrayList<T> elements = new ArrayList<>();
		ArrayList<String> Linies = new ArrayList<>();
		Linies = ServeisData.readLinies(fitxer);
		elements = stringToClasse(Linies, nomClasse);

		return elements;

	}

	public <T> ArrayList<T> stringToClasse(ArrayList<String> linies, String nomClasse) {

		switch (nomClasse) {
		case "Producte":
			return (ArrayList<T>) stringToProductes(linies);
		case "Arbre":
			ArrayList<Arbre> arbres = new ArrayList<>();
			Arbre arbre = new Arbre();
			for (String linia : linies) {
				String[] campos = linia.split(" ");
				arbre.setId(Integer.parseInt(campos[0]));
				arbre.setAlcada(Float.parseFloat(campos[1]));
				arbres.add(arbre);
			}
			return (ArrayList<T>) arbres;
		case "Flor":
			ArrayList<Flor> flors = new ArrayList<>();
			Flor flor = new Flor();
			for (String linia : linies) {
				String[] campos = linia.split(" ");
				flor.setId(Integer.parseInt(campos[0]));
				flor.setColor(campos[1]);
				flors.add(flor);
			}
			return (ArrayList<T>) flors;
		case "Decoracio":
			ArrayList<Decoracio> decoracions = new ArrayList<>();
			Decoracio decoracio = new Decoracio();
			for (String linia : linies) {
				String[] campos = linia.split(" ");
				Material material;
				if (campos[1].toLowerCase().equals("plastic"))
					material = Material.PLASTIC;
				else
					material = Material.FUSTA;

				decoracio.setId(Integer.parseInt(campos[0]));
				decoracio.setMaterial(material);
				decoracions.add(decoracio);
			}
			return (ArrayList<T>) decoracions;
		case "LiniaCompra":

			break;
		case "LiniaVenda":

			break;
		case "Compra":

			break;
		case "Venda":

			break;
		case "Floristeria":

			break;

		default:
			System.out.println("error en nom de classe");
			break;
		}
		return null;
	}

	public ArrayList<Producte> stringToProductes(ArrayList<String> linies) {
		
		ArrayList<Producte> productes = new ArrayList<>();
		Producte producte = new Producte();
		for (String linia : linies) {
			String[] campos = linia.split(" ");
			producte.setId(Integer.parseInt(campos[0]));
			producte.setDesignacio(campos[1]);
			productes.add(producte);
		}
		return productes;
		
	}

	// ArrayList<T>

	/*
	 * public ArrayList<Producte> getProductes() { Producte p = new Producte();
	 * getData(new Producte(), String fitxer)
	 * 
	 * }
	 */

	public <T> void saveData(ArrayList<T> elements, String fitxer) {

		ArrayList<String> Linies = new ArrayList<>();
		elements.forEach((element) -> Linies.add(element.toString()));
		ServeisData.writeLinies(Linies, fitxer);
	}

	public void saveProductes(ArrayList<Producte> productes) {

		String fitxer = "\\src\\nivell1\\database\\ProducteData.txt";
		saveData(productes, fitxer);

	}

	public void saveArbres(ArrayList<Arbre> arbres) {
		String fitxer = "\\src\\nivell1\\database\\ArbreData.txt";
		saveData(arbres, fitxer);
	}

	public void saveFlors(ArrayList<Flor> flors) {
		String fitxer = "\\src\\nivell1\\database\\FlorData.txt";
		saveData(flors, fitxer);
	}

	public void saveDecoracions(ArrayList<Decoracio> decoracions) {
		String fitxer = "\\src\\nivell1\\database\\DecoracioData.txt";
		saveData(decoracions, fitxer);

	}

	public void saveCompres(ArrayList<Compra> compres) {
		String fitxer = "\\src\\nivell1\\database\\CompraData.txt";
		saveData(compres, fitxer);

	}

	public void saveVendes(ArrayList<Venda> vendes) {
		String fitxer = "\\src\\nivell1\\database\\VendaData.txt";
		saveData(vendes, fitxer);
	}

	public void saveLiniesCompres(ArrayList<LiniaCompra> LiniesCompres) {
		String fitxer = "\\src\\nivell1\\database\\LiniaCompraData.txt";
		saveData(LiniesCompres, fitxer);

	}

	public static void saveFloristeria(Floristeria floristeria) {

		String fitxer = ".\\src\\nivell1\\database\\FloristeriaData.txt";
		String linia = floristeria.toString();

		ServeisData.writeLinia(linia, fitxer);

	}

	public void saveLiniesVendes(ArrayList<LiniaVenda> liniesVendes) {
		String fitxer = "\\src\\nivell1\\database\\LiniaVendaData.txt";
		saveData(liniesVendes, fitxer);
	}

	public void getArbres() {

	}

	public void getFlors() {

	}

	public void getDecoracions() {

	}

	public void getCompres() {

	}

	public void getVendes() {

	}

	public void getLiniesCompres() {

	}

	public void getLiniesVendes() {

	}

	public void getFloristeria() {

	}

}
