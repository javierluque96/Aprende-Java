/* Hacer un programa que dada una cantidad X en B expresando su equivalencia en 
 * aMB + bkB + cB --> Ejemplo: 6,299, 657 B --> 6MB + 8kB + 9B */

public class EjercicioClase {
	
  public static void main (String[] args) {
    
    int i;
    int b, kb, mb;
    
    System.out.println("Introduce la cantidad de bytes que se expresara de "
      + "forma compleja:");
      
      i = Integer.parseInt(System.console().readLine());
      
      b = i % 1024;
      
      i = i / 1024;
      
      kb = i % 1024;
      
      mb = i / 1024;
      
      System.out.printf("MB: %d \nkB: %d \nB: %d", mb, kb, b);
  
  }
}
