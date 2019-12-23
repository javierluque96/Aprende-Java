/**
 * @author Javier Luquee Rodríguez
 * FichaDomino.java
 * Ejercicio 14.
 * 
 * Implementa la clase FichaDomino. Una ficha de dominó tiene dos lados y en cada lado hay un 
 * número del 1 al 6 o bien ningún número (blanco). Cuando se crea una ficha, se proporcionan ambos 
 * valores. Dos fichas encajan si se pueden colocar una al lado de la otra según el juego del 
 * dominó, por ejemplo, las fichas [2|5] y [4|5] encajan porque se pueden colocar de la forma [2|5] 
 * [5|4]. A continuación se proporciona el contenido del main y el resultado que debe aparecer por 
 * pantalla.
 */
public class FichaDomino {
  
  private int lado1;
  private int lado2;
  
  public FichaDomino(int lado1, int lado2) {
    this.lado1 = lado1;
    this.lado2 = lado2;
  }
  
  public String toString() {
    return "[" + (lado1 == 0 ? " ": lado1) + "|" + (lado2 == 0 ? " ": lado2) + "]";
  }
  
  public boolean encaja(FichaDomino f) {
    return (lado1 == f.lado1) || (lado2 == f.lado2) || (lado1 == f.lado2) || (lado2 == f.lado1);
  }
  
  public FichaDomino voltea() {
    FichaDomino f = new FichaDomino(lado2, lado1);
    return f;
  }
}
