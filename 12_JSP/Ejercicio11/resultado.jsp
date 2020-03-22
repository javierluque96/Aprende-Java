<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calendario</title>
<link href="estilo.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="box">
		<h1><% out.print(request.getParameter("mes") + " " + request.getParameter("year")); %></h1>
		
		<table>
		<tr>
			<th>Lunes</th>
			<th>Martes</th>
			<th>Miercoles</th>
			<th>Jueves</th>
			<th>Viernes</th>
			<th>Sábado</th>
			<th>Domingo</th>
		</tr>
		<tr>
			<%
			int numDias = Integer.parseInt(request.getParameter("numeroDias"));
			int dia = Integer.parseInt(request.getParameter("dia"));
			int columna = 0;
			
			for (int i = 1; i < numDias + dia; i++) {
			  if (i >= dia) {
			    out.print("<td>" + (i - dia + 1) + "</td>");
			  } else {
			    out.print("<td> </td>");
			  }
			  
			  columna++;
			  if (columna == 7) {
			    out.print("</tr> <tr>");
			    columna = 0;
			  }
			}
			%>
			</tr>
		</table>
	</div>
</body>
</html>