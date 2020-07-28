package com.forma.gp.services;

import java.sql.SQLException;
import java.util.List;

import com.forma.gp.dao.PersonneDao;
import com.forma.gp.entities.Personne;
import com.forma.gp.model.MessageResponse;

public class PersonneService {

	public PersonneDao personneDao = new PersonneDao();

	public MessageResponse save(Personne personne) throws ClassNotFoundException, SQLException {

		// pour verifier sans existance avant de lenregistrer
		Personne pers = personneDao.findByCin(personne.getCin());
		if (pers != null) {
			return new MessageResponse(false, "CIN existant !!!");
		}

		List<Personne> list = personneDao.findByEmail(personne.getEmail());
		if (!list.isEmpty()) {
			return new MessageResponse(false, "Email existant");
		}
		personneDao.save(personne);
		return new MessageResponse(true, "Operation effectuée avec succées");

	}

	public MessageResponse update(Personne personne) throws ClassNotFoundException, SQLException {

		List<Personne> list = personneDao.findByEmail(personne.getEmail(), personne.getCin());

		if (list.isEmpty()) {
			
			list = personneDao.findByEmail(personne.getEmail());
		    if (list.isEmpty()) {
			return new MessageResponse(false, "Email existant");
		}
			
			
			
			}
		personneDao.update(personne);
		return new MessageResponse(true, "Operation update effectuée avec succées");

		}
		


	public MessageResponse delete(String cin) throws ClassNotFoundException, SQLException {
		
        //Tester sans existance
		Personne pers = personneDao.findByCin(cin);

		if (cin == null) {
			return new MessageResponse(false, "CIN INTROUVABLE !!!");

		}
		personneDao.delete(cin);
		return new MessageResponse(true, "Supprimm avec succés ");

	}

	public List<Personne> findAll() throws ClassNotFoundException, SQLException {
		return personneDao.findAll();

	}

	public Personne findByCin(String cin) throws ClassNotFoundException, SQLException {
		return personneDao.findByCin(cin);
	}

}
