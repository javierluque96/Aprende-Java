public class practica3_5 {
  
  public static void main (String[] args) {
    System.out.println("Calcula valor de Pi con el n fracciones introducidas.");
    
    System.out.print("Introduce el valor de n: ");
    int n = Integer.parseInt(System.console().readLine());
    
    int i;
    int numerador = 2;
    int denominador = 1;
    double pi = 2;
    
    for (i = 1; i <= n; i++) {
      pi *= (double) numerador / denominador;
      
      if (i % 2 == 0) {
	numerador += 2;
      } else {
	denominador += 2; 
      }
    }
    System.out.println("El valor de pi es " + pi);
  } 
}

