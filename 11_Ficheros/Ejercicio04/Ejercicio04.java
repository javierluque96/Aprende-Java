/**
 * @author Javier Luque Rodríguez
 */
 
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio04 {
  
  public static void main(String[] args) {
    
    if (args.length != 1) {
      System.out.println("Introduce solo un fichero.");
    }
    
    try {
      
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[0] + "_sort.txt"));
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      ArrayList<String> palabras = new ArrayList<String>();
      
      String l = "";
      
      while (l != null) {
	l = br.readLine();
	
	if (l != null) {
	  palabras.add(l);
	}
      }
      
      Collections.sort(palabras);
      
      for (String p : palabras) {
	bw.write(p + "\n");
      }
      
      
      br.close();
      bw.close();
    } catch (IOException ioe) {
      System.out.println("Error de lectura/escritura");
    }
  }

}
