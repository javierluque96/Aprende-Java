import java.util.Scanner;

public class Ejercicio44 {
	
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa inserta un digito en un número.");    
    
    System.out.println("Introduce un número entero positivo:");  
    int num = s.nextInt();
    
    System.out.println("Introduzca la posición donde quiere insertar: ");
    int posicion = s.nextInt();
    
    System.out.println("Introduzca el dígito que quiere insertar");  
    int digito = s.nextInt();
    
    int inverso = 0;
    int parte1 = 0;
    int parte2 = 0;    
    
    // Damos la vuelta al numero para leerlo de izquierda a derecha
    while(num > 0){
      inverso = (inverso * 10) + (num % 10);
      num /= 10;
    }
    
    // Partimos el número en 2 
    while(posicion > 1){
      parte1 = (parte1 * 10) + (inverso % 10);
      inverso /= 10;
      
      posicion--;
    }
    
    while(inverso > 0){
      parte2 = (parte2 * 10) + (inverso % 10);
      inverso /= 10;
    }
    
    System.out.println("El número resultante es " + parte1 + digito + parte2);
  }
}

