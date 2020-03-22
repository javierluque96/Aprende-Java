public class T7Ejercicio6 {
  
  
  public static void main (String[] args) {
    int[][] num = new int[6][10];
    int[] posicionMaximo = new int[2];
    int[] posicionMinimo = new int[2];
    int fila, columna;
    int i, j;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    boolean repetido;
    
    for (fila = 0; fila < 6; fila++) {
      for (columna = 0; columna < 10; columna++) {
	do {
	  num[fila][columna] = (int)(Math.random() * 1001);
	  repetido = false;
	  
	  // Comprueba si el número se repite en el array
	  for (i = 0; i <= fila; i++) {
	    if (i == fila) {
	      for (j = 0; j < columna; j++) {
		if (num[fila][columna] == num[i][j]) {
		repetido = true;
		}
	      }
	    } else {
	      for (j = 0; j < 10; j++) {
		if (num[fila][columna] == num[i][j]) {
		repetido = true;
		}
	      }
	    }
	  }
	  
	  /* Comprueba si el número generado ya está en el array.
          repetido = false;
          for (i = 0; i < 10 * fila + columna; i++) {
            if (num[fila][columna] == num[i / 10][i % 10]) {
              repetido = true;
            }
          }
	  Alternativa -- como se hace en el libro */
	} while (repetido);
      }
    }

    for (fila = 0; fila < 6; fila++) {
      for (columna = 0; columna < 10; columna++) {	
	// Recoge la posición del máximo
	if (num[fila][columna] >= maximo) {
	  maximo = num[fila][columna];
	  posicionMaximo[0] = fila;
	  posicionMaximo[1] = columna;
	}
	
	// Recoge la posición del mínimo
	if (num[fila][columna] <= minimo) {
	  minimo = num[fila][columna];
	  posicionMinimo[0] = fila;
	  posicionMinimo[1] = columna;
	}
      }
    }
    
    // Imprime el array
    System.out.print("|Array num |");
    
    for (columna = 0; columna < 10; columna++) {
      System.out.printf("Columna%2d|", columna);
    }
    
    for (fila = 0; fila < 6; fila++) {
      System.out.print("\n|");
      System.out.printf("  Fila%2d  |", fila);
      
      for (columna = 0; columna < 10; columna++) {
	System.out.printf(" %5d   |", num[fila][columna]);
      }
    }    
    
    System.out.println();
    for (fila = 0; fila < 112; fila++) {
      System.out.print("-");
    }
    
    System.out.printf("\n\nPosición máximo:\nFila:%2d\nColumna:%2d", 
      posicionMaximo[0],posicionMaximo[1]);
      
    System.out.printf("\n\nPosición mínimo:\nFila:%2d\nColumna:%2d", 
      posicionMinimo[0],posicionMinimo[1]);
  } 
}

