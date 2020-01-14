import java.util.Scanner;

public class Ejercicio66 {
  
  public static void main (String[] args) {
    System.out.println("Este programa pinta una señal de tráfico.");
    
    Scanner s = new Scanner(System.in);
    int altura;
    int i, j;
    boolean error;
    
    do {
      error = false;
      
      System.out.print("Introduce la altura de la señal de tráfico (número "
	+ "impar mayor o igual que 3): ");
      altura = s.nextInt();
      
      if ((altura < 3) || (altura % 2 == 0)) {
	System.out.println("VALORES ERRONEOS");
	error = true;
      }
    } while (error == true);
    
    // Dibuja la señal de tráfico hasta la mitad
    for (i = 0; i < (altura / 2 + 1); i++) {
      // Inserta los espacios a la izquierda
      for (j = 0; j < i; j++) {
	System.out.print(" ");
      }
      System.out.print("*    *\n");
    }
    
    for (i = altura / 2 - 1; i >= 0; i--) {
      // Inserta los espacios a la izquierda
      for (j = 0; j < i; j++) {
	System.out.print(" ");
      }
      System.out.print("*    *\n");
    }
  } 
}

