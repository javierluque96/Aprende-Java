/**
 * @author Javier Luque Rodríguez
 */
public class Carta implements Comparable<Carta>{
  
  private String[] palos = {"oros", "copas", "espadas", "bastos"};
  private String[] numeros = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", 
    "nueve", "sota", "caballo", "rey"};
  private String palo;
  private Integer numero;
  
  public Carta() {
    this.palo = palos[(int)(Math.random() * 4)];
    this.numero = (int)(Math.random() * 12);
  }
  
  public String toString() {
    return palo + " - " + numeros[numero];
  }
  
  public String getPalo() {
    return palo;
  }
  
  public int getNumero() {
    return numero;
  }
  
  public String getFigura() {
    return numeros[numero];
  }
  
  @Override
  public boolean equals(Object c) {
    return this.palo.equals(((Carta)c).getPalo()) && this.numero == (((Carta)c).getNumero());
  }
  
  @Override
  public int compareTo(Carta c) {
    if (palo.equals(c.getPalo())) {
      return numero.compareTo(c.getNumero());
    } else {
      return palo.compareTo(c.getPalo());
    }
  }
}
