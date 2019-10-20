public class Ejercicio28 {
	
  public static void main (String[] args) {
    
    System.out.println("Este programa calcula el factorial.");
    System.out.println("Introduce el numero con el que calcular el factorial:");
    int n = Integer.parseInt(System.console().readLine());
    int i;
    int factorial = 1;
    for(i = n; i > 0; i--){
      factorial *= i;
    }
    System.out.println(n + "! = " + factorial);
  }
}

