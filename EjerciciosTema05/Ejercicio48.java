import java.util.Scanner;

public class Ejercicio48 {
	
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    long num;
    long aux;
    boolean encontrado;
    System.out.println("Este programa te dice que digitos aparecen y no "
      + "aparecen en un número introducido por teclado.");
    
    System.out.print("Introduce un número entero: ");
    num = s.nextInt();
    
    System.out.print("\nDígitos que aparecen en el número: ");
  
    for (int i = 0; i < 10; i++) {
      // Comprueba si i esta en num
      encontrado = false;
      aux = num;
      while(aux > 0) {
	if (aux % 10 == i) {
	  encontrado = true;
	}
	aux /= 10;
      } 
      // Imprime los números que están en num
      if (encontrado) {
	System.out.print(i + " ");
      }
    }
    
    System.out.print("\nDígitos que no aparecen en el número: ");
    for (int i = 0; i < 10; i++) {
      // Comprueba si i esta en num
      encontrado = false;
      aux = num;
      while(aux > 0) {
	if (aux % 10 == i) {
	  encontrado = true;
	}
	aux /= 10;
      }
      // Imprime los números que no están en num
      if (!encontrado) {
	System.out.print(i + " ");
      }
    }
  }
}

