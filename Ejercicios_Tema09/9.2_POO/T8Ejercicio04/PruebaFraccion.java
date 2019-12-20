/**
 * Ejercicio 4 --> PruebaFraccion.java
 * Crea la clase Fracción . Los atributos serán numerador y denominador . Y algunos de los métodos 
 * pueden ser invierte , simplifica , multiplica , divide , etc.
 * @author Javier Luque Rodríguez
 */

public class PruebaFraccion {
  
  public static void main(String[] args) {
    
    Fraccion f1 = new Fraccion(-5, 8);
    Fraccion f2 = new Fraccion(-3, 2);
    Fraccion f3 = new Fraccion(6, 10);
    
    // Multiplica dos fracciones
    System.out.println(f1 + " * " + f2 + " = " + f1.multiplica(f2));
    System.out.println(f1 + " * " + f3 + " = " + f1.multiplica(f3));
    
    // Invierte 
    System.out.println("\n" + f1 + " invertido = " + f1.invierte());
    
    // Divide
    System.out.println("\n" + f1 + " / " + f2 + " = " + f1.divide(f2));
    
    // Simplifica
    System.out.println("\n" + f3 + " simplificado es " + f3.simplifica());
  }
  
}
