/**
 * PruebaPiramide.java
 * @author Javier Luque Rodríguez
 */


public class PruebaPiramide {
	
  public static void main (String[] args) {
    Piramide p1 = new Piramide(5, '*');
    int opcion;
    char c;
    
    System.out.print(p1);
    
    do {
      System.out.println("1. Aumentar tamaño");
      System.out.println("2. Disminuir tamaño");
      System.out.println("3. Cambiar dibujo");
      System.out.println("4. Salir");
      System.out.print("Elige una opción:");
      opcion = Integer.parseInt(System.console().readLine());
      
      switch(opcion) {
	case 1:
	  if (p1.aumentarAltura()) {
	    p1.aumentarAltura();
	    System.out.println(p1);
	  } else {
	    System.out.println("La altura no puede ser mayor que 12.\n");
	  }
	  
	  break;
	case 2:
	  if (p1.disminuirAltura()) {
	    p1.disminuirAltura();
	    System.out.println(p1);
	  } else {
	    System.out.println("La altura no puede ser menor que 1.\n");
	  }
	  
	  break;
	case 3:
	  System.out.print("Introduce el caracter con el que quiere que se dibuje la piramide:");
	  c = System.console().readLine().charAt(0);
	  
	  p1.setCaracter(c);
	  
	  System.out.println(p1);
	  break;
	default:
      }
    } while (opcion != 4);
  }
}

