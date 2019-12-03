import java.util.Scanner;

import matematicas.Varias;

public class T8Ejercicio35 {
  
  public static void main (String[] args) {
    System.out.println(convierteEnPalotes(430215));
    System.out.println(convierteEnPalotes(430210));
  } 
  
  /** 
   * Convierte un número entero al sistema de palotes.
   * 
   * @param n número entero que queremos convertir a sistema palotes
   * @return  número convertido al sistema palotes
   */
  public static String convierteEnPalotes(int n) {

    String palotes = "";
    
    for (int i = 0; i < matematicas.Varias.digitos(n); i++) {
      for(int j = matematicas.Varias.digitoN(n, i); j > 0; j--) {
	palotes += "|";
      }
      
      if (i < (matematicas.Varias.digitos(n) - 1)) {
	palotes += "-";
      } 
    }
    
    return palotes;
  }
}

