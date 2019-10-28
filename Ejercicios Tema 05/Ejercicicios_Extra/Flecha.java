public class Flecha {
  
  public static void main (String[] args) {
    System.out.println("Este programa imprime una piramide orientada a la "
      + "derecha");
    
    System.out.print("Introduce la altura de la piramide (multiplo de 4 mayor "
      + "o igual que 8): ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int linea = 1;
    int espaciosIzq = (altura / 2) - 1;
    int lineaSuperior = 1;
    int espacios = 1;
    int i;
    
    // Pinta la piramide superior de la flecha
    while (linea < (altura / 2)) {
      // Inserta los espacios a la izquierda
      for (i = 0; i < espaciosIzq; i++) {
	System.out.print("  ");
      }
      
      // Pinta caracteres
      System.out.print("* ");
      
      if (linea > 1) {
	// Pinta espacios de en medio de la piramide
	for (i = 0; i < espacios; i++) {
	  System.out.print("  ");
	}
	espacios += 2;
	
	// Pinta caracteres
	System.out.print("*");
	
      }
      
      System.out.println();
      
      espaciosIzq--;
      linea++;
    }
    
    // Pinta la pinche base de la piramide
    for (i = 0; i < (altura / 4 + 1); i++) {
      System.out.print("* ");
    }
    for (i = 0; i < (altura / 2 - 3); i++) {
      System.out.print("  ");
    } 
    for (i = 0; i < (altura / 4 + 1); i++) {
      System.out.print("* ");
    }
    System.out.println();
    
    
    // Pinta la parte de abajo de la pinche piramide
    while (linea >= 0) {
      // Pinta los espacios a la izquierda
      for (i = 0; i < (altura / 4); i++) {
	System.out.print("  ");
      }
      // Pinta asteriscos de la izquierda
      System.out.print("* ");
      // Pinta espacios de en medio
      if (linea == 0) {
	for (i = 0; i < (altura / 2 - 3); i++) {
	  System.out.print("* ");
	}
      } else {
	for (i = 0; i < (altura / 2 - 3); i++) {
	  System.out.print("  ");
	} 
      }
      // Pinta asterisco de la derecha
      System.out.print("*");
      
      System.out.println();
	
      linea--;
    }
    
  } 
}

