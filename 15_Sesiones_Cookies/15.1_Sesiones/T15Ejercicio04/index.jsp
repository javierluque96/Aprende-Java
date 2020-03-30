<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="tiendaOnline.Producto" %>
<%@ page import="tiendaOnline.Catalogo" %>
<%@ page import="tiendaOnline.ElementoCarrito" %>
<%@ page import="tiendaOnline.Carrito" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tienda Estilográfica</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css?family=Parisienne&display=swap" rel="stylesheet">
<style>
	.text-estilado {
		font-family: 'Parisienne', cursive;
	}
	
	.text-grande {
		font-size: 6rem;
	}
</style>
</head>
<body>
	<%
		if (session.getAttribute("catalogo") == null) {
			session.setAttribute("catalogo", new Catalogo());
		}
	
		if (session.getAttribute("carrito") == null) {
			session.setAttribute("carrito", new Carrito());
		}
	%>
	
	<h1 class="text-center my-5 text-estilado text-grande">Tienda de Estilográficas</h1>
	
	<div class="container">
		<div class="row">
			<!-- Catálogo -->
			<div class="col-9">
				<div class="row">
				<% for (Producto p : ((Catalogo) session.getAttribute("catalogo")).getProductos()) { %>
					<div class="col-sm-4 mb-3">
						<div class="card" style="height:250px">
							<img src="img/<%= p.getImagen()%>.jpg" class="card-img-top img-fluid mt-4">
							
							<div class="card-body d-flex flex-column">
								<h4><%= p.getNombre()%></h4>
								<h5><%= String.format("%.2f", p.getPrecio())%> €</h5>
								<a href="añadirCarrito.jsp?codigo=<%= p.getCodigo()%>" 
									 class="mt-auto btn btn-primary">
									Añadir al carrito
								</a>
							</div>
						</div>
					</div>
				<%} %>
				</div>
			</div>
			
			<!-- Carrito -->
			<div class="col-3">
				<div class="border border-warning">
					<div class="mt-2 d-flex align-items-center">
						<img src="img/cart.svg" width="36" class="mx-4">
						<span class="h1 text-estilado mt-3">Carrito</span>
					</div>
				<% for (ElementoCarrito e : ((Carrito) session.getAttribute("carrito")).getElementos()) { %>
					<div class="card m-2" style="height:260px">
						<img src="img/<%= e.getProducto().getImagen()%>.jpg" 
						class="card-img-top img-fluid mt-4">
						
						<div class="card-body d-flex flex-column">
							<h4><%= e.getProducto().getNombre()%></h4>
							<h5><%= String.format("%.2f", e.getProducto().getPrecio())%> €</h5>
							<h5><%= e.getCantidad()%> unidades</h5>
							<a href="borrarCarrito.jsp?codigo=<%= e.getProducto().getCodigo()%>" 
								 class="mt-auto btn btn-warning">
								Eliminar
							</a>
						</div>
					</div>
				<%} %>
				</div>
			</div>
		</div>
	</div>

<!-- Bootstrap  -->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>