public class Ejercicio27 {
  
  public static void main (String[] args) {
    
    System.out.println("Este programa cuenta y suma los multiplos de 3 que hay "
      + "entre 1 y el numero introducido por teclado.");
    System.out.println("Introduce el numero maximo:");
    int n = Integer.parseInt(System.console().readLine());
    
    int contador = 0;
    int suma = 0;
    int i;
    
    for(i = 1; i <= n; i++){
      if(i % 3 == 0){
	suma += i;
	contador++;
      }
    }
    System.out.println("Total multiplos = " + contador + "\nSuma multiplos = "
      + suma);
		
  }
}

