import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Javier Luque Rodríguez
 * 
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 */
public class T10Ejercicio04 {
  
  public static void main (String[] args){
    ArrayList <String> a = new ArrayList<String>();
    
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce una palabra: ");
      a.add(System.console().readLine());
    }
    
    // Ordena de menor a mayor
    Collections.sort(a);
    System.out.println("Lista ordenada en orden alfabético: " + a);
    
    // Ordena de mayor a menor
    Collections.reverse(a);
    System.out.println("Lista ordenada de Z a A: " + a);
  }
  
}
