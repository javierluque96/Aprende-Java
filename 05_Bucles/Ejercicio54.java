import java.util.Scanner;

public class Ejercicio54 {
  
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce la altura de la figura: ");
    int altura = s.nextInt();
    
    int espacios = altura - 3;
    int i, j;
    
    // Pinta la linea de arriba
    for (i = 0; i < altura; i++) {
      System.out.print("*");
    }
    
    // Pinta las lineas con espacios en medio
    for (i = 0; i < altura - 2; i++) {
      System.out.print("\n*");
      
      for (j = 0; j < altura - 3 - i; j++) {
	System.out.print(" ");
      }
      
      System.out.print("*");
    }
    
    System.out.print("\n*");
  }
}

