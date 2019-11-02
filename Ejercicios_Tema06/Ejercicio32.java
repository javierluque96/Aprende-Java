public class Ejercicio32 {
  
  public static void main (String[] args) {
    System.out.print("Introduzca la longitud del sendero en metros: ");
    int longitud = Integer.parseInt(System.console().readLine());
    
    int i, j;
    int desplazamientoSendero = 6;
    int posicionObstaculo;
    
    for (i = 0; i < longitud; i++) {
      // Inserta los espacios a la izquierda del sendero
      for (j = 0; j < desplazamientoSendero; j++) {
	System.out.print(" ");
      }
      
      // Pinta el sendero
      switch ((int)(Math.random() * 2 + 1)) {
	case 1: // Pinta el camino sin obstáculos
	  System.out.println("|    |");
	  break;
	
	case 2: // Pinta el camino con obstáculos
	  posicionObstaculo = (int)(Math.random() * 4) + 1;
	  
	  System.out.print("|");
	  for(j = 1; j <= 4; j++) {
	    // Pinta el obstáculo
	    if (j == posicionObstaculo) {
	      if ((int)(Math.random() * 2) == 0) {
		System.out.print("*"); 
	      } else {
		System.out.print("0");
	      }
	    } else {
	      System.out.print(" ");
	    }
	  }
	  System.out.println("|");
	  break;
	  
	default:
      }
      desplazamientoSendero += (int)(Math.random() * 3) - 1;
    }
  } 
}

