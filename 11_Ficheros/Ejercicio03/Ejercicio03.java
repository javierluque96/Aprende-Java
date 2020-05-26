/**
 * @author Javier Luque Rodríguez
 */

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Ejercicio03 {
  
  public static void main(String[] args) {
    
    if (args.length != 3) {
      System.out.println("Para el uso correcto de este programa debes pasar como parametro dos "
	+ "ficheros y el nombre que quieras como resultante");
    }
    
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[2]));
      BufferedReader br1 = new BufferedReader(new FileReader(args[0]));
      BufferedReader br2 = new BufferedReader(new FileReader(args[1]));
      
      String linea1 = "";
      String linea2 = "";
      
      while (linea1 != null || linea2 != null) {
	
	linea1 = br1.readLine();
	linea2 = br2.readLine();
	
	if (linea1 != null) {
	  bw.write(linea1 + "\n");  
	}
	
	if (linea2 != null) {
	  bw.write(linea2 + "\n");  
	}
	
      }
      
      br1.close();
      br2.close();
      bw.close();
    
    } catch (IOException ioe) { // qué hacer si hay un error en la lectura o escritura del fichero
      System.out.println("No se puede leer o escribir el fichero");
    }
  }
  
}
