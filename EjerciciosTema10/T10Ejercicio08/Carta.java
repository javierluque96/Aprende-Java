/**
 * @author Javier Luque Rodríguez
 */
public class Carta {
  
  private String[] palos = {"oros", "copas", "espadas", "bastos"};
  private String[] numeros = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", 
    "nueve", "sota", "caballo", "rey"};
  private String palo;
  private String numero;
  
  public Carta() {
    this.palo = palos[(int)(Math.random() * 4)];
    this.numero = numeros[(int)(Math.random() * 12)];
  }
  
  public String toString() {
    return palo + " - " + numero;
  }
  
  public String getPalo() {
    return palo;
  }
  
  public String getNumero() {
    return numero;
  }
  
  @Override
  public boolean equals(Object c) {
    return this.palo.equals(((Carta)c).getPalo()) && this.numero.equals(((Carta)c).getNumero());
  }
  
}
