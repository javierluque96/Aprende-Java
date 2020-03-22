<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Elecciones</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<style>
	.text-p {
	  font-size: 20px;
	}
</style>
</head>
<body>
	<div class="jumbotron jumbotron-fluid p-5 mx-auto my-5 w-50 bg-success text-white rounded">
		<h1 class="text-center">Resultados electorales</h1>
		<p class="text-center text-p mt-3 mb-4">
			Introduzca el número de votos de los partidos políticos.
		</p>
		<form action="resultado.jsp">
			<div class="form-group row">
		    <label class="col-sm-4 col-form-label col-form-label-lg">PP</label>
		    <div class="col-sm-8">
		      <input type="number" class="form-control form-control-lg" name="pp">
		    </div>
		  </div>
		  
		  <div class="form-group row">
		    <label class="col-sm-4 col-form-label col-form-label-lg">PSOE</label>
		    <div class="col-sm-8">
		      <input type="number" class="form-control form-control-lg" name="psoe">
		    </div>
		  </div>
		  
		  <div class="form-group row">
		    <label class="col-sm-4 col-form-label col-form-label-lg">Ciudadanos</label>
		    <div class="col-sm-8">
		      <input type="number" class="form-control form-control-lg" name="ciudadanos">
		    </div>
		  </div>
		  
		  <div class="form-group row">
		    <label class="col-sm-4 col-form-label col-form-label-lg">VOX</label>
		    <div class="col-sm-8">
		      <input type="number" class="form-control form-control-lg" name="vox">
		    </div>
		  </div>
		  
		  <div class="form-group row">
		    <label class="col-sm-4 col-form-label col-form-label-lg">PACMA</label>
		    <div class="col-sm-8">
		      <input type="number" class="form-control form-control-lg" name="pacma">
		    </div>
		  </div>
		  
		  <div class="form-group row">
		    <label class="col-sm-4 col-form-label col-form-label-lg">Unidas Podemos</label>
		    <div class="col-sm-8">
		      <input type="number" class="form-control form-control-lg" name="podemos">
		    </div>
		  </div>
		  
		  <div class="btn">
        <input type="submit" value="Ver gráfica">
      </div>
		</form>
	</div>
</body>
</html>