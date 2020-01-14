<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Coche</title>
<link href="estilo.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="contenido">
		<h1>Visualizador de coches</h1>
		<form method="post" action="coche.jsp">
			Color de la tapicería:<br>
			<input type="radio" name="color" value="blanco">Blanco<br>
			<input type="radio" name="color" value="negro">Negro<br>
			<input type="radio" name="color" value="berenjena">Berenjena<br>
			
			Material de las molduras:<br>
			<input type="radio" name="material" value="madera">Madera<br>
			<input type="radio" name="material" value="carbono">Carbono<br>
			<input type="submit" value="Visualizar coche">
		</form>
	</div>
</body>
</html>