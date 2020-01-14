<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Conversor</title>
<link rel="stylesheet" type="text/css" href="estilo.css">
</head>
<body>
	<div class="wrapper">
		<div class="dinero">
	    <h2>
	      <%
	        Double c = Double.parseDouble(request.getParameter("cantidad"));
	        DecimalFormat formatoEuros = new DecimalFormat("0.00");
	        if (request.getParameter("cambio").equals("eurosEnPesetas")) {
	          out.print(formatoEuros.format(c) + " euros son " + Math.round(c * 166.386) + " pesetas.");
	        } else {
	          out.print(Math.round(c) + " pesetas son " + formatoEuros.format(c / 166.386) + " euros.");
	        }
	      %>
	    </h2>
	  </div>
	</div>
</body>
</html>