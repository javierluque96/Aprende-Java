public class Ejercicio27 {
  
  public static void main (String[] args) {
    String jugador;
    int ordenador = (int)(Math.random() * 3);
    int opcion = -1;
    boolean salir;
    
    // Comprueba que el jugador haya introducido bien la opción
    do {
      System.out.print("Turno del jugador (introduzca piedra, papel o tijera)"
	+ ": ");
      jugador = System.console().readLine();
      
      if (jugador.equals("piedra") || jugador.equals("papel") || 
	jugador.equals("tijera")) {
	salir = true; 
      } else {
	salir = false;
	System.out.print("Opción escogida errónea. ");
      }
    } while (salir == false);
    
    // Transforma la opcion del jugador en un valor
    switch (jugador) {
      case "piedra":
	opcion = 0;
	break;
      case "papel":
	opcion = 1;
	break;
      case "tijera":
	opcion = 2;
	break;
      default:
    }
    
    // Imprime la opción del ordenador
    switch (ordenador) {
      case 0:
	System.out.println ("Turno del ordenador: piedra");
	break;
      case 1:
	System.out.println ("Turno del ordenador: papel");
	break;
      case 2:
	System.out.println ("Turno del ordenador: tijera");
	break;
    }
    
    // Imprime quien es el ganador
    if (opcion == ordenador) {
      System.out.println("Empate");
      
    } else if (ordenador == 2 && opcion == 1){
      System.out.println("Gana el ordenador");
      
    } else if (ordenador == 1 && opcion == 2) {
      System.out.println("Gana el jugador");
      
    } else if (ordenador == 1 && opcion == 0) {
      System.out.println("Gana el ordenador");
      
    } else if (ordenador == 0 && opcion == 1) {
      System.out.println("Gana el jugador");
      
    } else if (ordenador == 0 && opcion == 2) {
      System.out.println("Gana el ordenador");
      
    } else if (ordenador == 2 && opcion == 0) {
      System.out.println("Gana el jugador");
    }
  } 
}

