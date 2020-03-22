<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Relación 13 - Ejercicio 1</title>
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<link href="estilo.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%
	Class.forName("com.mysql.jdbc.Driver");
  Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios","root", 
  	"A.123123");
  Statement s = conexion.createStatement();
	
  request.setCharacterEncoding("UTF-8");
  
  String usuario = request.getParameter("usuario");
  String password = request.getParameter("clave");
  boolean acceso = false;
  ResultSet listado = s.executeQuery ("SELECT usuarioID, contraseña FROM usuario");
  
  while (listado.next()) {
  	
  	if (listado.getString("usuarioID").equals(usuario) &&  
  			listado.getString("contraseña").equals(password)) 
  	{
  		acceso = true;
  	}
  }
  
  %>
  
  <div class="form-style text-center w-25">
  	<h1 class="text-center">Control de Acceso</h1>
	  <%
	  if (acceso == true) {
	  %>
	  
	  	<i class='fas fa-unlock-alt' style='font-size:100px'></i><br>
	  	<p>Acceso permitido a la aplicación.</p>
	  <%
	  	if (usuario.equals("admin")) {
	  %>
	  		<a href="gestionUsuarios.jsp"><button class="boton">Aceptar</button></a>
	  <%
	  	} else { %>
	  		<a href="indexPiramide.jsp"><button class="boton">Aceptar</button></a>
	  <%
	  	}
	  } else {
	  %>
	  	<i class='fas fa-lock' style='font-size:100px'></i><br>
	  	<p>Acceso denegado a la aplicación.</p>
	  	<a href="index.jsp"><button class="boton">Aceptar</button></a>
	  <%
	  }
		%>
	</div>
</body>
</html>