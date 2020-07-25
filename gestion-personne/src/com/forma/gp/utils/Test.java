package com.forma.gp.utils;

import java.sql.SQLException;
import java.util.List;

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
		/*
		 * Personne pers0 = new Personne("0112458", "Hedi", "Ay", "Tunis",
		 * "hedi@gmail.com"); try { personneDao.save(pers0); } catch
		 * (ClassNotFoundException e1) { // TODO Auto-generated catch block
		 * e1.printStackTrace(); } catch (SQLException e1) { // TODO Auto-generated
		 * catch block e1.printStackTrace(); }
		 */
		// personne3
		/*
		 * Personne pers3 = new Personne("0213457", "Hiba", "Ald",
		 * "Tunis","hiba@gmail.com"); try { personneDao.save(pers3); } catch
		 * (ClassNotFoundException e1) { // TODO Auto-generated catch block
		 * e1.printStackTrace(); } catch (SQLException e1) { // TODO Auto-generated
		 * catch block e1.printStackTrace(); }
		 */
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

		// Delete Personne2
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

		// findall
		/*
		 * try { List<Personne> list=personneDao.findAll(); for(Personne p : list) {
		 * System.out.println(p); } } catch (ClassNotFoundException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } catch (SQLException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */
		// findbycin

		/*try {
			List<Personne> list = personneDao.findByCin("0213457");
			for (Personne p : list) {
				System.out.println(p);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		// findbyemail
		try {
			List<Personne> list = personneDao.findByEmail("heub@gmail.com");
			for (Personne p : list) {
				System.out.println(p);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// findByemail and cin
		try {
			List<Personne> list = personneDao.findByEmail("hiba@gmail.com", "0213457");
			for (Personne p : list) {
				System.out.println(p);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
