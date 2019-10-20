import java.util.Scanner;

public class Ejercicio56 {
  
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la altura de la figura: ");
    int altura = s.nextInt();
    int i, j;
    
    // Pinta tantas lineas como altura introducida
    for (i = 0; i < altura; i++) {
      // Inserta espacios
      for (j = altura - i; j < altura ; j++) {
	System.out.print(" ");
      }
      // Inserta asteriscos
      for (j = 0; j < altura - i; j++) {
	System.out.print("*");5
      }
      System.out.println();
    }
    
  }
}

