<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Apuesta y Gana</title>
<link href="estilo.css" type="text/css" rel="stylesheet">
</head>
<body>
	<div class="contenido">
		<h1>Apuesta y gana</h1>
		<form method="post" action="juego.jsp">
			Introduce la cantidad que quieres apostar:
			<input type="number" min="1" name="dinero">€<br>
			<input type="submit" value="Probemos suerte">
		</form>
	</div>
</body>
</html>