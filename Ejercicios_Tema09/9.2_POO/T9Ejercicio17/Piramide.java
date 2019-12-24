/**
 * Triangulo.java
 * @author Javier Luque Rodríguez
 */
public class Piramide {
  
  private static int piramedesCreadas = 0;
  private int altura;
  
  public Piramide(int altura) {
    this.altura = altura;
    this.piramedesCreadas++;
  }
  
  public String toString() {
    String p = "";
    int caracteres = 1;
    int i, j;
    
    for (i = altura - 1; i >= 0; i--) {
      
      for (j = 0; j < i; j++) {
	p += " ";
      }
      
      for (j = 0; j < caracteres; j++) {
	p += "*";
      }
      
      p += "\n";
      caracteres += 2;
    }
    
    return p;
  }
  
  public static int getPiramidesCreadas() {
    return piramedesCreadas;
  }
}
