public class Ejercicio69 {
  
  public static void main (String[] args) {
    System.out.println("Este programa pinta una pirámide maya.");
    
    System.out.print("Introduce la altura de la pirámide maya (mayor o igual "
      + "a 3): ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    int altura = 1;
    int espacios = alturaIntroducida - 1;
    int caracteresImpares = 6;
    int caracteresPares = 2;
    int i;
    
    while (altura <= alturaIntroducida) {
      // Inserta espacios a la izquierda
      for (i = 0; i < espacios; i++) {
	System.out.print(" ");
      }
      
      if (altura % 2 == 0) { // Si es linea par
	for (i = 0; i < caracteresPares; i++) {
	  System.out.print("*");
	}
	
	System.out.print("    ");
	
	for (i = 0; i < caracteresPares; i++) {
	  System.out.print("*");
	}
	caracteresPares += 2;
      
      } else { // Si es linea impar
	for (i = 0; i < caracteresImpares; i++) {
	  System.out.print("*");
	}
      }
      System.out.println();
      
      caracteresImpares += 2;
      espacios--;
      altura++;
    } // While
  }
}

