<%--
	Escribe una aplicación que pida tu nombre. A continuación mostrará “Hola”
	seguido del nombre introducido. El nombre se deberá recoger mediante un formulario.
 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejercicio 3</title>
</head>
<body>
	<form method="get" action="resultado.jsp">
		Introduce tu nombre:
		<input type="text" name="nombre">
		<input type="submit" value="OK">
	</form>
</body>
</html>