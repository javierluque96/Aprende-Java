<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Escribe un programa que calcule la media de un conjunto de números positivos
	introducidos por el usuario mediante un formulario (se introduce un número
	por cada carga de página). A priori, el programa no sabe cuántos números
	se introducirán. El usuario indicará que ha terminado de introducir los datos
	cuando meta un número negativo (este último número no se cuenta en la media).
	-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculo media</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	double num = 0; 
		
	if (session.getAttribute("total") == null){
		session.setAttribute("n", 0);
		session.setAttribute("total", 0.0);
	} else {
		if (request.getParameter("numero") != null) {
			num = Double.parseDouble(request.getParameter("numero"));
		}
		session.setAttribute("total", (Double)session.getAttribute("total") + num);
		session.setAttribute("n", (Integer)session.getAttribute("n") + 1);
	}
	
	if (num >= 0) {
	%>
		<form method="post" action="#">
			Número (negativo para salir) <input type="number" name="numero" step="any" autofocus><br>
			<input type="submit" value="Aceptar">
		</form>
	<%
	} else {
		// Para revertir el número negativo que hemos introducido 
		session.setAttribute("total", (Double)session.getAttribute("total") - num);
		// No queremos que cuente en la sesión que introducir el número negativo
		session.setAttribute("n", (Integer)session.getAttribute("n") - 1);
	%>
		<table style="border: 1 px solid black; border-collapse: collapse">
			<tr>
				<td><% out.print((Double)session.getAttribute("total")); %></td>
				<td><% out.print((Integer)session.getAttribute("n")); %></td>
			</tr>
			<tr>
				<th>La media es:</th>
				<td>
					<% 
					out.print((double)session.getAttribute("total") / (Integer)session.getAttribute("n")); 
					%>
				<td>
			</tr>
		</table>
		
	<%
		session.invalidate();
	} 
	%>
	
</body>
</html>
