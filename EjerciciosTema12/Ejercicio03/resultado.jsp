<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejercicio 3</title>
</head>
<body>
	
	Hola <% out.print(request.getParameter("nombre")); %>
	
</body>
</html>