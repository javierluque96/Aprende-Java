public class Ejercicio08 {
  
  public static void main (String[] args) {
    
    int resultadoPartido;
    int columnas = 3;
    int i;
    int apuestas;
    // Pinta las 15 filas de la quiniela
    for (i = 1; i <= 15; i++) {
      System.out.printf("%2d. |", i);
      
      if (i == 15) {
	columnas = 1;
      }
      
      for (apuestas = 0; apuestas < columnas; apuestas++) {
	resultadoPartido = (int)(Math.random()*6);
	
	switch (resultadoPartido) {
	  case 0:
	  case 1:
	  case 2:
	    System.out.print("1  |");
	    break;
	  case 3:
	  case 4:
	    System.out.print(" X |");
	    break;
	  case 5:
	    System.out.print("  2|");
	    break;
	  default:
	}
      }
      System.out.println();
    }
    
  } 
}

