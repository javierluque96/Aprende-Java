/* Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad */

public class Ejercicio16 {
	
  public static void main (String[] args) {
    int n;
    boolean primo = true;

    
    System.out.println("Este programa comprueba si el numero es primo.");
    
    System.out.println("Introduce el numero primo:");
    n = Integer.parseInt(System.console().readLine());
    
    for(int i = 2; i < n; i++){
      if(n % i == 0){
	primo = false;
      }
    }
    
    if(primo){
      System.out.println("El numero " + n + " es primo.");
   
    } else {
      System.out.println("El numero " + n + " no es primo.");
    }
    
  }
}

