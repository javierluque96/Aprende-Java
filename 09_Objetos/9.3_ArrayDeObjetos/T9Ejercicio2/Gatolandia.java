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
    Gato[] gatos = new Gato[4];
    Scanner s = new Scanner(System.in);
    int i;
    
    gatos[0] = new Gato("Chiqui", "Blanco", "Hembra");
    gatos[1] = new Gato("Copito de Nieve", "Negro", "Macho");
    gatos[2] = new Gato("Felix", "Naranja", "Macho");
    gatos[3] = new Gato("Luna", "Atigrado", "Hembra");
    
    
    
    for (i = 0; i < gatos.length; i++) {
      System.out.println("Datos del gato número " + (i + 1) + ":");
      
      System.out.println("Nombre: " + gatos[i].getNombre());
      System.out.println("Color: " + gatos[i].getColor());
      System.out.println("Raza: " + gatos[i].getRaza());
      
      System.out.println();
    }
  }
}

