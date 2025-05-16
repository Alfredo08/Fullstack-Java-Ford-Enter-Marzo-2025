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
		<div class="container mt-5">
			<div class="row">
				<h1 class="col-6"> Editar película </h1>
				<form class="col-3" action="/peliculas" method="GET">
					<button class="btn btn-secondary">
						Volver a listado completo
					</button>
				</form>
				<form class="col-3" action="/cerrar/sesion" method="POST">
					<button class="btn btn-secondary">
						Cerrar sesión
					</button>
				</form>
			</div>
			<div class="row">
				<form:form class="col-6" action="/editar/pelicula/${pelicula.id}" method="POST" modelAttribute="pelicula">
					<input type="hidden" name="_method" value="PUT">
					<div>
						<form:label path="titulo" class="form-label">
							Título:
						</form:label>
						<form:input path="titulo" class="form-control"/>
						<form:errors path="titulo" class="alert alert-danger d-block mt-2" role="alert"/>
					</div>
					<div>
						<form:label path="imagen" class="form-label">
							Url a la imagen:
						</form:label>
						<form:input path="imagen" class="form-control"/>
						<form:errors path="imagen" class="alert alert-danger d-block mt-2" role="alert"/>
					</div>
					<div>
						<form:label path="descripcion" class="form-label">
							Descripción:
						</form:label>
						<form:input path="descripcion" class="form-control"/>
						<form:errors path="descripcion" class="alert alert-danger d-block mt-2" role="alert"/>
					</div>
					<div>
						<form:label path="anio" class="form-label">
							Año:
						</form:label>
						<form:input path="anio" class="form-control"/>
						<form:errors path="anio" class="alert alert-danger d-block mt-2" role="alert"/>
					</div>
					<button class="btn btn-primary mt-2">
						Editar
					</button>
				</form:form>
			</div>
		</div>
		
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>