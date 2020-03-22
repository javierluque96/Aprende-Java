import java.util.Scanner;

public class Ejercicio39 {
	
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    int num;
    int i;
    int factorial = 1;
    
    System.out.println("Muestra los factoriales desde el 1 hasta el numero "
      + "introducido");
    System.out.println("Introduce un número entero positivo:");    
    num = s.nextInt();
    
    for(i = 1; i <= num; i++){
      
      factorial *= i;
      
      System.out.println(i + "! = " + factorial);
    }
    
  }
}

