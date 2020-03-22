import java.util.Scanner;

public class Ejercicio63 {
  
  public static void main (String[] args) {
    System.out.println("Este programa pinta dos piramides.");
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la altura de la primera pirámide: ");
    int altura1 = s.nextInt();
    
    System.out.print("Introduce la altura de la segunda pirámide: ");
    int altura2 = s.nextInt();
    
    int altura = 1;
    int i;
    int espacios = altura1 - 1;
    int espaciosSobreP1 = altura1 * 2 - 1 + altura2;
    int espaciosEntrePiramides;
    int caracteres1 = 1;
    int caracteres2 = 1;
    
    
    // Si la piramide 1 es mayor que la piramide 2
    if (altura1 >= altura2) {
      
      espaciosEntrePiramides = altura1 * 2 - 3;
      
      while (altura < altura1) {
	//Inserta espacios P1
	for (i = 1; i < espacios; i++) {
	  System.out.print(" ");
	}
	
	// Pinta los caracteres de la P1
	for (i = 0; i < caracteres1; i++) {
	  System.out.print("*");
	}
	
	// Pinta los espacios entre piramides
	for (i = 0; i < espaciosEntrePiramides; i++) {
	  System.out.print(" ");
	}
	
	//Inserta los caracteres de la P2
	if (altura >= (altura1 - altura2)) {
	  for (i = 0; i < caracteres2; i++) {
	    System.out.print("*");
	  }
	  caracteres2 += 2;
	}
	
	System.out.println();
	
	espaciosEntrePiramides -= 2;
	altura++;
	espacios--;
	caracteres1 += 2;
      } // while
    
    } else { 
    
      espaciosEntrePiramides = altura2 * 2 - 1;
      
      while (altura <= altura2) {
    
	// Pinta los huecos encima de la P1
	if (altura <= (altura2 - altura1)) {
	  for (i = 0; i < espaciosSobreP1; i++) {
	    System.out.print(" ");
	  }
	}
	
	// Pinta la P1
	if (altura > (altura2 - altura1)) {
	  //Inserta espacios
	  for (i = 1; i <= espacios; i++) {
	    System.out.print(" ");
	  }
	    
	  for (i = 0; i < caracteres1; i++) {
	    System.out.print("*");
	  }
	  // Pinta los espacios entre piramides
	  for (i = 0; i < espaciosEntrePiramides; i++) {
	    System.out.print(" ");
	  }
	  caracteres1 += 2;
	  espacios--;
	}  
	
	// Pinta los caracteres de la P2
	for (i = 0; i < caracteres2; i++) {
	  System.out.print("*");
	}
	
	System.out.println();
	
	espaciosSobreP1--;
	espaciosEntrePiramides -= 2;
	altura++;
	caracteres2 += 2;
      } // while
    }
  }
}

