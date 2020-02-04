import java.util.HashMap;
import java.util.Map;
/**
 * @author Javier Luque Rodríguez
 * 
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
 * almacenar las parejas de palabras. El programa pedirá una palabra en español
 * y dará la correspondiente traducción en inglés.
 */
public class T10Ejercicio10 {
  
  public static void main (String[] args){
    HashMap<String, String> d = new HashMap<String, String>();
    String palabra;
    
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
    d.put("Simpático", "nice");
    
    System.out.print("Introduce la palabra que quieres traducir al ingles: ");
    palabra = System.console().readLine();
    
    if (d.containsKey(palabra)) {
      System.out.println(d.get(palabra));
    } else {
      System.out.println("Lo siento, no conozco esa palabra.");
    }
    
  }
}
