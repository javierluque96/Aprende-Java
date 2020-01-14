import java.util.Scanner;

public class Ejercicio52 {
  
  public static void main (String[] args) {
    System.out.println("Este programa desplaza los dígitos de derecha a "
      + "izquierda una posición.");
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número: ");
    int num = s.nextInt();
    
    int inverso = 0;
    int digito;
    
    // Da la vuelta al numero
    while (num > 0){
      inverso = (inverso * 10) + (num % 10);
      num /= 10;
    }
    
    // Extraemos el primer dígito de la izquierda
    num = 0;
    digito = inverso % 10;
    inverso /= 10;
    
    while (inverso > 0) {
      num = (num * 10) + (inverso % 10);
      
      inverso /= 10;
    }
    
    // Insertamos el dígito a la derecha del todo
    num = (num * 10) + digito;
    
    System.out.println("El número resultante es " + num);
  }
}

