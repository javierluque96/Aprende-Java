public class Ejercicio02 {
  
  public static void main (String[] args) {
    System.out.println("Este programa muestra al azar el nombre de una carta "
      + "de la baraja francesa.");
    
    int palo;
    int numCarta;
    String nomNumCarta = "";
    String nomPalo = "";
    
    // Crea el número de la carta y lo convierte a String
    numCarta = (int)(Math.random() * 13) + 1;
    
    switch (numCarta) {
      case 1:
	nomNumCarta = "A";
	break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
	nomNumCarta = String.valueOf(numCarta);
	break;
      case 11:
	nomNumCarta = "J";
	break;
      case 12:
	nomNumCarta = "Q";
	break;
      case 13:
	nomNumCarta = "K";
	break;
    }
    
    // Crea el palo de la carta
    palo = (int)(Math.random() * 4) + 1;
    switch (palo) {
      case 1:
	nomPalo = "Picas";
	break;
      case 2:
	nomPalo = "Corazones";
	break;
      case 3:
	nomPalo = "Diamantes";
	break;
      case 4:
	nomPalo = "Tréboles";
	break;
    }
    
    System.out.println("Carta: " + nomNumCarta + " " + nomPalo);
  } 
}

