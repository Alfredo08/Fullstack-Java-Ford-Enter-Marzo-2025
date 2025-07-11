<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Películas y directores </title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
		<link href="css/estilos.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<div class="row">
				<h1> Editar película </h1>
			</div>
			<div>
			<form:form action="/editar/pelicula/${pelicula.id}" method="POST" modelAttribute="pelicula">
				<input type="hidden" name="_method" value="PUT">
				<div>
					<form:label path="titulo">
						Título:
					</form:label>
					<form:input path="titulo" />
					<form:errors path="titulo" />
				</div>
				<div>
					<form:label path="imagen">
						Url a la imagen:
					</form:label>
					<form:input path="imagen" />
					<form:errors path="imagen" />
				</div>
				<div>
					<form:label path="descripcion">
						Descripción:
					</form:label>
					<form:input path="descripcion" />
					<form:errors path="descripcion" />
				</div>
				<div>
					<form:label path="anio">
						Año:
					</form:label>
					<form:input path="anio" />
					<form:errors path="anio" />
				</div>
				<div>
					<form:label path="director">
						Director:
					</form:label>
					<form:input path="director" />
					<form:errors path="director" />
				</div>
				<button>
					Editar
				</button>
			</form:form>
			<form action="/peliculas" method="GET">
				<button class="btn btn-primary">
					Volver a listado completo
				</button>
			</form>
		</div>
		
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>