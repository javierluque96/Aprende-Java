<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Tres en raya</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<%
		int i,j;
		int o = 0;
		int x = 0;
		String imagen[][] = new String[3][3];
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				imagen[i][j] = "vacio";
			}
		}
		
		do {
			i = (int)(Math.random() * 3);
			j = (int)(Math.random() * 3);
			if (imagen[i][j].equals("vacio")) {
				o++;
				imagen[i][j] = "circulo";
			}
		} while (o < 3);
		
		do {
			i = (int)(Math.random() * 3);
			j = (int)(Math.random() * 3);
			if (imagen[i][j].equals("vacio")) {
				x++;
				imagen[i][j] = "cruz";
			}
		} while (x < 3);
		%>
		
		<table class="table-bordered my-5 mx-auto" style="border-collapse: separate">
			<%
			for (i = 0; i < 3; i++) {
				out.print("<tr>");
				for (j = 0; j < 3; j++) {
					out.print("<td><img src=\"imagenes/" + imagen[i][j] + ".png\"></td>");
				}
				
				out.print("</tr>");
			}
			%>
		</table>
	</div>
</body>
</html>