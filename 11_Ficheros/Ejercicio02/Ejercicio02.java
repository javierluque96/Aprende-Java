import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 * @author Javier Luque Rodríguez
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
      String linea = "";
      
      while (linea != null) {
	System.out.print(linea);
	linea = br.readLine();
      }
      
      br.close();
      
    } catch (FileNotFoundException fnfe) { // qué hacer si no se encuentra el fichero
      System.out.println("No se encuentra el fichero primos.dat");
    } catch (IOException ioe) { // qué hacer si hay un error en la lectura del fichero
      System.out.println("No se puede leer el fichero primos.dat");
    }
    
  }
}
