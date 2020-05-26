/**
 * @author Javier Luque Rodríguez
 */

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Ejercicio05 {
  
  public static void main(String[] args) {
    
    if (args.length != 2) {
      System.out.println("Uso del programa: Ejercicio05 Fichero.java SinComentarios.java");
      System.exit(-1);
    }
  
    try {
      
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
      
      boolean comentario = false;
      
      String l = "";
      
      while (l != null) {
	l = br.readLine();
	
	if (l != null) {
	  if (l.indexOf("/*") != -1 || l.indexOf("//") != -1) {
	    comentario=true;
	  }
	  
	  if (!comentario) {
	    bw.write(l + "\n");
	  }
	  
	  if (l.indexOf("*/") != -1 || l.indexOf("//") != -1) {
	    comentario = false;
	  }
	}
      }
      
      br.close();
      bw.close();
    } catch (IOException ioe) {
      System.out.println("Error de lectura/escritura");
      System.err.println(ioe.getMessage());
    }
  }

}
