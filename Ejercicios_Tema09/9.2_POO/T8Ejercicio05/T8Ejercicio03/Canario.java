/**
 * Canario.java
 * @author Javier Luque Ródríguez
 */

public class Canario extends Ave {
  
  public Canario() {
    super();
  }
  
  public Canario(Sexo s) {
    super(s);
  }
  
  public void pia() {
    System.out.println("Pio pio pio pio pio");
  }
  
  public void canta() {
    System.out.println("Piiiipipiiii pi piiiiipii");
  }
  
  public void pica() {
    System.out.println("Toma un picotazo");
  }
}
