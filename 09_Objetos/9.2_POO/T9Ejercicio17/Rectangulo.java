/**
 * Rectangulo.java
 * @author Javier Luque Rodríguez
 */
public class Rectangulo {
  
  private static int rectangulosCreados = 0;
  private int base;
  private int altura;
  
  public Rectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
    rectangulosCreados++;
  }
  
  public String toString() {
    String r = "";
    for (int i = 0; i < altura; i++) {
      
      for (int j = 0; j < base; j++) {
	r += "*";
      }
      
      r += "\n";
    }
    
    return r;
  }
  
  public static int getRectangulosCreados() {
    return rectangulosCreados;
  }
  
  
}
