<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejercicio 10</title>
</head>
<body>
	<h1>Cuestionario 1º DAW</h1>
	
  <form method="post" action="resultado.jsp">
    1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?<br>
    <input type="radio" name="p1" value="0"> int<br>
    <input type="radio" name="p1" value="1"> double<br>
    <input type="radio" name="p1" value="0"> float<br><br>

    2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos?<br>
    <input type="radio" name="p2" value="0"> XML<br>
    <input type="radio" name="p2" value="0"> SELECT<br>
    <input type="radio" name="p2" value="1"> SQL<br><br>

    3. Para insertar un hiperenlace en una página se utiliza la etiqueta...<br>
    <input type="radio" name="p3" value="0"> href<br>
    <input type="radio" name="p3" value="1"> a<br>
    <input type="radio" name="p3" value="0"> link<br><br>

    4. ¿En qué directorio se encuentran los archivos de configuración de Linux?<br>
    <input type="radio" name="p4" value="1"> /etc<br>
    <input type="radio" name="p4" value="0"> /config<br>
    <input type="radio" name="p4" value="0"> /cfg<br><br>

    5. ¿Cuál de las siguientes memorias es volátil?<br>
    <input type="radio" name="p5" value="1"> RAM<br>
    <input type="radio" name="p5" value="0"> EPROM<br>
    <input type="radio" name="p5" value="0"> ROM<br><br>

    6. En Java, para definir una clase como subclase de otra se utiliza...<br>
    <input type="radio" name="p6" value="1"> extends<br>
    <input type="radio" name="p6" value="0"> inherit<br>
    <input type="radio" name="p6" value="0"> subclass<br><br>

    7. ¿Java soporta la herencia múltiple?<br>
    <input type="radio" name="p7" value="0"> Sí<br>
    <input type="radio" name="p7" value="1"> No<br>
    <input type="radio" name="p7" value="0"> A veces<br><br>

    8. ¿Qué significan las siglas CSS?<br>
    <input type="radio" name="p8" value="0"> Computer Style Sheets<br>
    <input type="radio" name="p8" value="0"> Creative Style Sheets<br>
    <input type="radio" name="p8" value="1"> Cascading Style Sheets<br><br>

    9. ¿Qué propiedad se utiliza en CSS para cambiar el color de fondo?<br>
    <input type="radio" name="p9" value="0"> bgcolor:<br>
    <input type="radio" name="p9" value="0"> color:<br>
    <input type="radio" name="p9" value="1"> background-color:<br><br>

    10. ¿Cómo se muestran los hiperenlaces sin subrayar?<br>
    <input type="radio" name="p10" value="0"> a {text-decoration:no underline}<br>
    <input type="radio" name="p10" value="0"> a {underline:none}<br>
    <input type="radio" name="p10" value="1"> a {text-decoration:none}<br><br>

    <input type="submit" value="Evaluar cuestionario">
  </form>
</body>
</html>