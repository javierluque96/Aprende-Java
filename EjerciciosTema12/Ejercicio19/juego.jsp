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
		<%
		String[] imagen = {"calavera.png", "gato.gif", "limon.jpg"};
		int aleatorio = (int)(Math.random() * 3);
		double dinero = Double.parseDouble(request.getParameter("dinero"));
		
		out.print("<img src=\"imagenes/" + imagen[aleatorio] + "\">");
		
		if (aleatorio == 0) {
		  out.print("<p>Lo siento, has perdido todo tu dinero.</p>");
		  dinero = 0;
		} else if (aleatorio == 1) {
		  out.print("<p>¡Enhorabuena, tu dinero se multiplica por dos!</p>");
		  dinero *= 2;
		} else {
		  out.print("<p>Lo siento, has perdido la mitad de tu dinero.</p>");
		  dinero /= 2;
		}
		
		
		
		if (dinero > 0) {
		  out.print("<p>Ahora tinenes " + dinero + "€</p>"); %>
			<form method="post" action="juego.jsp">
				<input type="hidden" name="dinero" value=<%= dinero %>>
				<input type="submit" value="Seguir jugando">
			</form>
			
			<form method="post" action="fin.jsp">
				<input type="hidden" name="dinero" value=<%= dinero %>>
				<input type="submit" value="Plantarse">
			</form>
		<% } else {  %>
			<form method="post" action="index.jsp">
				<input type="submit" value="Volver a jugar">
			</form>
		<% } %>
		
		
		
	</div>
</body>
</html>