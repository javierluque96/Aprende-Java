import java.util.Scanner;

import array.Array;

public class T8Ejercicio36 {
  
  public static void main (String[] args) {
    // Función que pide en el ejercicio está en el archivo de Array
    
    int[] a = {2, 4, 3, 12, 11, 15, 11, 5, 8, 7};
    array.Array.muestraArrayInt(array.Array.filtraPrimos(a));
    
    int[] b = {4, 6, 8, 9, 10, 12};
    array.Array.muestraArrayInt(array.Array.filtraPrimos(b));
  } 
}

