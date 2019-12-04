import java.util.Scanner;

import matematicas.Varias;

public class T8Ejercicio39 {
  
  public static void main (String[] args) {
    System.out.println(convierteEnPalabras(470213));
    
    System.out.println(convierteEnPalabras(0));
  } 
  
  /**
   * Convierte los dígitos del número que pasamos por parametro a palabras.
   * 
   * @param n número entero
   * @return  String con los dígitos del número convertidos a palabras
   */
  public static String convierteEnPalabras(int n) {
    String num = "";
    
    for (int i = 0; i < matematicas.Varias.digitos(n); i++) {
      switch(matematicas.Varias.digitoN(n, i)) {
	case 0:
	  num += "cero";
	  break;
	case 1:
	  num += "uno";
	  break;
	case 2:
	  num += "dos";
	  break;
	case 3:
	  num += "tres";
	  break;
	case 4:
	  num += "cuatro";
	  break;
	case 5:
	  num += "cinco";
	  break;
	case 6:
	  num += "seis";
	  break;
	case 7:
	  num += "siete";
	  break;
	case 8:
	  num += "ocho";
	  break;
	case 9:
	  num += "nueve";
	  break;
	default:
      }
      if (i < matematicas.Varias.digitos(n) - 1) {
	num += ", ";
      }
    }
    
    return num;
  }
}

