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
		statement.setString(0, personne.getCin());
		statement.setString(1, personne.getNom());
		statement.setString(2, personne.getPrenom());
		statement.setString(3, personne.getAdresse());
		statement.setString(4, personne.getEmail());

		statement.executeUpdate();
	}

	public void update(Personne personne) {

	}

	public void delete(String cin) {

	}

	public List<Personne> findAll() {
		return null;

	}
}
