/* Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5 */

public class Ejercicio15 {
	
  public static void main (String[] args) {
    int base;
    int exponente;
    double potencia = 1;

    
    System.out.println("Este programa calcula potencias.");
    
    System.out.println("Introduce la base de la potencia:");
    base = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el exponente de la potencia:");
    exponente = Integer.parseInt(System.console().readLine());
    
    for(int i = 1; i <= exponente; i++){
      potencia *= base;
      System.out.println(base + "^" + i + " = " + potencia);
    }
  }
}

