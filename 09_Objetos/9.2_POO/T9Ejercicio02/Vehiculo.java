/**
 * Vehiculo.java
 * Ejercicio2.
 * Definición de la clase Vehiculo
 * @author Javier Luque Rodríguez
 */

public class Vehiculo {
  
  // Atributos de clase 
  private static int kmTotales = 0;
  private static int vehiculosCreados = 0;
  
  // Atributos de instancia
  private int kmRecorridos = 0;
  
  // Constructor
  public Vehiculo() {
    this.kmRecorridos = 0;
  }
  
  public int getKilometrosRecorridos() {
    return kmRecorridos;
  }
  
  public static int getKilometrosRecorridosTotales() {
    return kmTotales;
  }
  
  // Métodos
  /**
   * Recorre la distancia que le pasemos por argumento.
   * 
   * @param km distancia que recorre en kilómetros
   */  
  public void recorre(int km) {
    this.kmRecorridos += km;
    Vehiculo.kmTotales += km;
  }
}
