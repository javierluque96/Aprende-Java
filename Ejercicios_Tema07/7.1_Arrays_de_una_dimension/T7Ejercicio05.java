public class T7Ejercicio05 {
  
  public static void main (String[] args) {
    int i;
    int [] num = new int [10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    for (i = 0; i < 10; i++) {
      System.out.print("Introduce un número entero: ");
      num[i] = Integer.parseInt(System.console().readLine());
      
      if (num[i] >= maximo) {
	maximo = num[i];
      } 
      if ((num[i] <= minimo)){
	minimo = num[i];
      }
    }
    
    for (i = 0; i < 10; i++) {
      System.out.print(num[i]);
      if (num[i] == maximo) {
	System.out.print(" máximo");
      }
      
      if (num[i] == minimo) {
	System.out.print(" mínimo");
      } 
      System.out.println();
    }
    
  } 
}

