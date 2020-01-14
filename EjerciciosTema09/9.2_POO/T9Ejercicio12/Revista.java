/**
 * Revista.java
 * @author Javier Luque Rodríguez
 * Ejercicio 12.
 */
public class Revista extends Publicacion {
  
  private int numero;
  
  public Revista(String isbn, String titulo, int anio, int numero) {
    super(isbn, titulo, anio);
    this.numero = numero;
  }
  
}
