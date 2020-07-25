package com.forma.gp.services;

import java.sql.SQLException;
import java.util.List;

import com.forma.gp.dao.PersonneDao;
import com.forma.gp.entities.Personne;
import com.forma.gp.model.MessageResponse;

public class PersonneService {

	// where im getting my methods
	private PersonneDao personneDao = new PersonneDao();

	public MessageResponse save(Personne personne) throws ClassNotFoundException, SQLException {
		// find by cin To test existance
		// personne houwa eli ntesti 3lih
		Personne pers = personneDao.findByCin(personne.getCin());

		if (pers != null) {
			return new MessageResponse(false, "CIN existant !!!");
		}

		// find by email To Test existance
		List<Personne> list = personneDao.findByEmail(personne.getEmail());
		if (!list.isEmpty()) {
			return new MessageResponse(false, "Email existant");

		}

		personneDao.save(personne);
		return new MessageResponse(true, "Operation effectuée avec succées");

	}

}
