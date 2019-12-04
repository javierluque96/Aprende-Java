import java.util.Scanner;

import matematicas.Varias;

public class T8Ejercicio37 {
  
  public static void main (String[] args) {
    System.out.println(convierteEnMorse(213));
    
    System.out.println(convierteEnMorse(0));
  } 
  
  /**
   * Convierte el número que pasamos por parámetro al sistema Morse.
   * 
   * @param num número entero 
   * @return    String con el número convertido a morse
   */
  public static String convierteEnMorse(int num) {
    String morse = "";
    int i, j, d;
    int voltea = 0;     
    
    // Codifica el número
    for(i = 0;  i < matematicas.Varias.digitos(num); i++) {
      
      // Codifica cada número a morse
      if (matematicas.Varias.digitoN(num, i) == 0) {
	for (i = 0; i < 5; i++) {
	  morse += "-";
	}
      } else if (matematicas.Varias.digitoN(num, i) < 6) {
	for (j = 1; j < 6; j++) {
	  if (j <= matematicas.Varias.digitoN(num, i)) {
	    morse += ".";
	  } else {
	    morse += "-";
	  }
	}
      } else {
	for (j = 6; j <= 10; j++) {
	  if (j <= matematicas.Varias.digitoN(num, i)) {
	    morse += "-";
	  } else {
	    morse += ".";
	  }
	}
      }
      
      morse += " ";
    } 
      
    return morse;
  }
}

