import java.util.Scanner;

public class Ejercicio49 {
	
  public static void main (String[] args) {
    
    System.out.println("Introduce números enteros positivos. Para terminar, "
      + "introduce un número primo:");
    
    Scanner s = new Scanner(System.in);
    int num;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int suma = 0;
    int contador = 0;
    int primo = 0;
    boolean condicion = true;
  
    do {
      num = s.nextInt();
      primo = 0;
      
      // Comprueba si el numero es primo
      for (int i = 2; i <= num; i++){
	if ((num % i) == 0){
	  primo++;
	}
      }
      if (primo == 1) {
	condicion = false;
      }
      
      // Establece los maximos y minimos
      if(num >= maximo){
	maximo = num;
      }
      if(num <= minimo){
	minimo = num;
      }
      
      suma += num;
      contador++;
    } while(condicion == true);
    
    suma -= num;
    contador--;
    
    System.out.println("Ha introducido " + contador + " números no primos.");
    System.out.println("Máximo: " + maximo);
    System.out.println("Mínimo: " + minimo);
    System.out.println("Media: " + (double)suma / contador);
  }
}

