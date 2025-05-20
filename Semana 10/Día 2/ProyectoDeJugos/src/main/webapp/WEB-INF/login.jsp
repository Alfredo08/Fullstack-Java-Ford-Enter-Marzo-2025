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
		<link href="css/estilos.css" rel="stylesheet">
	</head>
	<body>
		<div class="container mt-5">
			<div class="row">
				<h1 class="col-8">
					<strong> Jugos </strong>
				</h1>
				<a class="col-2" href="/login"> Login </a>
				<a class="col-2" href="/registro"> Registro </a>
			</div>
			<div class="row">
				<h1> Login </h1>
			</div>
			<div class="row">
				<form:form class="col-6" action="/procesa/login" method="POST" modelAttribute="loginUsuario">
					<div>
						<form:label path="correo" class="form-label">
							Correo:
						</form:label>
						<form:input path="correo" class="form-control"/>
						<form:errors path="correo" class="alert alert-danger d-block mt-2" role="alert"/>
					</div>
					<div>
						<form:label path="contrasenia" class="form-label">
							Contraseña:
						</form:label>
						<form:input path="contrasenia" type="password" class="form-control"/>
						<form:errors path="contrasenia" class="alert alert-danger d-block mt-2" role="alert"/>
					</div>
					<button class="btn btn-primary mt-2">
						Login
					</button>
				</form:form>
			</div>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>