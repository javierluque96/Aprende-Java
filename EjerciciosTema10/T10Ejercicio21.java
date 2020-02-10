import java.util.HashMap;
import java.util.Scanner;
/**
 * @author Javier Luque Rodríguez
 * 
 * La asociación “Amigos de los anfibios” nos ha encargado una aplicación educativa sobre estos 
 * animalitos. Crea un programa que pida al usuario el tipo de anfibio y que, a continuación, nos 
 * muestre su hábitat y su alimentación. Si el tipo de anfibio introducido no existe, se debe 
 * mostrar el mensaje “Ese tipo de anfibio no existe”.
 * 
 * La información se debe guardar en dos diccionarios (dos HashMap). Uno de ellos tendrá parejas 
 * clave-valor del tipo (tipo de anfibio, hábitat) y otro (tipo de anfibio, alimentación).
 */
public class T10Ejercicio21 {
  
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    HashMap<String, String> habitat = new HashMap<String, String>();
    HashMap<String, String> alimentacion = new HashMap<String, String>();
    String a;
    
    habitat.put("rana", "En los trópicos y cerca de las zonas húmedas y acuáticas.");
    habitat.put("salamandra", "Ecosistemas húmedos.");
    habitat.put("sapo", "En cualquier sitio salvo el desierto y la Antártida.");
    habitat.put("tritón", "América y África.");
    
    alimentacion.put("rana", "Larvas e insectos.");
    alimentacion.put("salamandra", "Pequeños crustáceos e insectos.");
    alimentacion.put("sapo", "Insectos, lombrices y pequeños roedores.");
    alimentacion.put("tritón", "Insectos.");
    
    
    System.out.print("Introduzca el tipo de anfibio: ");
    a = s.next();
    
    if (habitat.containsKey(a)) {
      System.out.println("Hábitat: " + habitat.get(a));
      System.out.println("Alimentación: " + alimentacion.get(a));
    } else {
      System.out.println("Ese tipo de anfibio no existe.");
    }
  }
  
}

