<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />


</head>
<body>

	<form action="personneCtr" method="get">

		<TABLE border="1">
			<THEAD>
				<tr>
					<th>CIN</th>
					<th>Nom</th>
					<th>Prénom</th>
					<th>Adresse</th>
					<th>Email</th>
					<th colspan="2">operation</th>
				</tr>
			</THEAD>

			<TBODY>

				<c:forEach items="${list}" var="i">

					<tr>
						<td>${i.cin}</td>
						<!-- entity -->
						<td>${i.nom}</td>
						<td>${i.prenom}</td>
						<td>${i.adresse}</td>
						<td>${i.email}</td>
						
						<!--  -->
						<td><A href="personneCtr?action=delete&cin=${i.cin}">supprimer</A></td>
						<td><A> Editer </A></td>





					</tr>

				</c:forEach>


			</TBODY>
		</TABLE>




	</form>



</body>
</html>