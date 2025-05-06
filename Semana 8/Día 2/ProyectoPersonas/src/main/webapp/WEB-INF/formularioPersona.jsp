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
		<h1> Formulario para agregar una persona a la lista </h1>
		<form action="/agregar/persona" method="POST">
			<div>
				<label for="nombre"> Nombre: </label>
				<input name="nombre" id="nombre" type="text">
			</div>
			<div>
				<label for="apellido"> Apellido: </label>
				<input name="apellido" id="apellido" type="text">
			</div>
			<button> Agregar </button>
		</form>
		
		<a href="/personas"> Volver a la lista completa </a>
	</body>
</html>



