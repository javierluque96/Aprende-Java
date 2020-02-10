import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
/**
 * @author Javier Luque Rodríguez
 * 
 * Amplía el programa anterior de tal forma que sea capaz de aprender palabras y
 * sinónimos. Cuando una palabra no tiene sinónimos, es decir, cuando aparece la
 * palabra en español con su traducción y esa traducción no la tiene ninguna otra
 * palabra española, se le preguntará al usuario si quiere añadir uno (un sinónimo)
 * y, en caso afirmativo, se pedirá la palabra y se añadirá al diccionario. Se puede
 * dar la circunstancia de que el usuario introduzca una palabra en español que
 * no está en el diccionario; en tal caso, se mostrará el consiguiente mensaje y
 * se dará la posibilidad al usuario de añadir la entrada correspondiente en el
 * diccionario pidiendo, claro está, la palabra en inglés.
 */
public class T10Ejercicio20 {
  
  public static void main (String[] args){
    HashMap<String, String> d = new HashMap<String, String>();
    String p;
    String s;
    String agregar;
    
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
	    System.out.print("No conozco sinónimos de esa palabra, ¿quiere añadirla al "
	      + "diccionario? (s/n): ");
	    agregar = System.console().readLine();
	    
	    if (agregar.equals("s")) {
	      System.out.print("Introduzca un sinónimo de " + p + ": ");
	      s = System.console().readLine();
	      d.put(s, d.get(p));
	    }
	  }
	} else {
	  System.out.print("No conozco esa palabra, ¿quiere añadirla al diccionario? (s/n): ");
	  agregar = System.console().readLine();
	  
	  if (agregar.equals("s")) {
	    System.out.print("Introduzca una traducción de " + p + " en inglés: ");
	    s = System.console().readLine();
	    d.put(p, s);
	  }
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
