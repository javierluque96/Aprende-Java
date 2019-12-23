/**
 * Libro.java
 * @author Javier Luque Rodríguez
 * Ejercicio 12.
 * 
 * Se quiere informatizar una biblioteca. Crea las clases Publicacion, Libro y Revista. Las clases 
 * deben estar implementadas con la jerarquía correcta. Las características comunes de las revistas 
 * y de los libros son el código ISBN, el título, y el año de publicación. Los libros tienen además 
 * un atributo prestado. Cuando se crean los libros, no están prestados. Las revistas tienen un 
 * número. La clase Libro debe implementar la interfaz Prestable que tiene los métodos presta, 
 * devuelve y estaPrestado.
 */
public class Libro extends Publicacion implements Prestable {
  
  private boolean prestado = false;
  
  public Libro(String isbn, String titulo, int anio) {
    super(isbn, titulo, anio);
  }
  
  public void presta() {
    if (this.prestado) {
      System.out.println("Lo siento, ese libro ya está prestado.");
    } else {
      this.prestado = true;
    }
  }
  
  public void devuelve() {
    if (this.prestado) {
      this.prestado = false;
    } else {
      System.out.println("El libro no está prestado.");
    }
  }
  
  public boolean estaPrestado() {
    return this.prestado;
  }
  
  @Override
  public String toString() {
    if (prestado) {
      return super.toString() + " (prestado)";
    } else {
      return super.toString() + " (no prestado)";
    }
  }
  
}
