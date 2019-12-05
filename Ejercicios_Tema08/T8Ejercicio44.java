import java.util.Scanner;

import matematicas.Varias;

public class T8Ejercicio44 {
  
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura de la figura: ");
    int altura = s.nextInt();
    String espacios = " ";
    
    System.out.println(linea('*', altura));
    
    for (int i = altura - 1; i > 0; i--) {
      System.out.print(espacios + "*" +  linea(' ', i - 2));
      if (i > 1) {
	System.out.println("*");
      }
      espacios += " ";
    }
  } 
  
  /**
   * Devuelve un String con un caracter repetido n veces.
   * 
   * @param caracter     caracter que queremos que se repita
   * @param repeticiones número de veces que queremos que se repita el caracter
   * @return 		 cadena de caracteres con el caracter indicado repetido
   * 			 tantas veces como repeticiones indicadas
   */
  public static String linea(char caracter, int repeticiones) {
    String lin = "";
    
    for (int i = 0; i < repeticiones; i++) {
      lin += caracter;
    }
    
    return lin;
  }
}

