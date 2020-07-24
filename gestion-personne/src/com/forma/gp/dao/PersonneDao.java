package com.forma.gp.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
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

	public List<Personne> findAll() {
		return null;

	}
}
