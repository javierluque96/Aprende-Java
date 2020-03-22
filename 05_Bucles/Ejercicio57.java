import java.util.Scanner;

public class Ejercicio57 {
  
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la altura de la figura: ");
    int altura = s.nextInt();
    int i, j;
    
    // Pinta la linea de arriba
    for (i = 0; i < altura; i++) {
      System.out.print("*");
    }
    System.out.println();
    // Pinta las lineas centrales
    for (i = 0; i < altura - 2; i++) {
      // Inserta espacios izquierdos
      for (j = altura - i; j <= altura ; j++) {
	System.out.print(" ");
      }
      
      System.out.print("*");
      
      // Inserta espacios centrales
      for (j = 0; j < altura - 3 - i; j++) {
	System.out.print(" ");
      }
      
      System.out.print("*\n");
    }
    
    for (i = 1; i < altura; i++) {
      System.out.print(" ");
    }
    
    System.out.print("*");
  }
}

;
