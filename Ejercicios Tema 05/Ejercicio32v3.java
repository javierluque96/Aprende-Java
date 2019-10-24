public class Ejercicio32v3 {
	
  public static void main (String[] args) {
    
    long num;
    int digito = 0;
    int sumaPares = 0;
    String pares = "";
    
    System.out.println("Este programa busca los números pares que tenga un "
      + "numero entero positivo y los suma.");
    
    System.out.println("Por favor, introduzca un número entero positivo:");
    num = Long.parseLong(System.console().readLine());
    
    while(num > 0){
      digito = (int)num % 10;
      
      // pares acumula los pares del número de izquierda a derecha
      if(digito % 2 == 0){
	pares = Integer.toString(digito) + " " + pares;
	sumaPares += digito;
      }
      num /= 10;
    }
    
    System.out.print("Dígitos pares: " + pares);
    System.out.println("\nSuma de los dígitos pares: " + sumaPares);
  }
}

