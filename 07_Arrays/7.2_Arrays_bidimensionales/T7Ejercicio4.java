public class T7Ejercicio4 {
  
  public static void main (String[] args) 
    throws InterruptedException { // Permite usar sleep
    int[][] num = new int[4][5]; 
    int[] sumaFila = new int[4];
    int[] sumaColumna = new int[5];
    int fila, columna;
    int total = 0;
    
    // Recoge los 20 números en el array 
    
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
	num[fila][columna] = (int)(Math.random() * 900 + 100);
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
    System.out.print("|Array num |");
    
    for (columna = 0; columna < 5; columna++) {
      System.out.printf("Columna%2d|", columna);
      Thread.sleep(100);
    }
    
    System.out.print("Sumatorio|");
    
    for (fila = 0; fila < 4; fila++) {
      System.out.print("\n|");
      System.out.printf("  Fila%2d  |", fila);
      Thread.sleep(100);
      
      for (columna = 0; columna < 6; columna++) {
	if (columna == 5) { // Imprime sumatorio de la fila
	  System.out.printf(" %6d  |", sumaFila[fila]);
	  Thread.sleep(500);
	} else {
	  System.out.printf(" %5d   |", num[fila][columna]);
	  Thread.sleep(500);
	}
      }
    }
    
    // Imprime la fila con los sumatorios de columnas y el total
    System.out.print("\n|Sumatorio |");
    
    for (columna = 0; columna < 5; columna++) {
      System.out.printf("%6d   |", sumaColumna[columna]);
      Thread.sleep(500);
    }
    
    System.out.printf(" %6d  |", total);
  
  } 
}
