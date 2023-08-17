package nivell2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import nivell1.Arbre;
import nivell1.Producte;

public class serveis {

	public List<Producte> findByDesignacio(String paraula) {

		List<Producte> productes = new ArrayList<Producte>();
		try {

			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/dbfloristeria";
			String dbuser = "root";
			String dbpw = "";
			Connection connexio = DriverManager.getConnection(dburl, dbuser, dbpw);

			String consulta = "SELECT * FROM productes WHERE designacio like ?";
			PreparedStatement ps = connexio.prepareStatement(consulta);
			ps.setString(1, paraula);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Producte p = new Arbre(0, 0, 0);
				/*
				 * p.setId p.setDesi p.setPreu p.setPreuC
				 */
				productes.add(p);
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return null;

	}

}
