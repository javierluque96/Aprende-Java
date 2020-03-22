public class Ejercicio30 {
	
  public static void main (String[] args) {
    
    int dia1, dia2;
    int hora, hora1, hora2;
    int horasTranscurridas = 0;
    boolean datosCorrectos = true;
    boolean distintos = false;
    String nombreDia1 = "";
    String nombreDia2 = "";
    
    System.out.println("Este programa calcula las horas transcurridas entre "
      + "dos horas de dos dias de la semana.");
    
    do {
      // Dia 1
      System.out.println("Introduce el primer dia (1-7):");
      dia1 = Integer.parseInt(System.console().readLine());
      System.out.println("Introduce la primera hora (00:00-23:00):");
      hora1 = Integer.parseInt(System.console().readLine());
      
      // Dia 2
      System.out.println("Introduce el segundo dia (1-7):");
      dia2 = Integer.parseInt(System.console().readLine());
      System.out.println("Introduce la segunda hora (00:00-23:00):");
      hora2 = Integer.parseInt(System.console().readLine());
      
      // Comprueba que los datos introducidos son correctos
      if(dia1 > dia2 || dia1 == dia2){
	System.out.println("Dias introducidos erroneos. Vuelve a introducir los"
	  + " datos.");
	datosCorrectos = false;
	  
      } else if (dia1 == 0 || dia2 == 0 || dia1 > 7 || dia2 > 7){
	System.out.println("Hora introducida erronea. Vuelve a introducir los"
	  + " datos.");
	datosCorrectos = false;
	
      } else if (hora1 < 0 || hora2 < 0 || hora1 > 23 || hora2 > 23){
	System.out.println("Hora introducida erronea. Vuelve a introducir los"
	  + " datos.");
	datosCorrectos = false;
      }
      
    }while(datosCorrectos == false);
    
    // Convierte los dias de int a String
    switch(dia1){
      case 1:
	nombreDia1 = "Lunes";
      case 2:
	nombreDia1 = "Martes";
      case 3:
	nombreDia1 = "Miercoles";
      case 4:
	nombreDia1 = "Jueves";
      case 5:
	nombreDia1 = "Viernes";
      case 6:
	nombreDia1 = "Sabado";
      case 7:
	nombreDia1 = "Domingo";
    } //Switch Dia1
    
    switch(dia2){
      case 1:
	nombreDia2 = "Lunes";
      case 2:
	nombreDia2 = "Martes";
      case 3:
	nombreDia2 = "Miercoles";
      case 4:
	nombreDia2 = "Jueves";
      case 5:
	nombreDia2 = "Viernes";
      case 6:
	nombreDia2 = "Sabado";
      case 7:
	nombreDia2 = "Domingo";
    } //Switch Dia2
  
    // Calcula las horas transcurridas
    hora = hora1;
    
    while(distintos == false){
      if(hora == 24){
	dia1++;
	hora = 1;
      }
      if(dia1 == dia2 && hora == hora2){
	distintos = true;
      }
      hora++;
      horasTranscurridas++;
    }
    
    System.out.println("\nEntre las " + hora1 + ":00 del " + nombreDia1 + " y "
      + "las " + hora2 + ":00 del " + nombreDia2 + " han transcurrido "
      + horasTranscurridas + " hora/s.");
  }
}

