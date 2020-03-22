/* Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo)*/

public class Ejercicio17 {
	
  public static void main (String[] args) {
    int n;
    int suma = 0;

    
    System.out.println("Este programa suma los 100 numeros siguiente al numero"
      + " introducido.");
    
    System.out.println("Introduce un numero:");
    n = Integer.parseInt(System.console().readLine());
  
  
    for(int i = 1; i <= 100; i++){
      suma = suma + n;
      
      n++;

    }
    System.out.println("La suma de los 100 numeros siguientes es: " + suma);
  }
}

