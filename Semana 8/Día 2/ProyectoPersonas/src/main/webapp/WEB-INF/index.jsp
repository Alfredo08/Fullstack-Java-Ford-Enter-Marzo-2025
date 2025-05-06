<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Lista de personas</title>
		<link rel="stylesheet" href="css/index.css">
	</head>
	<body>
		<h1> Lista de personas </h1>
		<ul>
			<c:forEach var="persona" items="${personas}">
				<li> ${persona} </li>
			</c:forEach>
		</ul>
		
		<div>
			<a href="/formulario/persona"> Agregar una persona nueva </a>
		</div>
		
		<img src="${imagen}" alt="carro">
		<img src="img/Mia.png" alt="Gatita cálico">
		
	</body>
</html>



