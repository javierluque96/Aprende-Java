<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejercicio 5</title>
</head>
<body>
	
	<% double euros = Integer.valueOf(request.getParameter("euros")); 
	out.print(euros); %> € son <% out.print(euros * 166.386); %> pesetas
	 
</body>
</html>