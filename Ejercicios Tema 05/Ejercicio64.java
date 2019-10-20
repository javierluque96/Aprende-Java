import java.util.Scanner;

public class Ejercicio64 {
  
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int ancho = 6;
    int alto = 3;
    int aux;
    int i, j;
    int opcion;
    
    do {
      // Pinta el rectángulo
      for (i = 0; i < ancho; i++) {
	System.out.print("*");
      }
      
      for (i = 0; i < alto - 2; i++) {
	System.out.print("\n*");
	for (j = 0; j < ancho - 2; j++) {
	  System.out.print(" ");
	}
	System.out.print("*");
      }
      System.out.println();
      
      for (i = 0; i < ancho; i++) {
	System.out.print("*");
      }
      
      System.out.println("\n1. Agrandarlo");
      System.out.println("2. Achicarlo");
      System.out.println("3. Cambiar la orientación");
      System.out.println("4. Salir");
      System.out.print("Indique qué quiere hacer con el rectángulo: ");
      opcion = s.nextInt();
      
      switch (opcion) {
	case 1:
	  alto++;
	  ancho++;
	  break;
	case 2:
	  if ((ancho > 2) && (alto > 2)) {
	    alto--;
	    ancho--;
	  }
	  break;
	case 3:
	  aux = alto;
	  alto = ancho;
	  ancho = aux;
	  break;
      }
      System.out.println("\n");
      
    } while (opcion != 4);
  }
}

