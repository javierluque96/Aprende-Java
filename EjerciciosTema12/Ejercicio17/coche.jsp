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
		<div class="container">
			<%
			String color = request.getParameter("color");
			String material = request.getParameter("material");
			
			if (material.equals("carbono") && color.equals("berenjena")) {
			  out.print("<img src=\"imagenes/berenjenacarbono.jpg\"");
			} else if (material.equals("madera") && color.equals("berenjena")) {
			  out.print("<img src=\"imagenes/berenjenamadera.jpg\"");
			} else if (material.equals("carbono") && color.equals("blanco")) {
			  out.print("<img src=\"imagenes/blancocarbono.jpg\"");
			} else if (material.equals("madera") && color.equals("blanco")) {
			  out.print("<img src=\"imagenes/blancomadera.jpg\"");
			} else if (material.equals("carbono") && color.equals("negro")) {
			  out.print("<img src=\"imagenes/negrocarbono.jpg\"");
			} else if (material.equals("madera") && color.equals("negro")) {
			  out.print("<img src=\"imagenes/negromadera.jpg\"");
			}
			
			
			%>
		</div>
	</div>
</body>
</html>