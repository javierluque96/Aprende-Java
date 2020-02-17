import java.util.HashMap;
import java.util.Set;
/**
 * @author Javier Luque Rodríguez
 * 
 * Realiza un programa que escoja al azar 5 palabras en español del minidiccionario del ejercicio 
 * anterior. El programa irá pidiendo que el usuario teclee la traducción al inglés de cada una de 
 * las palabras y comprobará si son correctas. Al final, el programa deberá mostrar cuántas 
 * respuestas son válidas y cuántas erróneas.
 */
public class T10Ejercicio11 {
  
  public static void main (String[] args){
    
    HashMap<String, String> d = new HashMap<String, String>();
    String palabra;
    int num;
    
    d.put("Métrica", "Metrics");
    d.put("Vil","Nefarious");
    d.put("Época", "Epoch");
    d.put("Olvido", "Oblivion");
    d.put("Libro", "Book");
    d.put("Perro", "Dog");
    d.put("Gato", "Cat");
    d.put("Pato", "Duck");
    d.put("Hombre", "Man");
    d.put("Zapatos", "Shoes");
    d.put("Simpático", "Nice");    
    d.put("Portatil", "Laptop");
    d.put("Botella", "Bottle");
    d.put("Ratón", "Mouse");
    d.put("Superficie", "Surface");
    d.put("Rueda", "Wheel");    
    d.put("Neumático", "Tire");
    d.put("Entre", "Among");
    d.put("Repentino", "Sudden");
    d.put("Bosque", "Forest");
    d.put("Corriente", "Stream");
    
    // Obtiene las claves
    Set<String> setDePalabras = d.keySet();
    
    // Convertimos el set a Array
    String[] p = setDePalabras.toArray(new String[setDePalabras.size()]);
    
    for (int i = 0; i < 5; i++) {
      num = (int)(Math.random() * 20);
      System.out.print("¿Cómo se dice " + p[num] + " en ingles? ");
      palabra = System.console().readLine();
      
      if (palabra.equalsIgnoreCase(d.get(p[num]))) {
	System.out.println("¡Muy bien, has traducido correctamente " + p[num] + "!");
      } else {
	System.out.println("Lo siento, la traducción de " + p[num] + " es " + d.get(p[num]) + ".");
      }
    }
    
  }
  
}
