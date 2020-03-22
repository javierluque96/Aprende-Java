import java.util.HashMap;
/**
 * @author Javier Luque Rodríguez
 * 
 * Realiza un programa que sepa decir la capital de un país (en caso de conocer
 * la respuesta) y que, además, sea capaz de aprender nuevas capitales. En
 * principio, el programa solo conoce las capitales de España, Portugal y Francia.
 * Estos datos deberán estar almacenados en un diccionario. Los datos sobre
 * capitales que vaya aprendiendo el programa se deben almacenar en el mismo
 * diccionario. El usuario sale del programa escribiendo la palabra “salir”.
 */
public class T10Ejercicio16 {
  
  public static void main (String[] args){
    HashMap<String, String> h = new HashMap<String, String>();
    String pais;
    String capital;
    
    h.put("España", "Madrid");
    h.put("Portugal", "Lisboa");
    h.put("Alemania", "Berlin");
    h.put("Dinamarca", "Copenhague");
    h.put("Rumania", "Bucarest");
    h.put("Italia", "Roma");
    
    do {
      
      System.out.print("Escribe el nombre de un país y te diré su capital: ");
      pais = System.console().readLine();
      
      if (h.containsKey(pais)) {
	System.out.println("La capital de " + pais + " es " + h.get(pais) + ".");
      } else {
	if (!pais.equalsIgnoreCase("salir")) {
	  System.out.print("No conozco la respuesta ¿cuál es la capital de " + pais + "?: ");
	  capital = System.console().readLine();
	  if (!pais.equalsIgnoreCase("salir")) {
	    h.put(pais, capital);
	    System.out.println("Nueva capital memorizada.");
	  }
	}
      }
      
    } while (!pais.equalsIgnoreCase("salir"));
  }
  
}
