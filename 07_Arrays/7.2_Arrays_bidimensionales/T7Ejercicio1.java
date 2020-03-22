public class T7Ejercicio1 {
  
  public static void main (String[] args) {
    int[][] numero = new int[3][6]; // 3 Filas y 6 Columnas 
    int fila, columna;
    
    // Fila 0
    numero[0][0] = 0;
    numero[0][1] = 30;
    numero[0][2] = 2;
    numero[0][5] = 5;
    
    // Fila 1
    numero[1][0] = 75;
    numero[1][4] = 0;
    
    // Fila 2
    numero[2][2] = -2;
    numero[2][3] = 9;
    numero[2][5] = 11;
    

    System.out.print("|Array num |");
    for (columna = 0; columna < 6; columna++) {
      System.out.printf("Columna%2d|", columna);
    }
    
    System.out.println();
    
    for (fila = 0; fila < 3; fila++) {
      System.out.printf("|  Fila%2d  |", fila);
      
      for (columna = 0; columna < 6; columna++) {
	System.out.printf(" %5d   |", numero[fila][columna]);
      }
      
      System.out.println();
    }
  } 
}

