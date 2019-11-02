public class T7Ejercicio03 {
  
  public static void main (String[] args) {
  
    int [] num = new int [10];
    int i;
    
    for (i = 0; i < 10; i++) {
      System.out.print("Introduce un número entero: ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    for(i = 9; i > 0; i--) {
      System.out.println(num[i]);
    }
  } 
}

