import java.util.ArrayList;
import java.util.Collections;
/**
 * @author Javier Luque Rodríguez
 * 
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 */
public class PruebaCarta {
  
  public static void main (String[] args){
    ArrayList<Carta> cartas = new ArrayList<Carta>();
    Carta c;
    
    for (int i = 0; i < 10; i++) {
      do {
	c = new Carta();
      } while (cartas.contains(c));
      
      cartas.add(c);
    }
    
    Collections.sort(cartas);
    
    for (Carta ca : cartas) {
      System.out.println(ca);
    }
  }  
}
