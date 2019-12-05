import java.util.Scanner;

import matematicas.Varias;

public class T8Ejercicio46 {
  
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura de la figura: ");
    int altura = s.nextInt();
    
    int espacios = altura * 2 - 3;
    int i;
    
    for (i = 1; i < altura; i++) {
      System.out.print(extremos('*', i));
      System.out.print(linea(' ', espacios));
      System.out.println(extremos('*', i));
      
      espacios -= 2;
    }
    
    System.out.println(linea('*', altura * 2 - 1));
  } 
  
  public static String linea(char caracter, int repeticiones) {
    String lin = "";
    
    for (int i = 0; i < repeticiones; i++) {
      lin += caracter;
    }
    
    return lin;
  }
  
  public static String extremos(char caracter, int longitud) {
    String linea = "";
    if (longitud == 1) {
      linea += caracter;
      return linea;
    }
    
    linea += caracter + linea(' ', longitud - 2) + caracter;
    return linea;
  }
}

