import java.util.Scanner;

import matematicas.Varias;
import array.Array;

public class T8Ejercicio51 {
  
  public static void main (String[] args) {
    
    int[] a = Array.generaArrayInt(10, 2, 100);
    
    System.out.println("Array generado: ");
    
    Array.muestraArrayInt(a);
    
    for(int n : a) {
      if (Varias.esPrimo(n) && Varias.esCapicua(n)) {
	System.out.println("El " + n + " es primo y capicúa.");
      } else if (Varias.esPrimo(n) && !Varias.esCapicua(n)) {
	System.out.println("El " + n + " es primo y no es capicúa.");
      } else if (!Varias.esPrimo(n) &&  Varias.esCapicua(n)) {
	System.out.println("El " + n + " no es primo y es capicúa.");
      } else {
	System.out.println("El " + n + " no es primo y no es capicúa.");
      }
      
      /* Otra forma de resolverlo sería:
      
	for (int n : a) {
	  if (Varias.esPrimo(n)) {
	    System.out.print("El " + n + " es primo");
	  } else {
	    System.out.print("El " + n + " no es primo");
	  }
	  
	  if (Varias.esCapicua(n)) {
	    System.out.println(" y es capicúa.");
	  } else {
	    System.out.println(" y no es capicúa.");
	  }
	}
	
      */
    }
  } 
}

