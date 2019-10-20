import java.util.Scanner;

public class Ejercicio51 {
  
  public static void main (String[] args) {
    System.out.println("Este programa contiene un gusano númerico que se "
      + "come los números con forma de rosquilla.");
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero (mayor que cero): ");
    int num = s.nextInt();
    
    int aux = 0;
    int gusano = 0;
    int contador = 0;
    boolean encontrado;
    
    while (num > 0) {
      aux = (aux * 10) + (num % 10);
      
      num /= 10;
    }
      
    while (aux > 0) {
      if ((aux % 10 == 0) || (aux % 10 == 8)) {
	contador++;
      } else {
	gusano = (gusano * 10) + (aux % 10); 
      }
      aux /= 10;
    }
    
    if (contador > 0) {
      System.out.println("Después de haber sido comido por el gusano numérico "
	+ "se queda en " +  gusano);
    } else {
      System.out.println("El gusano numérico no se ha comido ningún dígito.");
    }
  }
}

