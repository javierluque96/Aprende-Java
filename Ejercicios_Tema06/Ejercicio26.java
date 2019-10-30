public class Ejercicio26 {
  
  public static void main (String[] args) {
    System.out.print("Introduzca la altura de la tableta: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la anchura de la tableta: ");
    int anchura = Integer.parseInt(System.console().readLine());
    
    int i, j;
    int bocado = (int)(Math.random() * (2 * (anchura + altura - 2)));
    int posicion = 0;
    boolean borde = false;
    
    for (i = 0; i < altura; i++) {
      for (j = 0; j < anchura; j++) {
	// Establece si estamos en un borde
	borde = (i == 0) || (i == altura - 1) || (j == 0) || (j == anchura - 1);
	
	// Si estamos en un borde pegamos bocado
	if (posicion == bocado && borde) {
	  System.out.print(" ");
	} else {
	  System.out.print("*");
	}
	
	if (borde) {
	  posicion++;
	}
      }
	System.out.println();
    }
  } 
}


