import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * @author Javier Luque Rodríguez
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
      
      for (int num = 1; num < 501; num++) {
	if (esPrimo(num)) {
	  bw.write(num + "  ");
	}
      }
      
      bw.write("\n");
      
      bw.close();
      
    } catch(IOException ioe) {
      System.out.println("No se ha podido crear o escribir en el fichero.");
    }

  }
  
  public static boolean esPrimo(int num) {

    boolean primo = true;

    for (int i = 2; i < num && primo; i++) {
      if (num % i == 0) {
	primo = false;
      }
    }

    return primo;
  }

}


