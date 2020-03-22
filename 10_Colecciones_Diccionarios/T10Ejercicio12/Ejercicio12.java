import java.util.ArrayList;
import java.util.HashMap;
/**
 * @author Javier Luque Rodríguez
 * 
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja española y que sume los 
 * puntos según el juego de la brisca. El valor de las cartas se debe guardar en una estructura 
 * HashMap que debe contener parejas (figura, valor), por ejemplo (“caballo”, 3). La secuencia de 
 * cartas debe ser una estructura de la clase ArrayList que contiene objetos de la clase Carta. El 
 * valor de las cartas es el siguiente: 
 * as → 11, tres → 10, sota → 2, caballo → 3, rey → 4;
 * el resto de cartas no vale nada.
 */
public class Ejercicio12 {
  
  public static void main (String[] args){
    ArrayList<Carta> a = new ArrayList<Carta>();
    HashMap<String, Integer> h = new HashMap<String, Integer>();
    Carta c;
    int puntos = 0;
    
    h.put("as", 11);
    h.put("dos", 0);
    h.put("tres", 10);
    h.put("cuatro", 0);
    h.put("cinco", 0);
    h.put("seis", 0);
    h.put("siete", 0);
    h.put("ocho", 0);
    h.put("nueve", 0);
    h.put("sota", 2);
    h.put("caballo", 3);
    h.put("rey", 4);
    
    for (int i = 0; i < 5; i++) {
      do {
	c = new Carta();
      } while (a.contains(c));
      
      a.add(c);
      
    }
    
    for (Carta ca : a) {
      System.out.println(ca);
      puntos += h.get(ca.getFigura());
    }
    
    System.out.println("Has obtenido " + puntos + " puntos.");
  }  
}
