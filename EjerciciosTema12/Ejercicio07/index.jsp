<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Conversor</title>
<link rel="stylesheet" type="text/css" href="estilo.css">
</head>
<body>
	<div class="wrapper">
		<h1>conversor de monedas</h1>
		<hr>
		<form class="dinero" method="post" action="resultado.jsp">
		  CANTIDAD<br><input type="number" min="0" step="0.01" name="cantidad"><br><br>
		  <input type="radio" name="cambio" value="eurosEnPesetas" checked="checked"> Euros a Pesetas
		  <br><br>
		  <input type="radio" name="cambio" value="pesetasEnEuros"> Pesetas a Euros<br><br>
		  <input type="submit" value="Convertir">
		</form>
	</div>

</body>
</html>