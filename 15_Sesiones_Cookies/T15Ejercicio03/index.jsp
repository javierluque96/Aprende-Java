<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Ejercicio 3 
	Realiza un programa que vaya pidiendo números hasta que se introduzca un
	numero negativo y nos diga cuantos números se han introducido, la media de
	los impares y el mayor de los pares. El número negativo sólo se utiliza para
	indicar el final de la introducción de datos pero no se incluye en el cómputo. 
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejercicio 3</title>
<link href="estilo.css" rel="stylesheet" type="text/css">
</head>
<body class="bg-dark">
	<div class="jumbotron p-40 w-50 mt-50 mx-auto">
		<%
		request.setCharacterEncoding("UTF-8");
		double num = 0; 
			
		if (session.getAttribute("totalPares") == null && session.getAttribute("totalImpares") == null){
			session.setAttribute("nPares", 0);
			session.setAttribute("nImpares", 0);
			session.setAttribute("mayorPar", 0.0);
			session.setAttribute("totalImpares", 0.0);
		} else {
			if (request.getParameter("numero") != null) {
				num = Double.parseDouble(request.getParameter("numero"));
			}
			
			if (num % 2 == 0) {
				if (num > (double)session.getAttribute("mayorPar")) {
					session.setAttribute("mayorPar", num);
				}
				session.setAttribute("nPares", (Integer)session.getAttribute("nPares") + 1);
			} else {
				session.setAttribute("totalImpares", (Double)session.getAttribute("totalImpares") + num);
				session.setAttribute("nImpares", (Integer)session.getAttribute("nImpares") + 1);
			}
			
		}
		
		if (num >= 0) {
		%>
			<form method="post" action="#">
				Número (negativo para salir) <input type="number" name="numero" step="any" autofocus><br>
				<input type="submit" value="Aceptar" class="boton">
			</form>
		<%
		} else {
			if (num % 2 == 0) {
				session.setAttribute("nPares", (Integer)session.getAttribute("nPares") - 1);
			}
			
			if (num % 2 != 0){
				session.setAttribute("totalImpares", (Double)session.getAttribute("totalImpares") - num);
				session.setAttribute("nImpares", (Integer)session.getAttribute("nImpares") - 1);
			}
		%>
			
			<table class="table">
				<tr>
					<th>Números introducidos</th>
					<td>
						<% out.print((Integer)session.getAttribute("nPares")
						+ (Integer)session.getAttribute("nImpares")); %>
					</td>
				</tr>
				<tr>
					<th>Mayor Par</th>
					<td>
						<% out.print((double)session.getAttribute("mayorPar")); %>	
					</td>
				</tr>
				<tr>
					<th>Media Impares</th>
					<td>
						<% 
						out.print((double)session.getAttribute("totalImpares") / 
								(Integer)session.getAttribute("nImpares")); 
						%>
					</td>
				</tr>
			</table>
			
		<%
			session.invalidate();
		} 
		%>
	</div>
</body>
</html>