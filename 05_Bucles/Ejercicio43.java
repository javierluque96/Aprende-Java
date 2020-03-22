import java.util.Scanner;

public class Ejercicio43 {
	
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa parte un número en dos.");
    System.out.println("Introduce un número entero positivo: ");
    int num1 = s.nextInt();
    
    System.out.println("Introduce la posición a partir de la cual quiere "
      + "partir el número:");
    int num2 = s.nextInt();
    
    int inverso = 0;
    
    // Invertimos el numero para contar la posicion desde la izquierda
    while(num1 > 0){
      inverso = (inverso * 10) + (num1 % 10);
      num1 /= 10;
      
    }
    
    num1 = 0;
    
    // Parte en dos el numero
    while(num2 > 1){
      num1 = (num1 * 10) + (inverso % 10);
      inverso /= 10;
      
      num2--;
    }
    
    // termina de dar la vuelta al numero para ponerlo al derecho
    num2 = 0;
    while(inverso > 0){
      num2 = (num2 * 10) + (inverso % 10);
      inverso /= 10;
    }
    
    System.out.println("Los numeros partidos son: " + num1 + " y " + num2);
    
  }
}

