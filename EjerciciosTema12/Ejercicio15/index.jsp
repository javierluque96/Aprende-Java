<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejercicio 15</title>
<link href="estilo.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="contenido">
		<h3>
	    Esta aplicación genera 100 números aleatorios del 1 al 200. Los primos aparecen
	    en color azul.
	  </h3>
	  
	  <p>
	  	<%
	  	int n;
	  	int c = 0;
	  	
	  	for (int i = 0; i < 100; i++) {
	  	  n = (int)(Math.random() * 200) + 1;
	  	  
	  	  if (esPrimo(n)) {
	  	    out.print("<span class=\"color\">" + n + "</span> ");
	  	  } else {
	  	    out.print(n + " ");
	  	  }
	  	  
		  	c++;
		  	if (c == 10) {
		  	  out.print("<br> <br>");
		  	  c = 0;
		  	}
	  	}
	  	
	  	
	  	%>
	  </p>
	</div>
	
</body>
</html>

<%!
	public static boolean esPrimo(int n) {
  	for (int i = 2; i < n; i++) {
  	  if (n % i == 0) {
  	    return false;
  	  }
  	}
  	
  	return true;
	}
%>