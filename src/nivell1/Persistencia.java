package nivell1;

import java.util.ArrayList;

import entitats.Floristeria;
import entitats.Producte;

public class Persistencia {

	public void LoadData() {

	}

	public void updateData() {

	}

	public <T> ArrayList<T>  getData(T elem, String fitxer) {
		ArrayList<T> elements = new ArrayList<>();
		ArrayList<String> Linies = new ArrayList<>();		
		Linies = ServeisData.readLinies(fitxer);
		Linies.forEach(l -> {
			//elements.add(elem.stringTo(l));
		});
		return elements;
		
	}

	/*public ArrayList<Producte> getProductes() {
		Producte p = new Producte();
		 getData(new Producte(), String fitxer)

	}*/

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
