package com.forma.gp.utils;

import java.sql.SQLException;

import com.forma.gp.dao.PersonneDao;
import com.forma.gp.entities.Personne;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Personne pers = new Personne("0213458", "Habiba", "Abd", "Tunis", "heub@gmail.com");
		PersonneDao personneDao = new PersonneDao();
		personneDao.save(pers);
	}

}
