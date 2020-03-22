<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contador de visitas</title>
</head>
<body>
	<%
	session.setAttribute(
		"n",
		session.getAttribute("n") == null ? 1 : (Integer)session.getAttribute("n") + 1
	);
	%>
	<h1><%= session.getAttribute("n") %></h1>
	<a href="reset.jsp">Resetea contador</a>
</body>
</html>

<!-- Modifica el contador de visitas visto como ejemplo en este capítulo añadiendo
la posibilidad (mediante un enlace o botón) de reiniciar la cuenta. Utiliza el
método invalidate() para resetear las variables de sesión. -->