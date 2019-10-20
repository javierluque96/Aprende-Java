import java.util.Scanner;

public class Ejercicio65 {
  
  public static void main (String[] args) {
    System.out.println("Este programa pinta una A.");
    
    Scanner s = new Scanner(System.in);
    int alturaIntroducida, fila;
    int altura = 1;
    int espaciosIzq;
    int espaciosCentro = 1;
    int base;
    int i;
    boolean error;
    
    do {
      error = false;
      
      System.out.print("Introduce la altura de la A (mayor o igual a 3): ");
      alturaIntroducida = s.nextInt();
      
      fila = alturaIntroducida - 1;
      System.out.print("Introduce el palito de la fila horizontal (entre 2 "
	+ "y " + fila + "): ");
      fila = s.nextInt();
    
      if ((fila >= alturaIntroducida) || (fila < 2) || 
	(alturaIntroducida < 3)) {
	System.out.println("Datos erróneos.\n");
	error = true;
      }
    } while (error == true);
    
    espaciosIzq = alturaIntroducida - 1;
    
    while (altura <= alturaIntroducida) {
      // Inserta espacios a la izquierda de la A
      for (i = 0; i < espaciosIzq; i++) {
	System.out.print(" ");
      }
      
      System.out.print("*");
      
      if (altura > 1) {
      	if (altura == fila) {
	// Pinta el palito central de la A
	for (i = 0; i < (altura * 2 - 2); i++) {
	  System.out.print("*");
	}
	espaciosCentro += 2;
	} else {
	// Inserta espacios dentro de la A
	for (i = 0; i < espaciosCentro; i++) {
	  System.out.print(" ");
	}
	espaciosCentro += 2;
	System.out.print("*");
	}
      }
      
      System.out.println();
      
      espaciosIzq--;
      altura++;
    }
  } 
}

