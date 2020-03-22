<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Calendar"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calendario</title>
<link href="estilo.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="box">
		<%
		int mes = Integer.parseInt(request.getParameter("mes"));
		int year = Integer.parseInt(request.getParameter("year"));
		
		Calendar calendario = Calendar.getInstance();
		calendario.set(year, mes - 1, 1); // los meses van de 0 a 11
		
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
		    "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		%>
		
		<h1><% out.print(meses[mes - 1] + " " + year); %></h1>
		
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
			int numDias = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
      int dia = calendario.get(Calendar.DAY_OF_WEEK);
      
      if (dia == 1) {
        dia = 7; // el domingo es día 1
      } else {
        dia--;
      }
      
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