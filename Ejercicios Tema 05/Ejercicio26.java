public class Ejercicio26 {
	
  public static void main (String[] args) {
    
    System.out.println("Este programa te dice que posicion ocupa un digito "
      + " en un numero introducido por teclado.");
      
    System.out.println("Introduce un numero entero:");
    int n = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el digito que buscas en el numero:");
    int digito = Integer.parseInt(System.console().readLine());
    
    
    int inverso = 0;
    int posicion = 1;
    
    // Da la vuelta al número
    while (n > 0){
      inverso = (inverso * 10) + (n % 10);
      n /= 10;
    }
    
    // Busca la posicion del digito
    while(inverso > 0){
      if((inverso % 10) == digito){
	System.out.println("El digito " + digito + " ocupa la posicion "
	  + posicion + ".");
      }
      inverso /= 10;
      posicion++;
    }
    
  }
}

