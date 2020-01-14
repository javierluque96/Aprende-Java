<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejercicio 4</title>
</head>
<body>
	
	La nota media de las tres tres notas introducidas es: 
	<% 
	double nota1 = Integer.valueOf(request.getParameter("nota1"));
	double nota2 = Integer.valueOf(request.getParameter("nota2"));
	double nota3 = Integer.valueOf(request.getParameter("nota3"));
	out.print((nota1 + nota2 + nota3) / 3);
	%>
	
</body>
</html>