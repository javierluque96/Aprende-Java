public class T7Ejercicio11 {
  
  public static void main (String[] args) {
    int[] num = new int[10];
    int[] primo = new int[10];
    int[] noPrimo = new int[10];
    int i;
    int j;
    int primos = 0;
    int noPrimos = 0;
    boolean esPrimo = false;
    
    System.out.println("Introduce 10 números por teclado: ");
    
    for (i = 0; i < 10; i++) {
      esPrimo = true;
      num[i] = Integer.parseInt(System.console().readLine());
      
      for (j = 2; j < num[i]; j++) {
	if (num[i] % 2 == 0) {
	  esPrimo = false;
	}
      }
      
      if (esPrimo) {
	primo[primos++] = num[i];
      } else {
	noPrimo[noPrimos++] = num[i];
      }
    }
    
    // Imprime array inicial
    System.out.println("Array inicial: ");
    System.out.print("Indice: ");
    for (i = 0; i < 10; i++) {
      System.out.printf("%5d", i);
    }
    System.out.print("\nValor:  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("%5d", num[i]);
    }
    
    // Introduce los números primos al princio del array final
    for (i = 0; i < primos; i++) {
      num[i] = primo[i];
    }
    // Introduce los no primos una vez se hayan introducido los primos
    for (i = primos; i < 10; i++) {
      num[i] = noPrimo[i - primos];
    }
    
    // Imprime array final
    System.out.println("\n\nArray final: ");
    System.out.print("Indice: ");
    for (i = 0; i < 10; i++) {
      System.out.printf("%5d", i);
    }
    System.out.print("\nValor:  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("%5d", num[i]);
    }
  } 
}

