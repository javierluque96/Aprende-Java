<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dados de Póker</title>
<link href="estilo.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="contenido">
		
		<h1>Tirada aleatoria de tres dados de póker:</h1>
	
		<%
		for (int i = 0; i < 3; i++) {
		  switch((int)(Math.random() * 6)) {
		  	case 0:	
		  		out.print("<img src=\"as.png\" width=\"100\" height=\"100\">");
		  	  break;
		  	case 1:
		  		out.print("<img src=\"siete.png\" width=\"100\" height=\"100\">");
		  	  break;
		  	case 2:
		  		out.print("<img src=\"ocho.png\" width=\"100\" height=\"100\">");
		  	  break;
		  	case 3:
		  		out.print("<img src=\"j.png\" width=\"100\" height=\"100\">");
		  	  break;
		  	case 4:
		  		out.print("<img src=\"q.png\" width=\"100\" height=\"100\">");
		  	  break;
		  	case 5:
		  		out.print("<img src=\"k.png\" width=\"100\" height=\"100\">");
		  	  break;
		  	  
		  	default:
		  }
		}
		%>
		
	</div>
	
</body>
</html>

