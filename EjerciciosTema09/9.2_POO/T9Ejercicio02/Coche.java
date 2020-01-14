/**
 * Vehiculo.java
 * Ejercicio2.
 * Definición de la clase Coche
 * @author Javier Luque Rodríguez
 */

public class Coche extends Vehiculo {
  
  private String marca;
  private int caballos; 
  
  public Coche (String m, int c) {
    super();
    this.marca = m;
    this.caballos = c;
  }
  
  // Métodos
  public void quemaRueda() {
    System.out.println("FFFFFFSSSHSHSHHSHHSHHSH");
  }
}
