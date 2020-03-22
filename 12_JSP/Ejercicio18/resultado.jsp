<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>El Trile</title>
<link href="estilo.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="contenido">
		<h1>El Trile</h1>
		<%
		int bola = (int)(Math.random() * 3);
		int cubilete = Integer.parseInt(request.getParameter("cubilete"));
		String[] imagen = {"cubileteSinBola.png", "cubileteSinBola.png", "cubileteSinBola.png"};
		imagen[bola] = "cubileteConBola.png";
		
		out.print(cubilete == bola?"<p>¡Enhorabuena, has ganado!</p>":"<p>Lo siento, has perdido.</p>");
		%>
		
		<div class="box">
			<img src="imagenes/<%= imagen[0] %>">
      <img src="imagenes/<%= imagen[1] %>">
      <img src="imagenes/<%= imagen[2] %>">
		</div>
	      
	    
	  <p><a href="index.jsp"><button>Volver a jugar</button></a></p>
	</div>
	
</body>
</html>