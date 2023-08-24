package nivell1;

import java.lang.reflect.Field;
import java.util.ArrayList;

import entitats.Arbre;
import entitats.Decoracio;
import entitats.Decoracio.Material;
import entitats.Flor;
import entitats.Floristeria;
import entitats.Producte;

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
				else material = Material.FUSTA;

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
			break;
		}
		return null;
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
		elements.forEach(p -> Linies.add(p.toString()));
		ServeisData.writeLinies(Linies, fitxer);
	}

	public void saveProductes(ArrayList<Producte> productes) {

		String fitxer = "\\src\\nivell1\\database\\ProducteData.txt";
		saveData(productes, fitxer);
	}

	public void saveArbres() {

	}

	public void saveFlors() {

	}

	public void getArbres() {

	}

	public void getFlors() {

	}

	public void getDecoracions() {

	}

	public void saveDecoracions() {

	}

	public void getCompres() {

	}

	public void saveCompres() {

	}

	public void getVendes() {

	}

	public void saveVendes() {

	}

	public void getLiniesCompres() {

	}

	public void saveLiniesCompres() {

	}

	public void getLiniesVendes() {

	}

	public void saveLiniesVendes() {

	}

	public void getFloristeria() {

	}

	public static void saveFloristeria(Floristeria floristeria) {

		String fitxer = ".\\src\\nivell1\\database\\FloristeriaData.txt";
		String linia = floristeria.toString();

		ServeisData.writeLinia(linia, fitxer);

	}

}
