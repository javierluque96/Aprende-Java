public class Ejercicio17 {
  
  public static void main (String[] args) {
    System.out.println("Pinta una pecera con un pececito dentro.");
    
    System.out.print("Introduce la altura de la pecera (como mínimo 4): ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce la anchura (como mínimo 4): ");
    int anchura = Integer.parseInt(System.console().readLine());
    
    int x = (int)(Math.random() * (anchura - 2) + 2);
    int y = (int)(Math.random() * (altura - 2) + 2);
    int i, j;
    
    for (i = 1; i <= altura; i++) {
      // Pinta linea inferior y superior
      if (i == 1 || i == altura) {
	for (j = 0; j < anchura; j++) {
	  System.out.print("* ");
	}
	System.out.println();
      
      // Pinta las lineas de en medio
      } else {
	System.out.print("* ");
	for (j = 2; j < anchura; j++) {
	  // Pinta el pececito dentro de la pecera
	  if (y == i && x == j) {
	    System.out.print("& ");
	  } else {
	    System.out.print("  ");
	  }
	}
	System.out.println("*");
      }
    }
    // (Altura - y + 1) es para que indique la posición con el eje de la y abajo
    System.out.printf("\nPosición pez: \nx = %d \ny = %d", x, altura - y + 1);
  } 
}

