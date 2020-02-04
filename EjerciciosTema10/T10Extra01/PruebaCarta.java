import java.util.ArrayList;
import java.util.Collections;
/**
 * @author Javier Luque Rodríguez
 * 
 * ArrayList de objetos Carta, con una cantidad aleatoria entre 10 y 20 cartas,
 * sin que se repitan.
 * 
 * Variante 1: Ordenar el ArrayList por palo, número
 * Variante 2: Ordenar el ArrayList por número, palo
 */
public class PruebaCarta {
  
  public static void main (String[] args){
    ArrayList<Carta> cartas = new ArrayList<Carta>();
    int numCartas = (int)(Math.random() * 11 + 10);
    int i;
    Carta c;
    
    for (i = 0; i < numCartas; i++) {
      do {
	c = new Carta();
      } while (cartas.contains(c));
      
      cartas.add(c);
    }
    
    Collections.sort(cartas);
    
    i = 0;
    for (Carta ca : cartas) {
      System.out.println(ca);
      i++;
    }
    
    System.out.println("Número de cartas: " + i);
  }
  
}
