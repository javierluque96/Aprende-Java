public class Ejercicio67 {
  
  public static void main (String[] args) {
    System.out.println("Este programa pinta una escalera.");
    
    System.out.print("Introduce el número de escalones: ");
    int escalones = Integer.parseInt(System.console().readLine());
      
    System.out.print("Introduce la altura de cada escalón: " );
    int alturaEscalon = Integer.parseInt(System.console().readLine());
    
    for (int i = 1; i <= escalones; i++) { // nº escalones
      for (int j = 0; j < alturaEscalon; j++){ //Altura escalon
	for (int k = 0; k < i; k++) { // asteriscos
	  System.out.print("****");
	}
	System.out.println();
      }
      
    }
  }
}

