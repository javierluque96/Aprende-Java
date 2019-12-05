import java.util.Scanner;

import array.Array;
import array.ArrayBi;

public class T8Ejercicio56 {
  
  public static void main (String[] args) {
    // Función que pide en el ejercicio está en el archivo de Array
    
    int[][] a = ArrayBi.generaArrayBiInt(3, 8, 1, 100);
    ArrayBi.muestraArrayBiInt(a);
    
    
    System.out.println("\nLa corteza del array es ");
    
    Array.muestraArrayInt(ArrayBi.corteza(a));
      


  } 
}

