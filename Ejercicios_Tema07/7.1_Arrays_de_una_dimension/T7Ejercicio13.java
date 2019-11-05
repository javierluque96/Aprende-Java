public class T7Ejercicio13 {
  
  public static void main (String[] args) {
    int[] num = new int[100];
    int i;
    int opcion;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    // Pedimos los valores que formaran el array
    for (i = 0; i < 100; i++) {
      num[i] = (int)(Math.random() * 501);
      System.out.print(num[i] + "  ");
      
      if (num[i] >= maximo) {
	maximo = num[i];
      }
      if (num[i] <= minimo) {
	minimo = num[i];
      }
    }
  
    System.out.print("\n¿Qué quiere destacar? (1 - mínimo, 2- máximo): ");
    opcion = Integer.parseInt(System.console().readLine());
    
    System.out.println();
    
    for (i = 0; i < 100; i++) {
      if ((num[i] == maximo) && (opcion == 2)) {
	System.out.print("**" + num[i] + "**  ");
      } else if ((num[i] == minimo) && (opcion == 1)) {
	System.out.print("**" + num[i] + "**  ");
      } else {
	System.out.print(num[i] + "  ");
      }
    }
  } 
}

