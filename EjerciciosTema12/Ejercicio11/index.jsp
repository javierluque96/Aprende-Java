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
		<h1>Calendario de un mes</h1>
		<form method="get" action="resultado.jsp">
			Nombre del mes: 
			<select name="mes">
	      <option>Enero</option>
	      <option>Febrero</option>
	      <option>Marzo</option>
	      <option>Abril</option>
	      <option>Mayo</option>
	      <option>Junio</option>
	      <option>Julio</option>
	      <option>Agosto</option>
	      <option>Septiembre</option>
	      <option>Octubre</option>
	      <option>Noviembre</option>
	      <option>Diciembre</option>
	    </select><br>
			Año: <input type="number" name="year"> <br>
			Día de la semana en que cae el día 1: 
			<select name="dia">
	      <option value="1">lunes</option>
	      <option value="2">martes</option>
	      <option value="3">miércoles</option>
	      <option value="4">jueves</option>
	      <option value="5">viernes</option>
	      <option value="6">sábado</option>
	      <option value="7">domingo</option>
	    </select><br>
			Número de días que tiene el mes: <input type="number" min="28" max="31" name="numeroDias"><br>
			<input type="submit" value="Enviar">
		</form>
	</div>
</body>
</html>