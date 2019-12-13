/**
 * Caballo.java
 * Ejercicio 1.
 * @author Javier Luque Rodríguez
 */

public class Caballo {
  
  
  
  // Atributos de clase
  private String nombre;
  private String raza;
  private String color;
  private int edad;
  private int carrerasGanadas;
  
  Caballo (String n, String r, String c, int e, int cg) {
    this.nombre = n;
    this.raza = r;
    this.color = c;
    this.edad = e;
    this.carrerasGanadas = cg;
  }
  
  // Métodos de clase  
  public String getNombre() {
    return nombre;
  }
  
  public String getRaza() {
    return raza;
  }
  
  public String getColor() {
    return color;
  }
  
  public int getEdad() {
    return edad;
  }
 
  public int getCarrerasGanadas() {
    return carrerasGanadas;
  }
  
  public void cabalga() {
    System.out.println("Tocotoc tocotoc tocotoc...");
  }
  
  public void rumia() {
    System.out.println("Ñam ñam ñam ñam");
  }
  
  public void relincha() {
    System.out.println("iiiiiiiiijiijijiiiiji");
  }
  
  public void trota() {
    System.out.println("To co toc, to co toc, to co toc...");
  }
}

