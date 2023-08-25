package nivell1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitats.Arbre;
import entitats.Compra;
import entitats.Decoracio;
import entitats.Flor;
import entitats.Floristeria;
import entitats.LiniaCompra;
import entitats.LiniaVenda;
import entitats.Producte;
import entitats.Venda;

public class Main {

	public static void main(String[] args) {
		List<Producte> productes = new ArrayList<Producte>();

		List<Arbre> arbres = new ArrayList<Arbre>();
		List<Flor> flors = new ArrayList<Flor>();
		List<Decoracio> decoracions = new ArrayList<Decoracio>();
		
		ArrayList<LiniaCompra> liniesCompres = new ArrayList<>();
		ArrayList<LiniaVenda> liniesVendes = new ArrayList<>();
		
		ArrayList<Compra> compres = new ArrayList<>();
		ArrayList<Venda> vendes = new ArrayList<>();
		
		ArrayList<Floristeria> floristeries = new ArrayList<>();
		
		


		
		// gestiona la persistència en fitxer TXT.
		/**/
		
		// funcionalitats:

		// 1.Crear Floristeria.
		crearFloristeria();

		// Afegir Arbre.
		afegirArbre();

		// Afegir Flor.
		afegirFlor();

		// Afegir Decoració.
		afegirDecoracio();
		
		//Stock: Imprimeix per pantalla tots els arbres, flors i decoració que té la floristeria.
		imprimirStock(Stock.getProductes());
		
		// Retirar arbre.
		retirarArbre();

		// Retirar flor.
		retirarFlor();
		
		// Retirar decoració.
		retirarDecoracio();

		// Printar per pantalla stock amb quantitats.
		imprimirStockQuantitats(Stock.getProductes());
		
		
		
		// Printar per pantalla valor total de la floristeria.
		imprimirValorStock(Stock.getProductes());
		
				
		// Crear tickets de compra amb múltiples objectes.
		ticketsCompra();
		
		// Mostrar una llista de compres antigues.
		mostrarCompres();
		
		// Visualitzar el total de diners guanyats amb totes les vendes.*/
		visualitzarTotalVendes();
		
	}

	private static void visualitzarTotalVendes() {
		// TODO Auto-generated method stub
		
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

	public static void afegirArbre() {
		//compraId =?
		//dateCompra=?
		//liniaCompraId=?
		// preu=?
		// alcada=?
		Scanner sc = new Scanner(System.in);
		System.out.println("afegir Arbre");
		System.out.println("compraId:");
		int compraId=sc.nextInt();
		/*
		if(compres.get(compraId)!=null) {
			
		}else {Compra compra=new Compra();}*/
		System.out.println("DateCompra:");
		System.out.println("liniaCompraId:");
		System.out.println("preu");
		System.out.println("alcada:");
		
		
		
	}

	public static void crearFloristeria() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Crear Floristeria.");
		Floristeria floristeria = new Floristeria();
		
		System.out.println("nom : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("nom : ");
		String nom = sc.nextLine();
		floristeria.setId(id);
		floristeria.setNom(nom);
		
		System.out.println("Desa la floristeria a la base de dades...");
		Persistencia.saveFloristeria(floristeria);
		
	}

}
