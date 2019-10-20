import java.util.Scanner;

public class Ejercicio55 {
  
  public static void main (String[] args) {
    System.out.println("Este programa desplaza los dígitos de izquierda a "
      + "derecha una posición.");
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número: ");
    long num = s.nextLong();
    
    long copia = num;
    int longitud = 0;
    int digito;
    
    while (copia > 0) {
      copia /= 10;
      longitud++;
    }
    
    digito = (int) num % 10;
    num /= 10;
    
    num += digito * Math.pow(10, longitud - 1);
    
    System.out.println("El número resultante es " + num);
  }
}

