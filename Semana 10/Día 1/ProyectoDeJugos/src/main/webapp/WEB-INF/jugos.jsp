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
				<a class="col-2" href=""> Logout </a>
			</div>
			<div class="row">
				<h1> Bienvenid@ de vuelta ${nombre} </h1>
			</div>
			<div class="row contenedor-jugos">
				<c:forEach items="${listaJugos}" var="jugo">
					<div class="jugo">
						<h2> ${jugo.nombre} </h2>
						<img class="imagen-jugo" src="${jugo.urlImagen}" alt="${jugo.nombre}">
						<div class="row">
							<form class="col-6" method="GET">
								<button class="btn btn-primary">
									Detalle
								</button>
							</form>
							<form class="col-6" method="POST">
								<input type="hidden" name="_method" value="DELETE">
								<button class="btn btn-danger">
									Eliminar
								</button>
							</form>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>