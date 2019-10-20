public class Ejercicio32 {
	
  public static void main (String[] args) {
    
    long num;
    long inverso = 0;
    long pares;
    int sumaPares = 0;
    
    System.out.println("Este programa busca los números pares que tenga un "
      + "numero entero positivo y los suma.");
    
    System.out.println("Por favor, introduzca un número entero positivo:");
    num = Long.parseLong(System.console().readLine());
    
    System.out.print("Dígitos pares: ");
    
    while(num > 0){
      inverso = (inverso * 10) + (num % 10);
      num /= 10;
    }
    
    while (inverso > 0){
      pares = inverso % 10;
      inverso /= 10;
      
      if(pares % 2 == 0){
	System.out.print(pares + " ");
	sumaPares += pares;
      }
    }
    System.out.println("\nSuma de los dígitos pares: " + sumaPares);
  }
}

