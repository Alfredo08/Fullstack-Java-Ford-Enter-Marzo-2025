<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Formulario Persona </title>
	</head>
	<body>
		<h1> Proporciona tus datos </h1>
		<form action="/procesa/informacion" method="POST">
			<div>
				<label for="nombre">
					Nombre:
				</label>
				<input id="nombre" name="nombre" type="text">
				<span> ${errorNombre} </span>
			</div>
			<div>
				<label for="apellidoPaterno">
					Apellido paterno:
				</label>
				<input id="apellidoPaterno" name="apellidoPaterno" type="text">
				<span> ${errorApellidoPaterno} </span>
			</div>
			<div>
				<label for="apellidoMaterno">
					Apellido materno:
				</label>
				<input id="apellidoMaterno" name="apellidoMaterno" type="text">
				<span> ${errorApellidoMaterno} </span>
			</div>
			<button>
				Enviar
			</button>
		</form>
	</body>
</html>