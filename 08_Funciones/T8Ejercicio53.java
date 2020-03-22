import java.util.Scanner;

import matematicas.Varias;
import array.ArrayBi;

public class T8Ejercicio53 {
  
  public static void main (String[] args) {
    // Función que pide en el ejercicio está en el archivo de Array
    
    int[][] a = ArrayBi.generaArrayBiInt(4, 6, 1, 100);
    ArrayBi.muestraArrayBiInt(a);
    
    
    System.out.println("\nEl número que ocupa la posición 4 es " + 
      ArrayBi.nEsimo(a, 4));
      
    System.out.println("\nEl número que ocupa la posición 0 es " + 
      ArrayBi.nEsimo(a, 0));
      
    System.out.println("\nEl número que ocupa la posición 13 es " + 
      ArrayBi.nEsimo(a, 13));
      
    System.out.println("\nEl número que ocupa la posición 23 es " + 
      ArrayBi.nEsimo(a, 23));
      
    System.out.println("\nEl número que ocupa la posición 24 es " + 
      ArrayBi.nEsimo(a, 24));

  } 
}

