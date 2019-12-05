import java.util.Scanner;

import array.Array;

public class T8Ejercicio50 {
  
  public static void main (String[] args) {
    // Función que pide en el ejercicio está en el archivo de Array
    
    int[] a = {8, 9, 0};
    int[] b = {1, 2, 3};
    int[] c = { };
    int[] d = {4};
    
    array.Array.muestraArrayInt(array.Array.mezcla(a, b));
    array.Array.muestraArrayInt(array.Array.mezcla(b, c));
    array.Array.muestraArrayInt(array.Array.mezcla(b, d));
  } 
}

