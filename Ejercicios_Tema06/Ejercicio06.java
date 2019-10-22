public class Ejercicio06 {
  
  public static void main (String[] args) {
    
    int vidas = 5;
    int num;
    int numAdivina = (int)(Math.random() * 101);
    
    System.out.println("¡Tienes 5 vidas para adivinar el número!");
    System.out.println("Pista el número esta entre el 0 y el 100 incluidos.");
    
    while (vidas > 0) {
      System.out.print("\nIntroduce un número: ");
      num = Integer.parseInt(System.console().readLine());
      
      vidas--;
      
      if (num > numAdivina) {
	System.out.println(num + " es MAYOR.");
      } else if (num < numAdivina) {
	System.out.println(num + " es MENOR.");
      } else {
	System.out.println("¡¡¡Enhorabuena, has acertado el número!!!");
	vidas = -1;
      }
      if (vidas > 1) {
	System.out.println("Te quedan " + vidas + " vidas.");
      } else if (vidas == 0) {
	System.out.println("\nLo siento, te has quedado sin vidas. El número "
	  + "era: " + numAdivina);
      }
    }
    
  } 
}

