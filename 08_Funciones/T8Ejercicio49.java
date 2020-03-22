import java.util.Scanner;

import array.Array;

public class T8Ejercicio49 {
  
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("¿Cuántos términos de la sucesión look and say quiere "
      + "calcular?");
    int repeticiones = s.nextInt();
    int[] num = {1};
    int[] aux = {1};
    int[] c = {};
    int i, j;
    String salida = "";
    
    for (i = 0; i < repeticiones; i++) {
      for(j = 0; j < i; j++) {
	c = array.Array.concatena(aux, num);
      }
      
      salida = array.Array.convierteArrayEnString(c) + ",";
    }
    
    System.out.println(salida);
  } 
}

