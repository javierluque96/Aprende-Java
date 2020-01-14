<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado cuestionario</title>
</head>
<body>
	<h1>Resultado del cuestionario de 1º de DAW: </h1>
	<p>
		Ha obtenido un total de 
		<%
			int puntos = 0;
			
			for (int i = 1; i < 11; i++) {
			  puntos += Integer.parseInt(request.getParameter("p" + Integer.toString(i)));
			}
			
			out.print(puntos);
		%>
		puntos. Si quieres volver a hacer el cuestionarios haz click <a href="index.jsp">aquí</a>
	</p>
</body>
</html>