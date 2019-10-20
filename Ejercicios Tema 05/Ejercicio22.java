public class Ejercicio22 {
	
  public static void main (String[] args) {
    int primo;
    int n = 2;
    System.out.println("Este programa muestra todos los numeros primos entre "
    + " 2 y 100.");
    
    while(n <= 100){
      primo = 0;
      // Comprueba si el numero es primo
      for(int i = 1; i <= n; i++){
	if(n % i == 0){
	  primo++;
	}
      }	
      if(primo <= 2){
      System.out.println("El numero " + n + " es primo.");
      }
      n++;
    }
  }
}

