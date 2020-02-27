<%-- 
  9. Realiza una aplicación que pinte una pirámide. La altura se pedirá en un
  formulario. La pirámide estará hecha de bolitas, ladrillos o cualquier otra
  imagen.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 13 - Ejercicio 1</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <form method="get" action="piramide.jsp" class="form-style">
      <h1 class="mt-10 mb-10 text-center">Pinta una pirámide</h1>
      <input type="number" min="1" max="10" name="altura" placeholder="Altura de la piramide"
      class="field-style field-full mt-10">
      <br>
      <input type="submit" value="Aceptar" class="boton">
    </form>
  </body>
</html>
