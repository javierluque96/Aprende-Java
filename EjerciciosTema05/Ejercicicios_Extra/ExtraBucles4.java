public class ExtraBucles4 {
  
  public static void main (String[] args) {
    System.out.println("Este programa es un juego en el que tienes que "
      + "adivinar un número entero.");
    
    int num = 1996; // Número a adivinar
    int input;
    int mayor = Integer.MAX_VALUE;
    int menor = Integer.MIN_VALUE;
    String comparacion = "";
    boolean adivinado = false;
    
    do {

      System.out.print("\nIntroduce un número: ");
      input = Integer.parseInt(System.console().readLine());
      
      // Calcula los números mayores y menores 
      if (input > num) {
	if ((mayor - num) > (input - num)) {
	  mayor = input;
	} 
	comparacion = "GRANDE";
	    
      } else if (input < num) {
	if (Math.abs(num - menor) > Math.abs(num - input)) {
	  menor = input;
	} 
	comparacion = "PEQUEÑO";
      }
      
      /* Comprueba e imprime si has acertado o no. Si no aciertas imprime 
       * números introducidos mayores y menores */
      if(num != input) {
	if (menor == Integer.MIN_VALUE) {
	  System.out.printf("%d es más %s que el número a adivinar.\n\nNúmero "
	  + "por encima más cercano: %d\nNúmero por debajo más cercano:\n", 
	  input, comparacion, mayor);
	} else if (mayor == Integer.MAX_VALUE) {
	  System.out.printf("%d es más %s que el número a adivinar.\n\nNúmero "
	  + "por encima más cercano:\nNúmero por debajo más cercano: %d\n", 
	  input, comparacion, menor);
	} else {
	  System.out.printf("%d es más %s que el número a adivinar.\n\nNúmero "
	    + "por encima más cercano: %d\nNúmero por debajo más cercano: %d\n", 
	    input, comparacion, mayor, menor);
	  }
      } else {
	System.out.println("\n¡¡Enhorabuena, has acertado el número!!");
	adivinado = true;
      }
    } while (adivinado == false);
  } 
}
