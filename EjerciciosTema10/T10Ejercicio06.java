import java.util.HashMap;
import java.util.Map;
/**
 * @author Javier Luque Rodríguez
 * 
 * Implementa el control de acceso al área restringida de un programa. Se debe
 * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
 * datos correctamente, el programa dirá “Ha accedido al área restringida”. El
 * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
 * el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
 * de usuario con sus correspondientes contraseñas deben estar almacenados en
 * una estructura de la clase HashMap .
 */
public class T10Ejercicio06 {
  
  public static void main (String[] args){
    int oportunidades = 3;
    String usuario;
    String password;
    boolean acceso = false;
    HashMap<String, String> r = new HashMap<String, String>();
    
    r.put("admin", "1234");
    r.put("javi", "a.25");
    r.put("adri", "j2ñ5");
    
    do {
      System.out.print("Por favor, identifiquese. \nUsuario: ");
      usuario = System.console().readLine();
      
      System.out.print("Contraseña: ");
      password = System.console().readLine();
      
      if (r.containsKey(usuario)) {
	if (r.get(usuario).equals(password)) {
	  System.out.print("Accediendo al área restringida. ");
	  acceso = true;
	} else {
	  System.out.print("Contraseña introducida incorrecta. ");
	  oportunidades--;
	}
      } else {
	System.out.print("El usuario introducido no existe. ");
	oportunidades--;
      }
      
      if (!acceso && oportunidades > 0) {
	System.out.println("Le quedan " + oportunidades + " oportunidades.");
      }
    } while (!acceso && oportunidades > 0);
    
    if (oportunidades == 0) {
      System.out.println("Lo siento, no puede acceder al área restringida, ha agotado todas "
      + "las oportunidades.");
    }
    
  }
  
}
