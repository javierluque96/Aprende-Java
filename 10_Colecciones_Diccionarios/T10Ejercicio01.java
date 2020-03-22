import java.util.ArrayList;

/**
 * @author Javier Luque Rodríguez
 * 
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación, muestra esos nombres 
 * por pantalla. Utiliza para ello un bucle for que recorra todo el ArrayList sin usar ningún 
 * índice.
 */
public class T10Ejercicio01 {
  
  public static void main (String[] args){
    ArrayList<String> nombres = new ArrayList<String>();
    
    nombres.add("Javi");
    nombres.add("Silvia");
    nombres.add("Juanlu");
    nombres.add("Jesus");
    nombres.add("Alberto");
    nombres.add("Tere");
    
    for (String n : nombres) {
      System.out.println(n);
    }
  }
  
}
