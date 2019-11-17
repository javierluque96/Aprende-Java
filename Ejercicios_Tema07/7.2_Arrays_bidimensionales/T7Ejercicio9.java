public class T7Ejercicio9 {
  
  public static void main (String[] args) {
    int[][] num = new int[12][12];
    int[][] resultado = new int[12][12];
    int x, y; // x = fila, y = columna
    int contador = 1;
    int inicioColumna = 0;
    int finalColumna = 12;
    
    // Genera el array con números aleatorios
    for (x = 0; x < 12; x++) {
      for (y = 0; y < 12; y++) {
	num[x][y] = (int)(Math.random() * 101);
	System.out.printf("%5d", num[x][y]);
      }
      System.out.println("\n");
    }
    
    // Parte superior
    for (x = 0; x < 6; x++) {
      for (y = inicioColumna; y < finalColumna; y++) {
	// Rota primer número de la capa
	if (y == inicioColumna) { 
	  resultado[x][y] = num[x + 1][inicioColumna];
	
	// Rota los números a la derecha por capa
	} else if (y > inicioColumna) { 
	  resultado[x][y] = num[x][y - 1];
	}
      }
      // Rota de abaajo a arriba los números 
      // de las columnas de la parte izquierda por capa
      for (y = 0; y < inicioColumna; y++) {
	resultado[x][y] = num[x + 1][y];
      }
      
      // Rota de arriba a abajo
      // los números de las columnas de la parte derecha por capa
      for (y = 11; y >= finalColumna; y--) {
	resultado[x][y] = num[x - 1][y];
      }
      
      inicioColumna++;
      finalColumna--;
    }
    
    // Parte inferior
    inicioColumna = 0;
    finalColumna = 12;
    for (x = 11; x >= 6; x--) {
      for (y = inicioColumna; y < finalColumna; y++) {
	// Rota el ultimo número de la capa
	if (y == finalColumna - 1) { 
	  resultado[x][y] = num[x - 1][finalColumna - 1];
	
	// Rota los números a la izquierda de la capa
	} else if (y  < finalColumna - 1) { 
	  resultado[x][y] = num[x][y + 1];
	}
      }
      
      // Rota de abaajo a arriba los números 
      // de las columnas de la parte izquierda por capa
      for (y = 0; y < inicioColumna; y++) {
	resultado[x][y] = num[x + 1][y];
      }
      
      // Rota de arriba a abajo
      // los números de las columnas de la parte derecha por capa
      for (y = 11; y >= finalColumna; y--) {
	resultado[x][y] = num[x - 1][y];
      }
      
      inicioColumna++;
      finalColumna--;
    }
    
    // Imprime el array resultado
    System.out.println("\nArray Resultado:\n");
    for (x = 0; x < 12; x++) {
      for (y = 0; y < 12; y++) {
	System.out.printf("%5d", resultado[x][y]);
      }
      System.out.println("\n");
    }
  } 
}

