import java.util.Scanner;

import matematicas.Varias;
import array.Array;

public class T8Ejercicio55 {
  
  public static void main (String[] args) {
    
    // Función que pide en el ejercicio está en el archivo de Array

    String[] a = {"casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador",
      "sol", "CASA", "casa", "coche"};
      
    System.out.println("Array original: ");
    Array.muestraArrayString(a);
    System.out.println("\nArray sin elementos repetidos: ");
    Array.muestraArrayString(Array.sinRepetir(a));
  } 
}

