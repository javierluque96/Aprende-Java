import java.util.Scanner;

public class Ejercicio50 {
  
  public static void main (String[] args) {
    System.out.println("Este programa pinta el número 155.");
    
    Scanner s = new Scanner(System.in);
    int altura, espacios, i, j;
    boolean condicion = true;
    
    do{
      System.out.print("Introduzca la altura (5 como mínimo): ");
      altura = s.nextInt();
      
      System.out.print("Introduzca el número de espacios entre los números: ");
      espacios = s.nextInt();
      
      if (altura < 5 || espacios < 1) {
	condicion = false;
	System.out.println("\nValores erroneos, vuelve a introducirlos.\n");
      }
    } while(condicion == false);
    
    // Pinta la linea de arriba
    for (i = 0; i < 1; i++) {
      System.out.print("*");
      for (j = 1; j <= espacios; j++) {
	System.out.print(" ");
      }
      
      System.out.print("****");
      
      for (j = 1; j <= espacios; j++) {
	System.out.print(" ");
      }
      
      System.out.print("****");
      System.out.println();
    }
    
    // Pinta la parte de en medio superior
    for (i = 0; i < 1; i++) {
      System.out.print("*");
      for (j = 1; j <= espacios; j++) {
	System.out.print(" ");
      }
      
      System.out.print("*   ");
      
      for (j = 1; j <= espacios; j++) {
	System.out.print(" ");
      }
      
      System.out.print("*   ");
      System.out.println();
    }
    
    // Pinta la linea de en medio
    for (i = 0; i < 1; i++) {
      System.out.print("*");
      for (j = 1; j <= espacios; j++) {
	System.out.print(" ");
      }
      
      System.out.print("****");
      
      for (j = 1; j <= espacios; j++) {
	System.out.print(" ");
      }
      
      System.out.print("****");
      System.out.println();
    }
    
    // Pinta la parte de en medio inferior
    for (i = 0; i < (altura - 4); i++) {
      System.out.print("*");
      for (j = 1; j <= espacios; j++) {
	System.out.print(" ");
      }
      
      System.out.print("   *");
      
      for (j = 1; j <= espacios; j++) {
	System.out.print(" ");
      }
      
      System.out.print("   *");
      System.out.println();
    }
    
    // Pinta la linea inferior
    for (i = 0; i < 1; i++) {
      System.out.print("*");
      for (j = 1; j <= espacios; j++) {
	System.out.print(" ");
      }
      
      System.out.print("****");
      
      for (j = 1; j <= espacios; j++) {
	System.out.print(" ");
      }
      
      System.out.print("****");
      System.out.println();
    }
  }
}

