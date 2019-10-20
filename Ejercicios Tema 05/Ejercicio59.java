import java.util.Scanner;

public class Ejercicio59 {
  
  public static void main (String[] args) {
    System.out.println("Este programa pinta un árbol de navidad.");
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la altura del árbol (mayor o igual a 4): ");
    int altura = s.nextInt();
    
    int i, j;
    int espacios = 1;
    
    // Pinta la bola de navidad
    for (i = 0; i < altura - 3; i++) {
	System.out.print(" ");
      }
      System.out.print("*\n");
      
    // Pinta el pico del árbol
    for (i = 0; i < altura - 3; i++) {
      System.out.print(" ");
    }
    System.out.print("^\n");
    
    // Pinta la parte de arriba del árbol
    for (i = 0; i < altura - 4; i++) {
      // Inserta espacios izquierdos del árbol
      for (j = 0; j < altura - 4 - i; j++) {
	System.out.print(" ");
      }
      System.out.print("^");
      
      // Inserta espacios entre los ^
      for (j = 1; j <= espacios; j ++) {
	System.out.print(" ");
      }
      espacios += 2;
      
      System.out.print("^\n");
    }
    
    // Pinta la base
    for (i = 0; i < ((altura - 3) * 2 + 1); i++) {
	System.out.print("^");
      }
    
    // Pinta el tronco Y
    System.out.println();
    for (i = 0; i < altura - 3; i++) {
	System.out.print(" ");
      }
      System.out.print("Y");
  }
}

