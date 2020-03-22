<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Máquina de helados</title>
<link href="estilo.css" type="text/css" rel="stylesheet">
</head>
<body>
	<div class="main">
		<h1>Máquina de helados</h1>
		
		<p>Seleccione los porcentajes para preparar un helado a su gusto.</p>
		
		<form method="post" action="helado.jsp">
			<div class="contenedor">
				<div class="sabor">
					<img src="imagenes/chocolate.jpg" alt="chocolate"><br>
					Chocolate: <input type="number" value=0 min="0" max="100" name="chocolate">%
				</div>
				<div class="sabor">
					<img src="imagenes/fresa.jpg" alt="fresa"><br>
					Fresa: <input type="number" value=0 min="0" max="100" name="fresa">%
				</div>
				<div class="sabor">
					<img src="imagenes/vainilla.jpg" alt="vainilla"><br>
					Vainilla: <input type="number" value=0 min="0" max="100" name="vainilla">%
				</div>
			</div>
			<input type="submit" value="Preparar helado">
		</form>
		
		<div class="error">
			<p>
				<%=
					session.getAttribute("error") == null ? "" : session.getAttribute("error")
				%>
				
				<% session.removeAttribute("error"); %>
			</p>
		</div>
	</div>
</body>
</html>