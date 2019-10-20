/* Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7.
 */


public class Ejercicio18 {
	
  public static void main (String[] args) {
    int n1, n2;
    int suma7;
    
    System.out.println("Este programra pide dos numeros y va sumando de 7 en 7"
      + " desde el mas pequeño al mas grande");
    
    do{ 
      System.out.println("Introduce el primer numero entero positivo:");
      n1 = Integer.parseInt(System.console().readLine());
    
      System.out.println("Introduce el segundo numero entero positivo:");
      n2 = Integer.parseInt(System.console().readLine());
      
      if(n1 == n2) {
        System.out.println("Los números introducidos no son válidos, "
	  + "deben ser distintos.");
      }
    } while (n1 == n2);
    
    if(n1 > n2){
      System.out.println("Los numeros comprendidos entre " + n2 + " y " + n1
	+ " son: ");
      for(int i = n1; i < n1; i += 7){
	System.out.println(i);
      }
    } else {
      System.out.println("Los numeros comprendidos entre " + n1 + " y " + n2
	+ " son: ");
      for(int i = n1; i < n2; i += 7){
	System.out.println(i);
      }
    } 

  }
}

