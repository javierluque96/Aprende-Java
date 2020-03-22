public class T7Ejercicio11 {
  
  
  public static void main (String[] args) {
    int[][] numero = new int[10][10];
    int x, y;
    int maximo = 199;
    int minimo = 301;
    int suma = 0;
    String c = "";
    
    // Genera el array bidimensional
    for (y = 0; y < 10; y++) {
      for (x = 0; x < 10; x++) {
	numero[x][y] = (int) (Math.random() * 101 + 200);
	
	System.out.print(numero[x][y] + "  ");
      }
      System.out.println();
    }
    
    System.out.println("\nDiagonal: \n");
    
    
    x = 0;
    for (y = 0; y < 10; y++) {
      
      // Comprueba el maximo, el minimo y suma los números de la diagonal
      if (numero[x][y] > maximo) {
	maximo = numero[x][y];
      }
      
      if (numero[x][y] < minimo) {
	minimo = numero[x][y];
      }
      suma += numero[x][y];
      
      // Imprime los números que están en la diagonal de la esquina superior izq
      // a la esquina inferior derecha
      if (y > 0) {
	c += String.format("%5s", " ");
	
	System.out.print(c + numero[x][y]);
      } else {
	System.out.print(numero[x][y]);
      }
      
      x++;
      System.out.println();
    }
    // Imprime máximo, mínimo y media
    System.out.printf("\nMáximo: %d\nMínimo: %d\nMedia: %d", maximo, minimo,
      suma / 10);
  } 
}

