<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Jugos </title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
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
				<h1> Agregar jugo </h1>
			</div>
			<div class="row">
				<form:form class="col-6" action="/agregar/jugo" method="POST" modelAttribute="jugo">
					<div>
						<form:label path="nombre" class="form-label">
							Nombre:
						</form:label>
						<form:input path="nombre" class="form-control"/>
						<form:errors path="nombre" class="alert alert-danger d-block mt-2" role="alert"/>
					</div>
					<div>
						<form:label path="descripcion" class="form-label">
							Descripción:
						</form:label>
						<form:textarea path="descripcion" class="form-control"/>
						<form:errors path="descripcion" class="alert alert-danger d-block mt-2" role="alert"/>
					</div>
					<div>
						<form:label path="ingredientes" class="form-label">
							Ingredientes:
						</form:label>
						<form:textarea path="ingredientes" class="form-control"/>
						<form:errors path="ingredientes" class="alert alert-danger d-block mt-2" role="alert"/>
					</div>
					<div>
						<form:label path="instrucciones" class="form-label">
							Instrucciones:
						</form:label>
						<form:textarea path="instrucciones"  class="form-control"/>
						<form:errors path="instrucciones" class="alert alert-danger d-block mt-2" role="alert"/>
					</div>
					<div>
						<form:label path="urlImagen" class="form-label">
							URL a la imagen:
						</form:label>
						<form:input path="urlImagen" type="text" class="form-control"/>
						<form:errors path="urlImagen" class="alert alert-danger d-block mt-2" role="alert"/>
					</div>
					<button class="btn btn-primary mt-2">
						Agregar
					</button>
				</form:form>
			</div>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>