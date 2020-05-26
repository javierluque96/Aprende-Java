/**
 * @author Javier Luque Rodríguez
 */

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Ocurrencias {
  
  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Uso del programa: Ocurrencias Fichero Palabra");
      System.exit(-1);
    }
    
    try {
      
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      String palabra = args[1];
      
      boolean comentario = false;
      int ocurrencias = 0;
      
      String l = "";
      
      while (l != null) {
	l = br.readLine();
	
	if (l != null) {
	  
	  if (l.indexOf(palabra) != -1) {
	    ocurrencias++;
	  }
	  
	}
      }
      
      System.out.println("La palabra \"" + palabra + "\" aparece " + ocurrencias + 
	(ocurrencias == 1 ? " vez" : " veces") + " en el fichero --> " + args[1]);
      
      br.close();
    } catch (IOException ioe) {
      System.out.println("Error de lectura");
      System.err.println(ioe.getMessage());
    }
  }

}
