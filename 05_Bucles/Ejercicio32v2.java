public class Ejercicio32v2 {
	
  public static void main (String[] args) {
        
    System.out.println("Este programa busca los números pares que tenga un "
      + "numero entero positivo y los suma.");
    
    System.out.println("Por favor, introduzca un número entero positivo:");
    long num = Long.parseLong(System.console().readLine());
    
    long aux = num;
    int divisor = 1;
    int sumaPares = 0;
    int longitud = 0;
    
    while (aux > 0) {
      aux /= 10;
      longitud++;
      divisor *= 10;      
    }
    
    System.out.print("Dígitos pares: ");
    
    while (longitud > 0) {
      divisor /= 10;
      
      aux = num / divisor;
      aux = aux % 10;
      
      if (aux % 2 == 0) {
	System.out.print(aux + " ");
	sumaPares += aux;
      }
      longitud--;
    }
    
    System.out.println("\nSuma de los dígitos pares: " + sumaPares);
  }
}

