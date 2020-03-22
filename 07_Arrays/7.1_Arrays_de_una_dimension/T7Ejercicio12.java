public class T7Ejercicio12 {
  
  public static void main (String[] args) {
    int[] num = new int[10];
    int[] aux = new int[2];
    int i;
    int auxI;
    int auxF;
    
    // Pedimos los valores que formaran el array
    System.out.println("Introduce 10 números por teclado: ");
    for (i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
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
  
    System.out.println();
    
    do {
      // Comprueba que se haya introducido correctamente la posicion inicial
      do{
	System.out.print("\nIntroduce la posición inicial (0-9): ");
	auxI = Integer.parseInt(System.console().readLine());
	
	if (auxI < 0 || auxI > 9) {
	  System.out.println("ERROR: posición inicial fuera del rango.");
	}
      } while ((auxI < 0)||(auxI > 9));
      
      // Comprueba que se haya introducido correctamente la posicion final
      do {
	System.out.print("Introduce la posición final (0-9): ");
	auxF = Integer.parseInt(System.console().readLine());
	
	if (auxF < 0 || auxF > 9) {
	  System.out.println("ERROR: posición final fuera del rango.");
	}
      } while ((auxF < 0)||(auxF > 9));
      
      // Manda mensaje de error si la posicion inicial es igual o mayor que la 
      // final
      if (auxI > auxF) {
	System.out.println("ERROR: la posición inicial introducida es mayor "
	  + "que la posición final. Vuelve a introducir los datos.");
      } else if (auxI == auxF) {
	System.out.println("ERROR: la posición inicial introducida es igual "
	  + "que la posición final. Vuelve a introducir los datos.");
      }
    } while ((auxI > auxF)||(auxI == auxF));
    
    // Intercambia la posición de los número indicados
    aux[0] = num[auxI];
    aux[1] = num[auxF];
    
    num[auxI] = aux[1];
    num[auxF] = aux[0];
    
    // Imprime array final
    System.out.println("\nArray final: ");
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

