public class T7Ejercicio21 {
  
  
  public static void main (String[] args) {
    int[] num = new int[15];
    int i;
    
    // Imprime el array original
    System.out.println("Array Original:");
    System.out.println("------------------------------------------------"
      + "--------------------");
    System.out.print("|Indice|");
    
    // General el array original e imprime el indice
    for (i = 0; i < 15; i++) {
      num[i] = (int)(Math.random() * 501);
      
      System.out.printf("%3d|", i);
    }
    
    System.out.println("\n------------------------------------------------"
      + "--------------------");
    System.out.print("|Valor |");
    
    for (int n : num) {
      System.out.printf("%3d|", n);
    }
    
    System.out.println("\n------------------------------------------------"
      + "--------------------");
   
    // Cincueriza los números que no sean múltiplo de 5
    for (i = 0; i < 15; i++) {
      if (num[i] % 5 != 0) {
	do {
	  num[i]++;
	} while (num[i] % 5 != 0);
      }
    }
    
    // Imprime el array cincuirizado
    System.out.println("\nArray Cincuerizado:");
    System.out.println("-----------------------------------------------"
      + "---------------------");
    System.out.print("|Indice|");
    
    for (i = 0; i < 15; i++) {
      System.out.printf("%3d|", i);
    }
    
    System.out.println("\n------------------------------------------------"
      + "--------------------");
    System.out.print("|Valor |");
    
    for (int n : num) {
      System.out.printf("%3d|", n);
    }
    
    System.out.println("\n------------------------------------------------"
      + "--------------------");
    
  }
}

