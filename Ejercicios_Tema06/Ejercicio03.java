public class Ejercicio03 {
  
  public static void main (String[] args) {
    System.out.println("Este programa muestra al azar el nombre de una carta "
      + "de la baraja española.");
    
    int palo;
    int numCarta;
    String nomNumCarta = "";
    String nomPalo = "";
    
    // Crea el número de la carta y lo convierte a String
    numCarta = (int)(Math.random() * 10) + 1;
    
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
	nomNumCarta = String.valueOf(numCarta);
	break;
      case 8:
	nomNumCarta = "Sota";
	break;
      case 9:
	nomNumCarta = "Caballo";
	break;
      case 10:
	nomNumCarta = "Rey";
	break;
    }
    
    // Crea el palo de la carta
    palo = (int)(Math.random() * 4) + 1;
    switch (palo) {
      case 1:
	nomPalo = "Oros";
	break;
      case 2:
	nomPalo = "Copas";
	break;
      case 3:
	nomPalo = "Espadas";
	break;
      case 4:
	nomPalo = "Bastos";
	break;
    }
    
    System.out.println("Carta: " + nomNumCarta + " " + nomPalo);
  } 
}

