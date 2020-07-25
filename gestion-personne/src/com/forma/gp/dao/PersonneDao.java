package com.forma.gp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.forma.gp.entities.Personne;
import com.forma.gp.utils.ConnexionUtil;

public class PersonneDao {

	public void save(Personne personne) throws ClassNotFoundException, SQLException {

		String sql = "insert into personne(cin,nom,prenom,adresse,email) values(?,?,?,?,?)";
		PreparedStatement statement = ConnexionUtil.getInstance().getConnection().prepareStatement(sql);
		statement.setString(1, personne.getCin());
		statement.setString(2, personne.getNom());
		statement.setString(3, personne.getPrenom());
		statement.setString(4, personne.getAdresse());
		statement.setString(5, personne.getEmail());

		statement.executeUpdate();
	}

	public void update(Personne personne) throws ClassNotFoundException, SQLException {

		String sql = "update personne set nom=? ,prenom=? , adresse=? , email =? where cin = ?";
		PreparedStatement statement = ConnexionUtil.getInstance().getConnection().prepareStatement(sql);
		statement.setString(5, personne.getCin());
		statement.setString(1, personne.getNom());
		statement.setString(2, personne.getPrenom());
		statement.setString(3, personne.getAdresse());
		statement.setString(4, personne.getEmail());

		statement.executeUpdate();

	}

	public void delete(String cin) throws ClassNotFoundException, SQLException {

		String sql = "delete from personne where cin = ?";
		PreparedStatement statement = ConnexionUtil.getInstance().getConnection().prepareStatement(sql);
		statement.setString(1, cin);

		statement.executeUpdate();

	}

	public List<Personne> findAll() throws ClassNotFoundException, SQLException {

		String sql = "select * from personne";
		PreparedStatement statement = ConnexionUtil.getInstance().getConnection().prepareStatement(sql);
		// ResultSet like table
		ResultSet result = statement.executeQuery();
		List<Personne> list = new ArrayList<>();
		// Add person in our return list
		while (result.next()) {

			// a chaque fois objet jdid
			Personne personne = new Personne();
			personne.setCin(result.getString("cin"));
			personne.setNom(result.getString("nom"));
			personne.setPrenom(result.getString("prenom"));
			personne.setAdresse(result.getString("adresse"));
			personne.setEmail(result.getString("email"));

			list.add(personne);
		}
		return list;

	}

	public List<Personne> findByCin(String cin) throws ClassNotFoundException, SQLException {

		String sql = "select * from personne where cin = ? ";
		PreparedStatement statement = ConnexionUtil.getInstance().getConnection().prepareStatement(sql);
		// ? bech bech ylawej
		statement.setString(1, cin);
		// ResultSet like table
		ResultSet result = statement.executeQuery();
		List<Personne> list = new ArrayList<>();

		// Add person in our return list
		while (result.next()) {

			Personne personne = new Personne();
			personne.setCin(result.getString("cin"));
			personne.setNom(result.getString("nom"));
			personne.setPrenom(result.getString("prenom"));
			personne.setAdresse(result.getString("adresse"));
			personne.setEmail(result.getString("email"));

			list.add(personne);
		}
		return list ;
	}

	public List<Personne> findByEmail(String email) throws ClassNotFoundException, SQLException {

		String sql = "select * from personne where email = ? ";
		PreparedStatement statement = ConnexionUtil.getInstance().getConnection().prepareStatement(sql);
		statement.setString(1, email);
		// ResultSet like table
		ResultSet result = statement.executeQuery();
		List<Personne> list = new ArrayList<>();
		// Add person in our return list
		while (result.next()) {

			Personne personne = new Personne();
			personne.setCin(result.getString("cin"));
			personne.setNom(result.getString("nom"));
			personne.setPrenom(result.getString("prenom"));
			personne.setAdresse(result.getString("adresse"));
			personne.setEmail(result.getString("email"));

			list.add(personne);
		}
		return list;

	}

	// surcharge
	public List<Personne> findByEmail(String email, String cin) throws ClassNotFoundException, SQLException {

		String sql = "select * from personne where email = ? and cin=? ";
		PreparedStatement statement = ConnexionUtil.getInstance().getConnection().prepareStatement(sql);
		statement.setString(1, email);
		statement.setString(2, cin);
		// ResultSet like table
		ResultSet result = statement.executeQuery();
		List<Personne> list = new ArrayList<>();
		// Add person in our return list
		while (result.next()) {

			Personne personne = new Personne();
			personne.setCin(result.getString("cin"));
			personne.setNom(result.getString("nom"));
			personne.setPrenom(result.getString("prenom"));
			personne.setAdresse(result.getString("adresse"));
			personne.setEmail(result.getString("email"));

			list.add(personne);
		}
		return list;

	}
}
