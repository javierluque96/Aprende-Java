import java.util.Scanner;

public class Ejercicio65 {
  
  public static void main (String[] args) {
    System.out.println("Este programa pinta una A.");
    
    Scanner s = new Scanner(System.in);
    int altura, fila;
    boolean error = false;
    
    do {
      System.out.print("Introduce la altura de la A (mayor o igual a 3): ");
      altura = s.nextInt();
      
      System.out.print("Introduce el palito de la fila horizontal (entre 2 "
	+ "y 6): ");
      fila = s.nextInt();
    
      if ((fila > 6) || (fila < 2) || (altura < 3)) {
	error = true;
      }
    } while (!error);
  } 
}

