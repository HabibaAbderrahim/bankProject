package com.forma.gp.utils;

import java.sql.SQLException;

import com.forma.gp.dao.PersonneDao;
import com.forma.gp.entities.Personne;

public class Test {

	public static void main(String[] args)  {
		
		Personne pers = new Personne("0213458", "Habiba", "Abd", "Tunis", "heub@gmail.com");
		PersonneDao personneDao = new PersonneDao();
		try {
			personneDao.save(pers);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
