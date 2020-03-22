import java.util.Scanner;

public class Ejercicio58 {
  
  public static void main (String[] args) {
    System.out.println("Este programa calcula la media de los dígitos que "
      + "contiene un número.");
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número entero positivo: ");
    int num = s.nextInt();
    
    int contador = 0;
    int suma = 0;
    
    while (num > 0) {
      suma += num % 10;
      num /= 10;
      contador++;
    }
    
    System.out.println("La media de sus dígitos es " + (double)suma / contador);
  }
}

