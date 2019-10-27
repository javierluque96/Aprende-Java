public class Ejercicio20 {
  
  public static void main (String[] args) {
    System.out.println("Este programa pinta una cuba.");
    
    System.out.print("Introduce la capacidad de la cuba en litros: ");
    int capacidad = Integer.parseInt(System.console().readLine());
    
    int contenido = (int)(Math.random() * capacidad) + 1;
    
    for (int i = 0; i < capacidad; i++) {
      
      if (i >= (capacidad - contenido)) {
	System.out.print("*====*");
      } else {
	System.out.print("*    *");
      }
      System.out.println();
    }
    System.out.println("******");
    System.out.println("La cuba tiene una capacidad de " + capacidad + " litros"
      + " y contiene " + contenido + " litros de agua.");
  } 
}

