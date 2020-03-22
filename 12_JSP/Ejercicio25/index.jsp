<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dados</title>
<link href="estilo.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<%
		int d1, d2, d3;
		
		do {
			d1 = (int)(Math.random() * 6 + 1);
			d2 = (int)(Math.random() * 6 + 1);
			d3 = (int)(Math.random() * 6 + 1);
		%>
			<img src="imagenes/<%= d1 %>.png">
			<img src="imagenes/<%= d2 %>.png">
			<img src="imagenes/<%= d3 %>.png">
			<br>
		<%
		} while (!(d1 == d2 && d2 == d3));
		%>
	</div>
</body>
</html>