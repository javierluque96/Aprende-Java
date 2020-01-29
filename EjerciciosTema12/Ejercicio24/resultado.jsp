<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Elecciones</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="js/Chart.js"></script>
</head>
<body>
	<%
	double pp = Integer.parseInt(request.getParameter("pp"));
	double psoe = Integer.parseInt(request.getParameter("psoe"));
	double ciudadanos = Integer.parseInt(request.getParameter("ciudadanos"));
	double vox = Integer.parseInt(request.getParameter("vox"));
	double pacma = Integer.parseInt(request.getParameter("pacma"));
	double podemos = Integer.parseInt(request.getParameter("podemos"));
	double total = pp + psoe + ciudadanos + pacma + podemos + vox;
	
	String votosPP = String.format("%.0f", pp);
	String votosPsoe = String.format("%.0f", psoe);
	String votosCiu = String.format("%.0f", ciudadanos);
	String votosVox = String.format("%.0f", vox);
	String votosPacma = String.format("%.0f", pacma);
	String votosPodemos = String.format("%.0f", podemos);
	String votosTotales = String.format("%.0f", total);
	
	String porcPP = String.format("%.2f", pp * 100 / total);
	String porcPsoe = String.format("%.2f", psoe * 100 / total);
	String porcCiu = String.format("%.2f", ciudadanos * 100 / total);
	String porcVox = String.format("%.2f", vox * 100 / total);
	String porcPacma = String.format("%.2f", pacma * 100 / total);
	String porcPodemos = String.format("%.2f", podemos * 100 / total);
	
	%>
	
	<div class="jumbotron jumbotron-fluid p-5 mx-auto my-5 w-50">
		<h1 class="text-center">Resultados electorales</h1>
		
    <div class="container">
      <canvas id="pie-chart" height="100%"></canvas>
    </div>
    
    <table class="table table-collapse text-center">
    	<tr>
    		<th></th>
    		<th>PP</th>
    		<th>PSOE</th>
    		<th>Ciudadanos</th>
    		<th>VOX</th>
    		<th>PACMA</th>
    		<th>Unidas Podemos</th>
    		<th>TOTAL</th>
    	</tr>
    	
    	<tr>
    		<th>Votos</th>
    		<td><%= votosPP %></td>
    		<td><%= votosPsoe %></td>
    		<td><%= votosCiu %></td>
    		<td><%= votosVox %></td>
    		<td><%= votosPacma %></td>
    		<td><%= votosPodemos %></td>
    		<td><%= votosTotales %></td>
    	</tr>
    	
    	<tr>
    		<th>Porcentaje</th>
    		<td><%= porcPP %></td>
    		<td><%= porcPsoe %></td>
    		<td><%= porcCiu %></td>
    		<td><%= porcVox %></td>
    		<td><%= porcPacma %></td>
    		<td><%= porcPodemos %></td>
    		<td>100</td>
    	</tr>
    </table>
	</div>
	
	<script>
    new Chart(document.getElementById("pie-chart"), {
      type: 'pie',
      data: {
        labels: ["PP", "PSOE", "Ciudadanos", "Vox", "PACMA", "Podemos"],
        datasets: [{
            backgroundColor: ["#0055A7", "#FF2527", "#FE6139", "#66BC29", "#FEDB44", "#6A3468"],
            data: [<%= pp %>, <%= psoe %>, <%= ciudadanos %>, <%= vox %>, <%= pacma %>, 
            	<%= podemos %>]
          }]
      }
    });
  </script>
</body>
</html>