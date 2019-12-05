import java.util.Scanner;

import matematicas.Varias;
import array.Array;

public class T8Ejercicio54 {
  
  public static void main (String[] args) {
    
    int[] a = Array.generaArrayInt(5, 1, 10);
    
    System.out.println("Ocurrencias de 1 en 123451123: " 
      + Varias.ocurrencias(1, 123451123) + "\nArray:");
    
    Array.muestraArrayInt(a);
    System.out.println("Ocurrencias de 1 en el array: " 
      + Array.ocurrencias(1, a));
    

  } 
}

