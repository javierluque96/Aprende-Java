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
	<%
		int chocolate = Integer.parseInt(request.getParameter("chocolate"));
		int fresa = Integer.parseInt(request.getParameter("fresa"));
		int vainilla = Integer.parseInt(request.getParameter("vainilla"));
		
		int vacio = 100 - (chocolate + fresa + vainilla);
		
		if (chocolate + fresa + vainilla > 100) {
			session.setAttribute("error", "La suma de los porcentajes debe ser menor o igual que 100. "
					+ "<br>Por favor, introduzca de nuevo los porcentajes.");
			response.sendRedirect("index.jsp");
		} else {
	%>
	
	<h1>¡Aquí tiene su helado!</h1>
	<div class="contenedor helado">
		<div class="tarrina">
			<div style="height: <%= vacio %>px"></div>
			
			<% if (chocolate > 0) { %>
				<div class ="center" style="height: <%= chocolate %>px; background-color: #935745; 
				line-height: <%= chocolate %>px;">Chocolate <%= chocolate %>%</div>
			<% } 
			if (fresa > 0) { %>
				<div class ="center" style="height: <%= fresa %>px; background-color: pink; line-height: 
				<%= fresa %>px;">Fresa <%= fresa %>%</div>
			<% }
			if (vainilla > 0) { %>
				<div class ="center" style="height: <%= vainilla %>px; background-color: #F6F2C5; 
				line-height: <%= vainilla %>px;">Vainilla <%= vainilla %>%</div>
			<% } %>
		</div>
	</div>
	<% } %>
	
	<p>Si desea otro helado pinche <a href="index.jsp">aquí</a>.</p>
</body>
</html>