public class Ejercicio25 {
  
  public static void main (String[] args) {
    int i, j;
    int aleatorio;
    boolean primo;
    
    for (i = 0; i < 100; i++) {
      aleatorio = (int)(Math.random() * (200 - 10 + 1)) + 10;
      
      // Comprueba si el número es primo
      primo = true;
      for (j = 2; j < aleatorio; j++) {
	if (aleatorio % j == 0) {
	  primo = false;
	}
      }
      // Si es primo
      if (primo) {
	System.out.print("#" + aleatorio + "# ");
      // Si es multiplo de 5
      } else if (aleatorio % 5 == 0) {
	System.out.print("[" + aleatorio + "] ");
      // Si no es multiplo de 5 ni es primo
      } else {
	System.out.print(aleatorio + " ");
      }
    }
    
  } 
}

