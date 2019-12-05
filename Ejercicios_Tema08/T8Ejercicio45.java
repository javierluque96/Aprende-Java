import java.util.Scanner;

import matematicas.Varias;

public class T8Ejercicio45 {
  
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura de la figura: ");
    int altura = s.nextInt();
    
    int espacios = altura * 2 - 3;
    int i;
    
    for (i = 1; i < altura; i++) {
      System.out.print(linea('*', i));
      System.out.print(linea(' ', espacios));
      System.out.println(linea('*', i));
      
      espacios -= 2;
    }
    
    System.out.println(linea('*', altura * 2 - 1));
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

