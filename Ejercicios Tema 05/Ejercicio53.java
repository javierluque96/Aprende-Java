import java.util.Scanner;

public class Ejercicio53 {
  
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la altura de la figura: ");
    int altura = s.nextInt();
    int i;
    
    while (altura > 0) {
      for (i = altura; i > 0; i--) {
	System.out.print("*");
      }
      System.out.println();
      altura--;
    }    
    
  }
}

