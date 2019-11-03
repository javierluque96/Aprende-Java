public class T7Ejercicio06 {
  
  public static void main (String[] args) {
    int i;
    int [] num = new int[15];
    
    // Genera un array con los elementos rotados una posición a la derecha
    for (i = 0; i < 15; i++) {
      if (i == 14) {
	System.out.print("Introduce un número entero: ");
	num[0] = Integer.parseInt(System.console().readLine());
      } else {
	System.out.print("Introduce un número entero: ");
	num[i + 1] = Integer.parseInt(System.console().readLine());
      }
    }
    
    // Imprime el array generado
    System.out.print("Array Rotado\nIndice: ");
    for (i = 0; i < 15; i++) {
      System.out.printf("%5d", i);
    }
    
    System.out.print("\nValor:  ");
    for (i = 0; i < 15; i++) {
      System.out.printf("%5d", num[i]);
    }
  } 
}

