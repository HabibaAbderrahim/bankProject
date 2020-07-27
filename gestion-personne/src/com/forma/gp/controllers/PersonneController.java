package com.forma.gp.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Dispatch;

import com.forma.gp.entities.Personne;
import com.forma.gp.services.PersonneService;

@WebServlet("/personneCtr")

public class PersonneController extends HttpServlet {

	private Personne personne = new Personne();
	private PersonneService personneService = new PersonneService();
	private RequestDispatcher dispatcher;// page(navigation)

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cin = req.getParameter("cin");// jibli w hez
		String email = req.getParameter("email");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String adresse = req.getParameter("adresse");

		personne = new Personne(cin, nom, prenom, adresse, email);
		try {
			
			personneService.save(personne);
			dispatcher = req.getRequestDispatcher("/AddPerson.jsp");
			dispatcher.forward(req, resp);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

}
