public class Ejercicio31 {
  
  public static void main (String[] args) {
    System.out.print("¿Cuánto dinero quiere apostar? ");
    int apuesta = Integer.parseInt(System.console().readLine());
    
    int dado1 = (int)(Math.random() * 6 + 1);
    int dado2 = (int)(Math.random() * 6 + 1);
    int tirada = dado1 + dado2;
    boolean terminar = false; 
    
    System.out.println("Dado 1: " + dado1);
    System.out.println("Dado 2: " + dado2);
    System.out.println("Suma de la tirada: " + (dado1 + dado2) + "\n");
    
    switch (tirada) {
      case 2:
      case 3:
	System.out.println("Lo sentimos, ha perdido todo su dinero.");
	break;
      case 7: 
      case 11:
	System.out.println("Enhorabuena, ha ganado " + apuesta + "€");
	System.out.println("Ahora tiene " + apuesta * 2 + "€");
	break;
      case 12:
	System.out.println("Lo sentimos, ha perdido todo su dinero :(");
	break;
      default:
	System.out.println("Tiene que seguir tirando, debe conseguir el " +
	  tirada + " para ganar.\nSi obtiene un 7, perderá la partida.\n");
	System.out.print("Pulse INTRO para tirar los dados.");
	System.console().readLine();
	
	do {
          dado1 = (int) (Math.random() * 6 + 1);
          dado2 = (int) (Math.random() * 6 + 1);

          System.out.println("Dado 1: " + dado1);
          System.out.println("Dado 2: " + dado2);
          System.out.println("Suma de la tirada: " + (dado1 + dado2));

          if ((dado1 + dado2) == tirada) {
            System.out.println("\nEnhorabuena, ha ganado " + apuesta + " €!");
            System.out.println("Ahora tiene " + apuesta * 2 + " €");
            terminar = true;
          } else if ((dado1 + dado2) == 7) {
            System.out.println("Lo siento, ha perdido todo su dinero :(");
            terminar = true;
          } else {
            System.out.println("\nContinúe jugando. Debe conseguir el " 
	      + tirada + " para ganar.");
            System.out.print("Pulse INTRO para tirar los dados.");
            System.console().readLine();
          }
	} while (terminar == false);
    }
    
  } 
}

