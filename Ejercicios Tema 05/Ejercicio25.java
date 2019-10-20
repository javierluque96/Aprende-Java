public class Ejercicio25 {
	
  public static void main (String[] args) {
    
    System.out.println("Este programa muestra el numero introducido al reves.");
    
    System.out.println("Introduce un numero:");
    int num = Integer.parseInt(System.console().readLine());
    
    int numInvertido;
    
    System.out.println("\nEl numero invertido es:");
    
    // Invierte el numero
    while(num > 0){
      numInvertido = num % 10;
      num = num / 10;
      System.out.print(numInvertido);
    }
  }
}

