/**
 * Coleccion.java
 * Ejercicio 3.
 * @author Javier Luque Rodríguez
 */


public class Disco {
  
  private String codigo;
  private String autor;
  private String titulo;
  private String genero;
  private int duracion;
  
  public Disco(String c, String a, String t, String g, int d) {
    this.codigo = c;
    this.autor = a;
    this.titulo = t;
    this.genero = g;
    this.duracion = d;
  }
  
  public String toString() {
    return "------------------------------------------\nCódigo: " + codigo + "\nAutor: " + autor 
    + "\nTítulo: " + titulo + "\nGénero: " + genero + "\nDuración: " + duracion 
    + "\n------------------------------------------";
  }
  
  public String getCodigo() {
    return codigo;
  }
  
  public String getAutor() {
    return autor;
  }
  
  public String getGenero() {
    return genero;
  }
  
  public String getTitulo() {
    return titulo;
  }
  
  public int getDuracion() {
    return duracion;
  }
  
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  
  public void setAutor(String autor) {
    this.autor = autor;
  }
  
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  
  public void setGenero(String genero) {
    this.genero = genero;
  }
  
  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }
  
  @Override
  public boolean mismoCodigo(Object d) {
    return (this.codigo).equals(((Disco)d).getCodigo());
  }
}
