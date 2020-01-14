import java.util.Scanner;

public class Ejercicio61 {
  
  public static void main (String[] args) {
    System.out.println("Este programa pinta una V.");
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura de la V (mayor o igual a 3): ");
    int alturaIntroducida = s.nextInt();
    
    int altura = 0;
    int i;
    int espacios = alturaIntroducida * 2 - 2;
    
    if (alturaIntroducida < 3) {
      System.out.println("ERROR. VALOR INTRODUCIDO ERRONEO.");
    } else {
      while (altura < alturaIntroducida) { 
	// Inserta espacios a la izquierda
	for (i = 0; i < altura; i++) {
	  System.out.print(" ");
	}
	
	System.out.print("***");
	
	// Inserta los espacios de en medio
	for (i = 0; i < espacios; i++) {
	  System.out.print(" ");
	}
	
	System.out.print("***");
	System.out.println();
	
	altura++;
	espacios -= 2;
      }
    }
  }
}

