<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test de Infidelidad</title>
</head>
<body>
	<h2>Has obtenido 
	<% 
	int puntos = 0;
	for (int i = 1; i < 10; i++) {
	  puntos += Integer.parseInt(request.getParameter("p" + String.valueOf(i)));
	}
	
	out.print(puntos);
	%>
	puntos en el Test de Infidelidad.
	</h2>
</body>
</html>