package nivell1;

public class Main {

	public static void main(String[] args) {

		//Crear Floristeria.
		Floristeria floristeria= new Floristeria("floristeria 1");
		// Afegir Arbre.
		Arbre arbre1 = new Arbre(0, 0, 0);
		Arbre arbre2 = new Arbre(1, 2, 3);
		floristeria.addToList(floristeria.getArbres(), arbre1);
		// Afegir Flor.
		Flor flor1= new Flor(null, 6, 3, null);
		floristeria.addToList(floristeria.getFlors(), flor1);
		// Afegir Decoració.
		Decoracio decoracio1= new Decoracio( null, 2, 0, Decoracio.Material.PLASTIC);
		Decoracio decoracio2= new Decoracio(null, 2, 0, Decoracio.Material.FUSTA);
		floristeria.addToList(floristeria.getDecoracio(), decoracio1);
		
		//Stock: Imprimeix per pantalla tots els arbres, flors i decoració que té la floristeria.
		floristeria.getProductes();
		
		
		// Retirar arbre.
		floristeria.removeFromList(floristeria.getArbres(), arbre1);
		// Retirar flor.
		floristeria.removeFromList(floristeria.getFlors(), flor1);
		// Retirar decoració.
		floristeria.removeFromList(floristeria.getDecoracio(), decoracio1);
		
		// Printar per pantalla stock amb quantitats.
		floristeria.stockAmbQuantitats();
		
		
		// Printar per pantalla valor total de la floristeria.
		floristeria.valorTotalStock();
				
		// Crear tickets de compra amb múltiples objectes.
		Compra compra1=new Compra();
		compra1.addArbre(arbre1);
		compra1.addArbre(arbre2);
		compra1.addFlor(flor1);
		compra1.addDecoracio(decoracio1);
		compra1.addDecoracio(decoracio2);
		System.out.println(compra1);
		
		// Mostrar una llista de compres antigues.
		
		// Visualitzar el total de diners guanyats amb totes les vendes.
		
		
	}

}
