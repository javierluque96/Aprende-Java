/**
 * Vehiculo.java
 * Ejercicio2.
 * Definición de la clase Bicicleta
 * @author Javier Luque Rodríguez
 */

public class Bicicleta extends Vehiculo {
  
  private String marca;
  private String tipo; 
  
  public Bicicleta (String m, String t) {
    super();
    this.marca = m;
    this.tipo = t;
  }
  
  // Métodos
  public void caballito() {
    System.out.println("Titotirorirorirorito mira como hago el caballito");
  }
}
