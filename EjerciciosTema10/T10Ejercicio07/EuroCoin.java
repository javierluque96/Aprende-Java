import java.util.ArrayList;
/**
 * @author Javier Luque Rodríguez
 * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
 * un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
 * anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
 * céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
 * cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
 * siguiendo la pauta correcta. Cada moneda generada debe ser una instancia de
 * la clase Moneda y la secuencia se debe ir almacenando en una lista.
 */
public class EuroCoin {
  
  public static void main (String[] args){
    ArrayList<Moneda> m = new ArrayList<Moneda>();
    String posicionAnterior;
    String monedaAnterior;
    
    Moneda m1 = new Moneda();
    posicionAnterior = m1.getPosicion();
    monedaAnterior = m1.getMoneda();
    m.add(m1);
    
    for (int i = 0; i < 5; i++) {
      do {
	m1 = new Moneda();
      } while (!posicionAnterior.equals(m1.getPosicion()) && !monedaAnterior.equals(m1.getMoneda()));
      
      m.add(m1);
      posicionAnterior = m1.getPosicion();
      monedaAnterior = m1.getMoneda();
    }
    
    for (Moneda mo : m) {
      System.out.println(mo);
    }
  }
  
}
