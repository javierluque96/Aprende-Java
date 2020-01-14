<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Piramide</title>
<style>
	img {
		width: 50px;
		height: auto;
	}
</style>
</head>
<body>
	<%
	int altura = Integer.parseInt(request.getParameter("altura"));
	int piedras = 1;
	int i, j;
	
	for (i = altura - 1; i >= 0; i--) {
		
	  // Introduce espacios
	  for (j = 0; j < i; j++) {
	    out.print("<img src=\"blanco.jpeg\">");
	  }
	  
	  for (j = 0; j < piedras; j++) {
	    out.print("<img src=\"piedra.jpeg\">");
	  }
	  
	  out.println("</br>");
	  
	  piedras += 2;
	}
	
	
	%>
</body>
</html>