public class Ejercicio21 {
	
  public static void main (String[] args) {
    int num = 0;
    int contador = 0;
    int contadorImpares = 0;
    int sumaImpares = 0;
    int mayorPar = 0;
    double media = 0;
    
    System.out.println("Este programa cuenta los numeros introducidos, calcula"
      + " la media de los impares y el mayor de los pares.");
    
    while (num >= 0){
      System.out.println("Introduce un numero entero positivo, en caso de que "
	+ "desee salir introduzca un numero negativo.");
      num = Integer.parseInt(System.console().readLine());
      
      if(num < 0){
	System.out.println("Salimos del bucle.");
      }
      else if(num % 2 == 0 && num > mayorPar){
	mayorPar = num;
	contador++;
      } else{
	sumaImpares += num;
	contadorImpares++;
	contador++;
      }
      
    }
    
    media = sumaImpares / contadorImpares;
    
    System.out.printf("\nSe han introducido %d numeros. \nLa media de los "
      + "impares es %.2f. \nEl mayor numero par introducido es %d.", contador,
      media, mayorPar);
    
  }
}

