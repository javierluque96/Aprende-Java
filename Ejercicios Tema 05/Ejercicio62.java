import java.util.Scanner;

public class Ejercicio62 {
  
  public static void main (String[] args) {
    System.out.println("Este programa te dice si tu número es afortunado.");
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número: ");
    long num = s.nextLong();
    
    long aux = num;
    int suerte = 0;
    int malaSuerte = 0;
    
    while (aux > 0) {
      if ((aux % 10 == 3) || (aux % 10 == 7) || (aux % 10 == 8) || 
	(aux % 10 == 9)) {
	suerte++;
      } else {
	malaSuerte++;
      }
      
      aux /= 10;
    }
    
    if (suerte > malaSuerte) {
      System.out.println("El " + num + " es un número afortunado.");
    } else {
      System.out.println("El " + num + " NO es un número afortunado.");
    }
  }
}

