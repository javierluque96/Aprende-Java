import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Javier Luque Rodríguez
 * 
 * Escribe un programa que ordene 10 números enteros introducidos por teclado 
 * y almacenados en un objeto de la clase ArrayList .
 */
public class T10Ejercicio03 {
  
  public static void main (String[] args){
    ArrayList <Integer> a = new ArrayList<Integer>();
    
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un número: ");
      a.add(Integer.parseInt(System.console().readLine()));
    }
    
    // Ordena de menor a mayor
    Collections.sort(a);
    System.out.println("Lista ordenada de menor a mayor: " + a);
    
    // Ordena de mayor a menor
    Collections.reverse(a);
    System.out.println("Lista ordenada de mayor a menor: " + a);
  }
  
}
