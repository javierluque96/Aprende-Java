public class Ejercicio29 {
	
  public static void main (String[] args) {
    
    int n1;
    int n2;
    int i;
    
    System.out.println("Este programa muestra todos los numeros enteros "
      + "positivos menores a uno leído por teclado que no sean divisibles entre"
      + " otro también leído por teclado.");
    
    do {
      System.out.println("Introduce el numero mayor:");
      n1 = Integer.parseInt(System.console().readLine());
      
      System.out.println("Introduce el numero del que no queremos que sea "
	+ "divisible:");
      n2 = Integer.parseInt(System.console().readLine());
      
      if(n1 < 0){
	System.out.println("El primer numero introducido es erroneo.");
      } else if (n2 < 0){
	System.out.println("El segundo numero introducio es erroneo");
      } else {
	System.out.println("Combinación erronea, introduzca los numeros de "
	  + "nuevo.");
      }
    } while(n1 <= 0 && n2 <= 0 && n1 < n2);
    
    for(i = 1; i <= n1; i++){
      if(i % n2 != 0){
	System.out.print(i + " ");
      }
    }
    
  }
}

