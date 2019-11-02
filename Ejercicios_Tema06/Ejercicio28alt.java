public class Ejercicio28alt {
  
  public static void main (String[] args) {
    System.out.print("Introduzca el tamaño del array: ");
    int array = Integer.parseInt(System.console().readLine());
    
    int i;
    int random;
    String arrayResultado = "";
    String arrayResultado2 = "";
    
    // Imprime el índice del array original
    System.out.print("Array original:\nIndice  ");
    
    for (i = 0; i < array; i++) {
      System.out.printf("%6d", i);
    }
    
    // Imprime el valor del array original
    System.out.print("\nValor   ");
    
    for (i = 0; i < array; i++) {
      random = (int)(Math.random() * 201);
      
      System.out.printf("%6d", random);
      
      // Concatena los valores de los números aleatorios como pide el ejercicio
      if (i % 2 == 0) {
	if (random > 99) {
	  arrayResultado2 = arrayResultado2 + "   " + random;
	} else if (random > 9) {
	  arrayResultado2 = arrayResultado2 + "    " + random;
	} else {
	  arrayResultado2 = arrayResultado2 + "     " + random;
	}
      } else  {
	if (random > 99) {
	  arrayResultado = arrayResultado + "   " + random;
	} else if (random > 9) {
	  arrayResultado = arrayResultado + "    " + random;
	} else {
	  arrayResultado = arrayResultado + "     " + random;
	}
      }
    }
    // Imprime el índice del array resultado
    System.out.print("\nArray resultado:\nIndice  ");
    for (i = 0; i < array; i++) {
      System.out.printf("%6d", i);
    }
    System.out.print("\nValor   ");
    System.out.println(arrayResultado2 + arrayResultado);
    
  } 
}

