// Escribe un programa que pida una base y un exponente (entero positivo) y que
// calcule la potencia

public class Ejercicio14 {
	
  public static void main (String[] args) {
    int base;
    int exponente;
    double potencia = 1;

    
    System.out.println("Este programa calcula potencias.");
    
    System.out.println("Introduce la base de la potencia:");
    base = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el exponente de la potencia:");
    exponente = Integer.parseInt(System.console().readLine());
    
    if(exponente == 0){
      potencia = 1;
    
    } else if(exponente > 0){
      while(exponente > 0){
	potencia *= base;
	exponente--;
      }
    } else if(exponente < 0){

      while(exponente < 0){
	potencia *= base;
	exponente++;
      }
      potencia = 1 / potencia;
    }
    System.out.println("\nEl resultado de la potencia es: " + potencia);
  }
}

