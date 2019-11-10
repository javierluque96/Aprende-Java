public class T7Ejercicio20 {
  
  
  public static void main (String[] args) {
    System.out.print("Introduzca el número total de reyes: ");
    int numReyes = Integer.parseInt(System.console().readLine());
    
    String[] reyes = new String[numReyes];
    int linaje = 0;
    int i, j;
    
    System.out.println("Introduzca los nombres de los reyes: ");
    for (i = 0; i < numReyes; i++) {
      reyes[i] = System.console().readLine();
    }
    
    System.out.println("\nLos reyes introducidos son: ");
    for (i = 0; i < numReyes; i++) {
      linaje = 1;
      
      for (j = 0; j < i; j++) {
	if (reyes[i].equals(reyes[j])) {
	  linaje++;
	}
      }
      System.out.println(reyes[i] + " " + linaje + "º");
    }
    
  } 
}

