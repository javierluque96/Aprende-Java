public class T7Ejercicio12 {
  
  
  public static void main (String[] args) {
    int[][] numero = new int[9][9];
    int x, y;
    int maximo = 399;
    int minimo = 901;
    int suma = 0;
    String c = "";
    
    // Genera el array bidimensional
    for (y = 0; y < 9; y++) {
      for (x = 0; x < 9; x++) {
	numero[x][y] = (int) (Math.random() * 401 + 500);
	
	System.out.print(numero[x][y] + "  ");
      }
      System.out.println();
    }
    
    System.out.println("\nAhora imprimimos solo la diagonal: \n");
    
    // Imprime los números que están en la diagonal de la esquina inferior izq
    // a la esquina superior derecha
    x = 8;
    for (y = 0; y < 9; y++) {
      // Comprueba el maximo, el minimo y suma los números de la diagonal
      if (numero[x][y] > maximo) {
	maximo = numero[x][y];
      }
      
      if (numero[x][y] < minimo) {
	minimo = numero[x][y];
      }
      suma += numero[x][y];
      
      // Imprime los números que están en la diagonal de la esquina i izq
      // a la esquina superior derecha
      if (x > 0) {
	// Introduce espacios antes del número
	c = String.format("%%%ds", (x * 5));
	
	// Imprime los espacios y el número
	System.out.printf(c + "%d", " ", numero[x][y]);
      } else { // Si estamos en la ultima linea imprime el número sin espacios
	System.out.print(numero[x][y]);
      }
      
      x--;
      System.out.println();
    }
    // Imprime máximo, mínimo y media
    System.out.printf("\nMáximo: %d\nMínimo: %d\nMedia: %d", maximo, minimo,
      suma / 9);
  } 
}

