/**
 * @author Javier Luque Rodríguez
 */
public class Carta implements Comparable<Carta> {
  
  private String[] palos = {"oros", "copas", "espadas", "bastos"};
  private String palo;
  private int numero;
  
  public Carta() {
    this.palo = palos[(int)(Math.random() * 4)];
    this.numero = (int)(Math.random() * 12 + 1);
  }
  
  public String toString() {
    return palo + " - " + numero;
  }
  
  public String getPalo() {
    return palo;
  }
  
  public int getNumero() {
    return numero;
  }
  
  @Override
  public boolean equals(Object c) {
    return this.palo.equals(((Carta)c).getPalo()) && this.numero == (((Carta)c).getNumero());
  }
  
  /**
   * Devuelve 1 si es mayor, 0 si son iguales, -1 si es menor. Ordena primero por palo y luego por 
   * número.
  @Override
  public int compareTo(Carta c) {
    if (this.palo == c.getPalo()) {
      if (this.numero > c.getNumero()) {
	return 1;
      } else {
	return -1;
      }
    } else {
      return palo.compareTo(c.getPalo());
    }
  }
  */
  
  /**
   * Ordena por número y luego por palo
   */
  @Override
  public int compareTo(Carta c) {
    if (this.numero == c.getNumero()) {
      return palo.compareTo(c.getPalo());
    } else if (this.numero > c.getNumero()) {
	return 1;
    } else {
      return -1;
    }
  }
}

