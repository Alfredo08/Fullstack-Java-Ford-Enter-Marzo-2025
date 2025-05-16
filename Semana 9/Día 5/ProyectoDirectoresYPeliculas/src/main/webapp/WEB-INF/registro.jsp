<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

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
				<h1 class="col-8"> Registro </h1>
				<form class="col-4" action="/login" method="GET">
					<button class="btn btn-secondary">
						Ir a login
					</button>
				</form>
			</div>
			<div class="row">
				<form:form class="col-6" action="/agregar/director" method="POST" modelAttribute="director">
					<div>
						<form:label path="nombre" class="form-label">
							Nombre:
						</form:label>
						<form:input path="nombre" class="form-control"/>
						<form:errors path="nombre" class="alert alert-danger d-block mt-2" role="alert"/>
					</div>
					<div>
						<form:label path="apellidos" class="form-label">
							Apellidos:
						</form:label>
						<form:input path="apellidos" class="form-control"/>
						<form:errors path="apellidos" class="alert alert-danger d-block mt-2" role="alert"/>
					</div>
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
					<div>
						<form:label path="confirmarContrasenia" class="form-label">
							Confirmar contraseña:
						</form:label>
						<form:input path="confirmarContrasenia" type="password" class="form-control"/>
						<form:errors path="confirmarContrasenia" class="alert alert-danger d-block mt-2" role="alert"/>
					</div>
					<button class="btn btn-success mt-2">
						Registrar
					</button>
				</form:form>
			</div>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>