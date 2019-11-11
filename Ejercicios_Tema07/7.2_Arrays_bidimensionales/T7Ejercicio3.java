public class T7Ejercicio3 {
  
  
  public static void main (String[] args) {
    int[][] num = new int[4][5]; 
    int[] sumaFila = new int[4];
    int[] sumaColumna = new int[5];
    int fila, columna;
    int total = 0;
    
    // Recoge los 20 números en el array 
    System.out.println("Introduce 20 números enteros: ");
    
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
	num[fila][columna] = (int)(Math.random() * 100 + 100);
      }
    }
    
    // Sumatorio de las filas, las columnas y el total
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
	sumaFila[fila] += num[fila][columna];
	sumaColumna[columna] += num[fila][columna];
	total += num[fila][columna];
      }
    }
    
    // Imprime el array
    System.out.print("\n|Array num |");
    
    for (columna = 0; columna < 5; columna++) {
      System.out.printf("Columna%2d|", columna);
    }
    
    System.out.print("Sumatorio|");
    
    for (fila = 0; fila < 4; fila++) {
      System.out.print("\n|");
      System.out.printf("  Fila%2d  |", fila);
      
      for (columna = 0; columna < 6; columna++) {
	if (columna == 5) { // Imprime sumatorio de la fila
	  System.out.printf(" %5d   |", sumaFila[fila]);
	} else {
	  System.out.printf(" %5d   |", num[fila][columna]);
	}
      }
    }
    
    // Imprime la fila con los sumatorios de columnas y el total
    System.out.print("\n|Sumatorio |");
    
    for (columna = 0; columna < 5; columna++) {
      System.out.printf("%6d   |", sumaColumna[columna]);
    }
    
    System.out.printf(" %5d   |", total);
  } 
}

