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
<title>Gestión de usuarios</title>
<link href="estilo.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container w-75 mx-auto">
 		<h1 class="text-center">Gestion de usuarios</h1>
 		<div class="text-center">
	<%
	Class.forName("com.mysql.jdbc.Driver");
  Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios","root", 
  	"A.123123");
  Statement s = conexion.createStatement();
  ResultSet listado = s.executeQuery ("SELECT * FROM usuario");
  
  request.setCharacterEncoding("UTF-8");
  String usuario = request.getParameter("usuario");
  String pass = request.getParameter("contraseña");
  boolean existe = false;
  
  if (usuario != null && pass != null) {
  	while (listado.next()) {
    	if (listado.getString("usuarioID").equals(usuario)) {
    		existe = true;
    	}
    }

  	if (!existe) {
  		String insercion = "INSERT INTO usuario VALUES ('" + usuario + "', '" + pass + "', NULL)";
  		s.execute(insercion);
  		out.print("<h4 class=\"alert\">Se ha introducido el usuario \"" + usuario 
  				+ "\".</h4>");
  	} else {
  		out.print("<h4 class=\"alert\">El usuario \"" + usuario + "\" ya existe.</h4>");
  	}
  }
  
	%>
		</div>
		<table class="table">
			<tr><th>Usuario</th><th>Contraseña</th></tr>
			<%
			listado = s.executeQuery ("SELECT * FROM usuario");
			while (listado.next()) {
				out.println("<tr><td>");
				out.println(listado.getString("usuarioID") + "</td>");
				out.println("<td>" + listado.getString("contraseña") + "</td></tr>");
			}
			%>
		</table>
		
		<form method="get" action="gestionUsuarios.jsp" class="form-style text-center w-50">
			<input type="text" name="usuario" class="field-style field-split align-left" 
				placeholder="Usuario" />
			<input type="text" name="contraseña" class="field-style field-split align-right" 
				placeholder="Contraseña" /><br>
			<input type="submit" value="Añadir usuario" class="boton">
		</form>
	</div>
	<%
	conexion.close();
	%>
</body>
</html>