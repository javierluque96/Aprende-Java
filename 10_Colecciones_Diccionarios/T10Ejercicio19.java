import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
/**
 * @author Javier Luque Rodríguez
 * 
 * Realiza un buscador de sinónimos. Utiliza el diccionario español-inglés que se
 * proporciona a continuación. El programa preguntará una palabra y dará una
 * lista de sinónimos (palabras que tienen el mismo significado). Por ejemplo, si
 * se introduce la palabra “caliente”, el programa dará como resultado: ardiente,
 * candente, abrasador. ¿Cómo sabe el programa cuáles son los sinónimos de
 * “caliente”? Muy fácil, en el diccionario debe existir la entrada (“caliente”,
 * “hot”), por tanto solo tendrá que buscar las palabras en español que también
 * signifiquen “hot”; esta información estará en las entradas (“ardiente”, “hot”) y
 * (“abrasador”, “hot”). Cuando una palabra existe en el diccionario pero no tiene
 * sinónimos, debe mostrar el mensaje “No conozco sinónimos de esa palabra”.
 * Si una palabra no está en el diccionario se mostrará el mensaje “No conozco
 * esa palabra”. El usuario sale del programa escribiendo la palabra “salir”.
 */
public class T10Ejercicio19 {
  
  public static void main (String[] args){
    HashMap<String, String> d = new HashMap<String, String>();
    String p;
    
    d.put("caliente", "hot");
    d.put("rojo", "red");
    d.put("ardiente", "hot");
    d.put("verde", "green");
    d.put("agujetas", "stiff");
    d.put("abrasador", "hot");
    d.put("hierro", "iron");
    d.put("grande", "big");
    
    do {
      System.out.print("Introduzca una palabra y le daré los sinónimos: ");
      p = System.console().readLine();
      
      if (!p.equals("salir")) {
	if (d.containsKey(p)) {
	  if (tieneSinonimos(p, d)) {
	    System.out.print("Sinónimos de " + p + ": " + muestraSinonimos(p, d));
	  } else {
	    System.out.println("No conozco sinónimos de esa palabra.");
	  }
	} else {
	  System.out.println("No conozco esa palabra.");
	}
      }
      
    } while (!p.equalsIgnoreCase("salir"));
  } // main
  
  /**
   * Comprueba si la palabra p tiene sinonimos en el diccionario d.
   * 
   * @param p palabra
   * @param d diccionario de sinónimos
   * @return true / false
   */
  public static boolean tieneSinonimos(String p, HashMap<String, String> d) {
    String sinonimo = d.get(p);
    int contador = 0;
    
    for (Map.Entry e : d.entrySet()) {
      if (e.getValue().equals(sinonimo)) {
	contador++;
      }
    }
    
    return contador > 1;
  }
  
  /**
   * Crea una lista con los sinónimos almacenados en un diccionario y la convierte en un String.
   * 
   * @param p palabra
   * @param d diccionario de sinónimos
   * @return sinónimos almacenados en el diccionario de la palabra
   */
  public static String muestraSinonimos(String p, HashMap<String, String> d) {
    ArrayList<String> a = new ArrayList<String>();
    String s = d.get(p); // sinónimo
    String m = "";
    
    for (Map.Entry e : d.entrySet()) {
      if (e.getValue().equals(s) && !e.getKey().equals(p)) {
	a.add((String)e.getKey());
      }
    }
    
    for (int i = 0; i < a.size(); i++) {
      m += i < a.size() - 1 ? a.get(i) + ", " : a.get(i) + ".\n";
    }
    
    return m;
  }
  
}
