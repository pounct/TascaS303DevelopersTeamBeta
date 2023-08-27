package nivell1;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import entitats.Floristeria;
import entitats.Indexacio;
import entitats.Producte;

public class Main {
	/*
	 * Amb gestió de percistància en un fitxer TXT.
	 */
	static Indexacio indexacio;
	EntitatsData entitatsData;
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean onProgram = true;
		Byte opcion;
		while (onProgram) {
			menuPrincipal();
			opcion = sc.nextByte();
			sc.nextLine();
			switch (opcion) {
			case 1:
				// 1.Crear Floristeria.
				// initialtzar Indexacio
				indexacio = new Indexacio(0, 0, 0, 0, 0, 0);
				crearFloristeria(indexacio);
				//System.out.println(indexacio);
				break;
			case 2:
				// 2.Afegir Arbre.
				if (indexacio!=null) {
					afegirArbre(indexacio);
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;
			case 10:

				break;
			case 11:

				break;
			case 12:

				break;
			case 13:

				break;
			case 0:
				onProgram=false;
				System.out.println("      Fin de programe.");
				break;

			default:
				break;
			}
		}

		// 1.Crear Floristeria.
		// initialtzar Indexacio
		indexacio = new Indexacio(0, 0, 0, 0, 0, 0);
		crearFloristeria(indexacio);

		

		// 3.Afegir Flor.
		afegirFlor();

		// 4.Afegir Decoració.
		afegirDecoracio();

		// Stock: Imprimeix per pantalla tots els arbres, flors i decoració que té la
		// floristeria.
		// 5.Stock
		imprimirStock(Stock.getProductes());

		// 6.Retirar arbre.
		retirarArbre();

		// 7.Retirar flor.
		retirarFlor();

		// 8.Retirar decoració.
		retirarDecoracio();

		// Printar per pantalla stock amb quantitats.
		// 9.Stock Amb Quantitats
		imprimirStockQuantitats(Stock.getProductes());

		// Printar per pantalla valor total de la floristeria.
		// 10.Valor Stock // Valor Compres // ValorVendes
		imprimirValorStock(Stock.getProductes());

		// Crear tickets de compra amb múltiples objectes.
		// 11.Compra amb múltiples objectes
		ticketsCompra();

		// Mostrar una llista de compres antigues.
		// 12.Compres Antigues.
		mostrarCompres();

		// Visualitzar el total de diners guanyats amb totes les vendes.*/
		// 13.diners guanyats
		// Vendes
		visualitzarTotalGuanyats();

	}

	private static void visualitzarTotalGuanyats() {
		// TODO Auto-generated method stub

	}

	public static void menuPrincipal() {
		System.out.println(" 1.Crear Floristeria.");
		System.out.println(" 2.Afegir Arbre.");
		System.out.println(" 3.Afegir Flor.");
		System.out.println(" 4.Afegir Decoració.");
		System.out.println(" 5.Stock");
		System.out.println(" 6.Retirar arbre.");
		System.out.println(" 7.Retirar flor.");
		System.out.println(" 8.Retirar decoració.");
		System.out.println(" 9.Stock Amb Quantitats");
		System.out.println(" 10.Valor Stock // Valor Compres // ValorVendes");
		System.out.println(" 11.Compra amb múltiples objectes");
		System.out.println(" 12.Compres Antigues.");
		System.out.println(" 13.diners guanyats");
		System.out.println(" 0.fin");

	}

	private static void mostrarCompres() {
		// TODO Auto-generated method stub

	}

	private static void ticketsCompra() {
		// TODO Auto-generated method stub

	}

	private static void imprimirValorStock(List<Producte> productes) {
		// TODO Auto-generated method stub

	}

	private static void imprimirStockQuantitats(List<Producte> productes) {
		// TODO Auto-generated method stub

	}

	private static void retirarDecoracio() {
		// TODO Auto-generated method stub

	}

	private static void retirarFlor() {
		// TODO Auto-generated method stub

	}

	private static void retirarArbre() {
		// TODO Auto-generated method stub

	}

	private static void imprimirStock(List<Producte> productes) {
		// TODO Auto-generated method stub

	}

	public static void afegirDecoracio() {
		// TODO Auto-generated method stub

	}

	public static void afegirFlor() {
		// TODO Auto-generated method stub

	}

	public static void afegirArbre(Indexacio indexacio) {
		int producteId =indexacio.getIndexProducte();
		int compraId =indexacio.getIndexCompra();
		int liniaId =indexacio.getIndexLiniaCompra();
		Date dateC= new Date(System.currentTimeMillis());
		System.out.println("designacio : ");
		String nom = sc.nextLine();
		System.out.println("preu de compra : ");
		double preu = sc.nextDouble();
		sc.nextLine();
		Producte producte = new Producte();

	}

	public static void crearFloristeria(Indexacio indexacio) {
		
		//sc = new Scanner(System.in);
		System.out.println("Crear Floristeria.\n");
		FloristeriaGestion floristeriaGestion = new FloristeriaGestion();
		floristeriaGestion.setIndexacio(indexacio);
		Floristeria floristeria = new Floristeria();

		System.out.println("nom : ");
		String nom = sc.nextLine();
		// floristeriaGestion.setNom(nom);
		floristeria.setId(indexacio.getIndexCompra());
		floristeria.setNom(nom);

		System.out.println("guardar la floristeria a la base de dades...");

		floristeriaGestion.save(floristeria);

		System.out.println("floristeria guardada.");

	}

}
