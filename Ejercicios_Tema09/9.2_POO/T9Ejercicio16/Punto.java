/**
 * Punto.java
 * @author Javier Luque Rodríguez
 */
public class Punto {
  
  private double x;
  private double y;
  
  public Punto(double x, double y) {
    this.x = x;
    this.y = y;
  }
  
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}
