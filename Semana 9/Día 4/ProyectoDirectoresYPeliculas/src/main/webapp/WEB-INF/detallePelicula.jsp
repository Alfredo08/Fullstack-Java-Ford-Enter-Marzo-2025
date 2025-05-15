<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Películas y directores </title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
		<link href="/css/estilos.css" rel="stylesheet">
	</head>
	<body>
		<div class="container mt-5">
			<div class="row">
				<h1 class="col-8"> Detalle película </h1>
				<form class="col-4" action="/peliculas" method="GET">
					<button class="btn btn-secondary">
						Volver a películas
					</button>
				</form>
			</div>
			<div class="row">
				<div class="col-6 tarjeta-pelicula">
					<h3> ${pelicula.titulo} </h3>
					<img class="imagen-pelicula" src="${pelicula.imagen}" alt="${pelicula.titulo}" >
					<p> Año: ${pelicula.anio} </p>
					<p> Director: ${pelicula.director.nombre} ${pelicula.director.apellidos} </p>
					<p> Descripción: ${pelicula.descripcion} </p>
					<form action="/eliminar/pelicula/${pelicula.id}" method="POST">
						<input type="hidden" name="_method" value="DELETE" >
						<button class="btn btn-danger">
							Eliminar
						</button>
					</form>
				</div>
			</div>
		</div>
		
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>