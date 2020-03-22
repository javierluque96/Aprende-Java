<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Relación 13 - Ejercicio 1</title>
<link href="estilo.css" rel="stylesheet" type="text/css">
</head>
<body class="bg-dark">
	<div class="container w-75 mx-auto">
		<form class="form-style text-center" method="get" action="compruebaContraseña.jsp">
			<h1>Bienvenido al control de acceso</h1>
	    <input type="text" name="usuario" class="field-style w-75 mb-10" 
	    	placeholder="Usuario" required><br>
	    <input type="password" name="clave" class="field-style w-75" 
	    	placeholder="Contraseña"><br>
		
			<input type="submit" value="Aceptar" class="boton">
		</form>
	</div>
</body>
</html>