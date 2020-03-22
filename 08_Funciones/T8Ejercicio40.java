import java.util.Scanner;

import array.Array;

public class T8Ejercicio40 {
  
  public static void main (String[] args) {
    // Función que pide en el ejercicio está en el archivo de Array
    
    int[] a = {7, 0, 207, 274, 700, 1571, 1231, 55, 8998, };
    int[] b = {42, 61, 83, 94, 10, 12};
    
    array.Array.muestraArrayInt(array.Array.filtraCon7(a));
    array.Array.muestraArrayInt(array.Array.filtraCon7(b));
  } 
}

