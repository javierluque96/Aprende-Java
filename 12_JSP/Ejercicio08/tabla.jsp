<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tabla de Multiplicar</title>
<link rel="stylesheet" type="text/css" href="estilo.css">
</head>
<body>
	<% int x = Integer.parseInt(request.getParameter("numero")); %>
	
	<h2>Tabla de multiplicar del <% out.print(x);%></h2>
	<table>		
		<tr>
			<td><% out.print(x);%> x 1</td>
			<td><% out.print(x);%></td>
		</tr>
		
		<tr>
			<td><% out.print(x);%> x 2</td>
			<td><% out.print(x * 2);%></td>
		</tr>
		
		<tr>
			<td><% out.print(x);%> x 3</td>
			<td><% out.print(x * 3);%></td>
		</tr>
		
		<tr>
			<td><% out.print(x);%> x 4</td>
			<td><% out.print(x * 4);%></td>
		</tr>
		
		<tr>
			<td><% out.print(x);%> x 5</td>
			<td><% out.print(x * 5);%></td>
		</tr>
		
		<tr>
			<td><% out.print(x);%> x 6</td>
			<td><% out.print(x * 6);%></td>
		</tr>
		
		<tr>
			<td><% out.print(x);%> x 7</td>
			<td><% out.print(x * 7);%></td>
		</tr>
		
		<tr>
			<td><% out.print(x);%> x 8</td>
			<td><% out.print(x * 8);%></td>
		</tr>
		
		<tr>
			<td><% out.print(x);%> x 9</td>
			<td><% out.print(x * 9);%></td>
		</tr>
		
		<tr>
			<td><% out.print(x);%> x 10</td>
			<td><% out.print(x * 10);%></td>
		</tr>	
	</table>
</body>
</html>