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
	<%--
	Mejora la aplicación anterior de tal forma que no haga falta introducir el día de la semana en
	que cae el día 1 y el número de días que tiene el mes. El programa debe deducir estos datos del 
	mes y el año. Pista: puedes usar la clase Calendar ( java.util.Calendar ).
	--%>
	
	<div class="box">
		<h1>Calendario de un mes</h1>
		<form method="get" action="resultado.jsp">
			Nombre del mes: 
			<select name="mes">
	      <option value="1">Enero</option>
	      <option value="2">Febrero</option>
	      <option value="3">Marzo</option>
	      <option value="4">Abril</option>
	      <option value="5">Mayo</option>
	      <option value="6">Junio</option>
	      <option value="7">Julio</option>
	      <option value="8">Agosto</option>
	      <option value="9">Septiembre</option>
	      <option value="10">Octubre</option>
	      <option value="11">Noviembre</option>
	      <option value="12">Diciembre</option>
	    </select><br>
			Año: <input type="number" name="year"> <br>
			<input type="submit" value="Enviar">
		</form>
	</div>
</body>
</html>