<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Jugos </title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
		<link href="/css/estilos.css" rel="stylesheet">
	</head>
	<body>
		<div class="container mt-5">
			<div class="row">
				<h1 class="col-6">
					<strong> Jugos </strong>
				</h1>
				<a class="col-2" href="/jugos"> Jugos </a>
				<a class="col-2" href="/formulario/jugo"> Agregar jugo </a>
				<a class="col-2" href="/procesa/logout"> Logout </a>
			</div>
			<div class="row">
				<h1> ${jugo.nombre} - agregado por ${jugo.usuario.nombre} ${jugo.usuario.apellido}</h1>
			</div>
			<div class="row detalle-jugo">
				<div class="detalle">
					<div class="descripcion">
						<p class="detalle-titulo"> Descripción </p>
						<p> ${jugo.descripcion} </p>
					</div>
					<div class="ingredientes">
						<p class="detalle-titulo"> Ingredientes </p>
						<p> ${jugo.ingredientes} </p>
					</div>
					<div class="instrucciones">
						<p class="detalle-titulo"> Instrucciones </p>
						<p> ${jugo.instrucciones} </p>
					</div>
				</div>
				<div class="imagen">
					<img src="${jugo.urlImagen}" alt="${jugo.nombre}">
				</div>
			</div>
			<div class="row mt-2">
				<form action="/formulario/editar/jugo/${jugo.id}" method="GET">
					<button class="btn btn-primary">
						Editar
					</button>
				</form>
			</div>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>