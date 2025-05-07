<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Dashboard </title>
	</head>
	<body>
		<h1> Bienvenid@ de vuelta ${nombreCompleto} </h1>
		<form action="/procesa/cerrar-sesion" method="POST">
			<button>
				Cerrar sesión
			</button>
		</form>
	</body>
</html>