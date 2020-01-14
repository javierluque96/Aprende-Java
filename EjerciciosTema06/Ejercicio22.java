public class Ejercicio22 {
  
  public static void main (String[] args) {
    System.out.println("Introduce la longitud de la serpiente contando la "
      + "cabeza: ");
    int longitud = Integer.parseInt(System.console().readLine());
    
    int cuerpo = 12;
    int i;
    
    // Pinta la cabeza
    System.out.println("            @");
    
    // Pinta el cuerpo
    while (longitud > 1) {
      // Suma -1, 0 ó 1 al cuerpo, es decir, lo mueve a la izq, igual o derecha
      cuerpo += (int)(Math.random() * 3) - 1;
      
      for (i = 0; i < cuerpo; i++){
	System.out.print(" ");
      }
      
      System.out.println("*");
      
      longitud--;
    }
  } 
}

