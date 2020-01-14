import java.util.Scanner;

import array.Array;

public class T8Ejercicio38 {
  
  public static void main (String[] args) {
    // Función que pide en el ejercicio está en el archivo de Array
    
    int[] a = {202, 4, 303, 112, 1001, 1551, 1231, 55, 8998, };
    array.Array.muestraArrayInt(array.Array.filtraCapicuas(a));
    
    int[] b = {42, 61, 83, 94, 10, 12};
    array.Array.muestraArrayInt(array.Array.filtraCapicuas(b));
  } 
}

