public class T7Ejercicio09 {
  
  public static void main (String[] args) {
    int i;
    int [] num = new int [8];
    
    System.out.println("Introduce 8 números enteros: ");
    
    for (i = 0; i < 8; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("Los números introducidos son: ");
    
    for (int n : num) {
      if (n % 2 == 0) {
	System.out.println(n + " par");
      } else {
	System.out.println(n + " impar");
      }
    }
  } 
}

