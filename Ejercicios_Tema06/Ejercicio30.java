public class Ejercicio30 {
  
  public static void main (String[] args) {
    System.out.print("Introduce la altura de la pecera (como mínimo 4): ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce la anchura (como mínimo 4): ");
    int anchura = Integer.parseInt(System.console().readLine());
    
    int i, j;
    int x2, x3, y2, y3;
    int x = (int)(Math.random() * (anchura - 2) + 2);
    int y = (int)(Math.random() * (altura - 2) + 2);
    
    do {
      x2 = (int)(Math.random() * (anchura - 2) + 2);
      y2 = (int)(Math.random() * (altura - 2) + 2);
    } while (x == x2 && y == y2);
    
    do {
      x3 = (int)(Math.random() * (anchura - 2) + 2);
      y3 = (int)(Math.random() * (altura - 2) + 2);
    } while ((x2 == x3 && y2 == y3) || (x == x3 && y == y3));
    
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
	    
	  // Pinta el caballito de mar dentro de la pecera
	  } else if (y2 == i && x2 == j) {
	    System.out.print("$ ");
	  
	  // Pinta la caracola dentro de la pecera
	  } else if (y3 == i && x3 == j) {
	    System.out.print("@ ");
	    
	  // Pinta agua
	  } else {
	    System.out.print("  ");
	  }
	  
	 
	}
	System.out.println("*");
      }
    }
    // (Altura - y + 1) es para que indique la posición con el eje de la y abajo
    System.out.printf("\nPosición pez: \nx = %d \ny = %d", x, altura - y + 1);
    System.out.printf("\nPosición caballito de mar: \nx = %d \ny = %d", x2, 
      altura - y2 + 1);
    System.out.printf("\nPosición caracola: \nx = %d \ny = %d", x3, 
      altura - y3 + 1);
    
    
  } 
}

