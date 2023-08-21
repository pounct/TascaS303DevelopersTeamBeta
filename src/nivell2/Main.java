package nivell2;

import entitats.Floristeria;
import entitats.Arbre;

import java.sql.Date;

import entitats.Compra;
import entitats.Decoracio;
import entitats.Decoracio.Material;
import entitats.Flor;
import entitats.Producte;

public class Main {

	public static void main(String[] args) {
		
		ServeisORM sorm= new ServeisORM();

		// Crear Floristeria.	
		Floristeria floristeria = new Floristeria();
		
		// Crear Floristeria en la base de datos.
		//sorm.addFloristeria("floristeria 1");
		
		floristeria = sorm.getFloristeriaById(1);
		System.out.println(floristeria.getId()+"  "+floristeria.getNom());
		floristeria = sorm.getFloristeriaByName("floristeria 1");
		System.out.println(floristeria.getId()+"  "+floristeria.getNom());
		
		// Afegir Arbre.
		// Afegir Flor.
		// Afegir Decoració.
		// les entrades provenen de les compres
		Compra compra1= new Compra();
		compra1.setDate(Date.valueOf("2022-09-04"));
		
		// Crear compra1 en la base de datos.
		sorm.addCompra(compra1);
		
		// Afegir Arbre.
		// afegir una línia de compra Arbre 
		Arbre pArbre1=new Arbre();
		pArbre1.setDesignacio("prod Arbre1");
		pArbre1.setAlcada(120);		
		// Crear pArbre1 en la base de datos.
		sorm.addProducte(pArbre1);		
		// Crear una lineaCompra de compra1  en la base de datos.		
		// addLineaCompra(Compra c,Producte p,double preu)
		sorm.addLineaCompra(compra1,pArbre1,25);
		
		// Afegir Flor.
		// afegir una línia de compra Flor
		Flor pFlor1=new Flor();
		pFlor1.setColor("rosa");
		pFlor1.setDesignacio("prodFlor1");
		// Crear pFlor1 en la base de datos.
		sorm.addProducte(pFlor1);
		sorm.addLineaCompra(compra1,pFlor1,15);
		
		// Afegir Decoració.
		// afegir una línia de compra Decoració
		Decoracio decoracio1 = new Decoracio();
		decoracio1.setDesignacio("prodDecoracio1");
		decoracio1.setMaterial(Material.FUSTA);
		//sorm.addProducte(pDecoracio1);

	}

}

