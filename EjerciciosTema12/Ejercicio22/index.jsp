<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pedido</title>
<link href="estilo.css" type="text/css" rel="stylesheet">
</head>
<body>
	<h1>Pide la comida más sana a domicilio</h1>
	
	<form method="post" action="pedido.jsp">
		<div class="contenedor">
			<div class="pedido">
				<img src="imagenes/hamburguesa.png" alt="hamburguesa"><br>
				Hamburguesa vegetariana<br><input type="number" value=0 name="comida0">
			</div>
			<div class="pedido">
				<img src="imagenes/pasta.png" alt="Pasta al pesto"><br>
				Pasta al pesto<br><input type="number" value=0 name="comida1">
			</div>
			<div class="pedido">
				<img src="imagenes/pizza.png" alt="Pizza caprese"><br>
				Pizza caprese<br><input type="number" value=0 name="comida2">
			</div>
			<div class="pedido">
				<img src="imagenes/quinoa.png" alt="Quinoa con verduras"><br>
				Quinoa con verduras<br><input type="number" value=0 name="comida3">
			</div>
		</div>
		<div class="contenedor">
			<div class="pedido">
				<img src="imagenes/agua.png" alt="Agua"><br>
				Agua<br><input type="number" value=0 name="comida4">
			</div>
			<div class="pedido">
				<img src="imagenes/cerveza.png" alt="Cerveza"><br>
				Cerveza<br><input type="number" value=0 name="comida5">
			</div>
			<div class="pedido">
				<img src="imagenes/refresco.png" alt="Refresco"><br>
				Refresco<br><input type="number" value=0 name="comida6">
			</div>
		</div>
		<input type="submit" value="Hacer pedido">
	</form>
	
</body>
</html>