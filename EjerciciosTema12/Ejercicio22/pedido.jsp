<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pedido</title>
<link href="estilo.css" type="text/css" rel="stylesheet">
</head>
<body>
	<%
	int i;
	double total = 0;
	int[] cantidades = new int[7];
	String[] descripciones = {"Hamburguesa vegetariana", "Pasta al pesto", "Pizza caprese", 
			"Quinoa con verduras", "Agua", "Cerveza", "Refresco"};
	double[] precios = {6.20, 4.90, 5.50, 6.95, 1, 1.5, 1.4};

	for (i = 0; i < 7; i++) {
		cantidades[i] = Integer.parseInt(request.getParameter("comida" + i));
	}
	%>
	<h1>Aquí tiene su pedido</h1>
	<table>
		<tr>
			<th>Comida / bebida</th>
			<th>PVP</th>
			<th>Cantidad</th>
			<th>Subtotal</th>
		</tr>
		
		<%
		for (i = 0; i < 7; i++) {
				
			if (cantidades[i] > 0) {
				out.print("<tr><td>" + descripciones[i] + "</td><td>" + precios[i] + "</td><td>" 
					+ cantidades[i] + "</td><td>" + precios[i] * cantidades[i] + "€</td></tr>");
			}
			
			total += precios[i] * cantidades[i];
		}
		
		out.print("<tr><th>Total: " + String.format("%.2f", total) + "€</th>");
		%>
		
	</table>
</body>
</html>