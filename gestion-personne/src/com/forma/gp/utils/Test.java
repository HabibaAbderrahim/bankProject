package com.forma.gp.utils;

import java.sql.SQLException;

import com.forma.gp.dao.PersonneDao;
import com.forma.gp.entities.Personne;

public class Test {

	public static void main(String[] args) {

		PersonneDao personneDao = new PersonneDao();

		// Personne1
		/*
		 * Personne pers = new Personne("0213458", "Habiba", "Abd", "Tunis",
		 * "heub@gmail.com"); PersonneDao personneDao = new PersonneDao(); try {
		 * personneDao.save(pers); } catch (ClassNotFoundException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } catch (SQLException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 */
		// Personne2
		/*Personne pers0 = new Personne("0112458", "Hedi", "Ay", "Tunis", "hedi@gmail.com");
		try {
			personneDao.save(pers0);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		// Update personne1
		Personne pers = new Personne("0213458", "Habiba", "Abd", "Ariana", "heub@gmail.com");

		try {
			personneDao.update(pers);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Delete Personne2
		Personne pers0 = new Personne("0112458", "Hedi", "Ay", "Tunis", "hedi@gmail.com");
		try {
			personneDao.delete(pers0.getCin());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
