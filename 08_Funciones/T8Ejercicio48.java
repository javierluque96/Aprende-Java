import java.util.Scanner;

import array.Array;

public class T8Ejercicio48 {
  
  public static void main (String[] args) {
    // Función que pide en el ejercicio está en el archivo de Array
    
    int[] a = {8, 9, 0};
    int[] b = {1, 2, 3};
    int[] c = { };
    
    array.Array.muestraArrayInt(array.Array.concatena(a, b));
    array.Array.muestraArrayInt(array.Array.concatena(a, c));
  } 
}

