public class Ejercicio12 {
	
  public static void main (String[] args) {
    int a = 0; 
    int b = 1;
    int c = 0;
    int n;
    
    System.out.println("Este programa muestra los n primeros terminos de  la "
      + "serie de Fibonacci hasta el numero que le indiquemos.");    
    System.out.println("Introduce el numero hasta el que deseas la serie de "
      + "Fibonacci:");
    n = Integer.parseInt(System.console().readLine());
    
    switch(n){
      case 1:
	System.out.println(c);
	break;
      
      case 2:
	System.out.println("0 1");
	break;
	
      default:
	while(n > 2){
	  System.out.print(c + " ");
	  a = b;
	  b = c;
	  c = a + b;
	  n--;
	}
	break;
    }
    System.out.println();
  }
}

