import array.ArrayBi;
import java.util.Scanner;

public class T8Ejercicio29a34 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Ejercicio 29
    System.out.println("Ejercicio 29:");
    int[][] a = array.ArrayBi.generaArrayBiInt(5, 8, 0, 100);
    
    array.ArrayBi.muestraArrayBiInt(a);
        
    // Ejercicio 30
   System.out.println("\nEjercicio 30:");
    System.out.print("Fila 2: ");
    array.Array.muestraArrayInt(array.ArrayBi.filaDeArrayBiInt(a, 2));
    
    // Ejercicio 31
    System.out.println("\nEjercicio 31:");
    System.out.print("Columna 6: ");
    array.Array.muestraArrayInt(array.ArrayBi.columnaDeArrayBiInt(a, 6));
    
    // Ejercicio 32
    System.out.println("\nEjercicio 32:");
    System.out.print("Coordenadas del 24 (fila, columna): ");
    array.Array.muestraArrayInt(array.ArrayBi.coordenadasEnArrayBiInt(a, 24));
    
    // Ejercicio 33
    System.out.println("\nEjercicio 33:");
    int[][] b = {{11, 10, 9}, {4, 5, 7}, {2, 6, 1}};
    array.ArrayBi.muestraArrayBiInt(b);
    System.out.println("\nBusca los puntos de silla: ");
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        if (array.ArrayBi.esPuntoDeSilla(b, i, j)) {
          System.out.println("fila " + i + ", columna " + j + " -> "  
	    + b[i][j]);
        }
      } // for j
    } // for i
    
    // Ejercicio 34
    System.out.println("\nEjercicio 34:");
    array.ArrayBi.muestraArrayBiInt(a);
    System.out.print("\nFila: ");
    int fila = s.nextInt();
    System.out.print("Columna: ");
    int columna = s.nextInt();
    System.out.print("Dirección (nose/neso): ");
    String direccion = s.next();
    System.out.print("\nDiagonal: ");
    array.Array.muestraArrayInt(array.ArrayBi.diagonal(a, fila, columna, 
      direccion));
    
  }

}
