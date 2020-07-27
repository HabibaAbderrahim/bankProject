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

	<form action="personneCtr" method="post">

		<TABLE>
			<tr>
				<td>CIN</td>
				<td><INPUT type="text" name="cin"  /></td>
			</tr>

			<tr>
				<td>Nom</td>
				<td><INPUT type="text" name="nom" /></td>
			</tr>

			<tr>
				<td>Prénom</td>
				<td><INPUT type="text" name="prenom" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><INPUT type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Adresse</td>
				<td><INPUT type="text" name="adresse" /></td>
			</tr>
			<tr>
				<td><INPUT type="submit" value="valider" /></td>
				<td><INPUT type="reset" value="Annuler" />
			</tr>
		</TABLE>



	</form>



</body>
</html>