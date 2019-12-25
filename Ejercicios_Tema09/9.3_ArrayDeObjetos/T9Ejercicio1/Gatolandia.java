/**
 * Gatolandia.java
 * @author Javier Luque Rodríguez
 * Ejercicio 1.
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos de cada uno de 
 * ellos mediante un bucle. Muestra a continuación los datos de todos los gatos utilizando también 
 * un bucle.
 */
import java.util.Scanner;

public class Gatolandia {
	
  public static void main (String[] args) {
    Gato[] gatos = new Gato[3];
    Scanner s = new Scanner(System.in);
    int i;
    
    for (i = 0; i < gatos.length; i++) {
      gatos[i] = new Gato();
      
      System.out.println("Introduce los datos del gato número " + (i + 1) + ":");

      System.out.print("Nombre: ");
      gatos[i].setNombre(s.next());
      
      System.out.print("Color: ");
      gatos[i].setColor(s.next());
      
      System.out.print("Raza: ");
      gatos[i].setRaza(s.next());
    }
    
    System.out.println();
    
    for (i = 0; i < gatos.length; i++) {
      System.out.println("Datos del gato número " + (i + 1) + ":");
      
      System.out.println("Nombre: " + gatos[i].getNombre());
      System.out.println("Color: " + gatos[i].getColor());
      System.out.println("Raza: " + gatos[i].getRaza());
    }
  }
}

