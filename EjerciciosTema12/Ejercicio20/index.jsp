<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajedrez</title>
<link href="estilo.css" type="text/css" rel="stylesheet">
</head>
<body>
	<table>
		<tr>
			<td></td>
			<td class="letraBlanca">a</td>
			<td class="letraBlanca">b</td>
			<td class="letraBlanca">c</td>
			<td class="letraBlanca">d</td>
			<td class="letraBlanca">e</td>
			<td class="letraBlanca">f</td>
			<td class="letraBlanca">g</td>
			<td class="letraBlanca">h</td>
		</tr>
		
		<%
		String color = "";
		String imagen = "";
		
		int posicion = 0;
		
		int posicionAlfil;
		int posicionCaballo;
		
		do {
		  posicionAlfil = (int)(Math.random() * 64);
		  posicionCaballo = (int)(Math.random() * 64);
		} while (posicionAlfil == posicionCaballo);
		
		for (int fila = 8; fila > 0; fila--) {
		  out.print("<tr><td class=\"letraBlanca\">" + fila + "</td>");
		  for (int columna = 0; columna < 8; columna ++) {
		    // Color de la casilla
		    if (fila % 2 == 0) {
		      if (columna % 2 == 0) {
						color = "blanco";
		      } else {
						color = "negro";
		      }
		    } else {
		      if (columna % 2 == 0) {
						color = "negro";
		      } else {
						color = "blanco";
		      }
		    }
		    
		    if (posicion == posicionAlfil) {
		      imagen = "alfilblanco.png";
		    } else if (posicion == posicionCaballo) {
		      imagen = "caballonegro.png";
		    } else {
		      imagen = "transparente.png";
		    }
		    
		    out.print("<td class=\"" + color + "\"><img src=\"imagenes/" + imagen + "\"</td>");
		    posicion++;
		  }
		  out.print("<td class=\"letraBlanca\">" + fila + "</td></tr>");
		}
		%>
		
		<tr>
			<td></td>
			<td class="letraBlanca">a</td>
			<td class="letraBlanca">b</td>
			<td class="letraBlanca">c</td>
			<td class="letraBlanca">d</td>
			<td class="letraBlanca">e</td>
			<td class="letraBlanca">f</td>
			<td class="letraBlanca">g</td>
			<td class="letraBlanca">h</td>
		</tr>
	</table>
</body>
</html>