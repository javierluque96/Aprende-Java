public class Ejercicio08 {
	
  public static void main (String[] args) {
    int i; 
    int input;
    
    
    System.out.println("Introduce el numero de la tabla de multiplicar:");
    input = Integer.parseInt(System.console().readLine());
    
    System.out.printf("La tabla del %d es:\n", input);
    
    for(i = 1; i < 11; i++){
      System.out.println(input + " x " + i + " = " + i * input);
    }
  }
}

