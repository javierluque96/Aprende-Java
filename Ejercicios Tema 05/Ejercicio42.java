public class Ejercicio42 {
	
  public static void main (String[] args) {
    
    System.out.println("Este programa comprueba si los 5 números siguientes "
      + "a uno introducido son primos.");    
    
    System.out.println("Introduce un número entero positivo:");
    int num = Integer.parseInt(System.console().readLine());
    
    int primo = 0;
    int i;
    int j;
    
    for(i = num ; i < num + 5; i++){
      
      for(j = 1; j <= num; j++){
	
	if(num % j == 0){
	  primo++;
	} 
      } 
      
      if(primo == 2){
	System.out.println(i + " es primo");
      } else {
	System.out.println(i + " no es primo");
      }
    }
  }
}

