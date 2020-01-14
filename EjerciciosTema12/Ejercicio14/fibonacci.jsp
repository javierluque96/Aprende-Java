<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fibonacci</title>
</head>
<body>
	<h1>Sucesión de Fibonacci</h1>
	<p>
	<%
	int n = Integer.parseInt(request.getParameter("n"));
	int x = 0;
	int aux = 1;
	int f = 0;
	
	out.print(x + ", " + aux + ", ");
	
	for (int i = 0; i < n - 2; i++) {
	  
	  f = x + aux;
	  
	  if (i == n - 3) {
	    out.print(f);
	  } else {
	    out.print(f + ", ");
	  }
	  
	  x = aux;
	  aux = f;
	}
	%>
	</p>
</body>
</html>