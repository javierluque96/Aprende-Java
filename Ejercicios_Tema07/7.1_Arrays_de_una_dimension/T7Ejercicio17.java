public class T7Ejercicio17 {
  
  
  public static void main (String[] args) {
    int[] numero = new int[10];
    int num;
    int aux;
    int i;
    boolean enNumero = false;
    
    // Imprime el array original
    System.out.println("------------------------------------------------");
    System.out.print("|Indice|");
    for (i = 0; i < 10; i++) {
      numero[i] = (int)(Math.random() * 101);
      System.out.printf("%3d|", i);
    }
    System.out.println("\n------------------------------------------------");
    System.out.print("|Valor |");
    for (int n : numero) {
      System.out.printf("%3d|", n);
    }
    System.out.println("\n------------------------------------------------");
    
    // Comprueba que el número está en el array
    do {
      System.out.print("\nIntroduce un número del array: ");
      num = Integer.parseInt(System.console().readLine());
      
      for (int n : numero) {
	if (n == num) {
	  enNumero = true;
	}
      }
      
      if (!enNumero) {
	System.out.println("Ese número no se encuentra en el array.");
      }
    } while (!enNumero);
    
    // Desplaza el array para que el número ocupe la posición 0
    do {
      // Rota a la derecha 1 digito
      aux = numero[9];
      for (i = 9; i > 0; i--) {
	numero[i] = numero[i - 1]; 
      }
      numero[0] = aux;
    } while (numero[0] != num);
    
    // Imprime el array desplazado
    System.out.println("\n------------------------------------------------");
    System.out.print("|Indice|");
    for (i = 0; i < 10; i++) {
      System.out.printf("%3d|", i);
    }
    System.out.println("\n------------------------------------------------");
    System.out.print("|Valor |");
    for (int n : numero) {
      System.out.printf("%3d|", n);
    }
    System.out.println("\n------------------------------------------------");
  } 
}

