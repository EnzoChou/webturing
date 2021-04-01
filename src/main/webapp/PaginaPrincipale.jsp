<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rubrica</title>
</head>
<body>
	<p>JSP TEST</p>
	<div align="center">
		<h1>Rubrica</h1>
		<table border="1" style="width:80%" id="table">
			<tr>
				<th>Nome</th>
				<th>Cognome</th>
				<th>Telefono</th>
			</tr>
			<c:forEach var="persona" items="${listaPersone}">
				<tr>
					<td align="center"><c:out value="${persona.nome}" /></td>
					<td align="center"><c:out value="${persona.cognome}" /></td>
					<td align="center"><c:out value="${persona.telefono}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div>
		<table>
		<tr>
		<th><button type="button">nuovo</button></th>
		<th><button type="button">modifica</button></th>
		<th><button type="button">elimina</button></th>
		</tr>
		</table>
	</div>
</body>
</html>