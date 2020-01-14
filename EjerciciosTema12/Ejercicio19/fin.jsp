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
	<% double dinero = Double.parseDouble(request.getParameter("dinero")); %>
	
	<div class="contenido">
		
		<h2>¡Enhorabuena, has ganado <%= dinero %>€!</h2>
		
		<form method="post" action="index.jsp">
			<input type="submit" value="Volver a jugar">
		</form>
	</div>
</body>
</html>