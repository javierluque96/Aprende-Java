public class Ejercicio28 {
  
  public static void main (String[] args) {
    System.out.print("Introduzca el tamaño del array: ");
    int array = Integer.parseInt(System.console().readLine());
    
    int i;
    int random;
    String indice = "";
    String valorOriginal = "";
    String valorRes1 = "";
    String valorRes2 = "";
    
    // Genera el índice y el valor de los arrays original y resultado
    for (i = 0; i < array; i++) {
      // Concatena los indices
      indice += String.format("%6d", i);
      
      // Genera los valores originales y los concatena
      random = (int)(Math.random() * 201);
      valorOriginal += String.format("%6d", random);
      
      // Concatena los valores del array resultado
      if (i % 2 == 0) {
	valorRes1 += String.format("%6d", random);
      } else {
	valorRes2 += String.format("%6d", random);
      }
    }
    
    // Imprime el array original
    System.out.print("Array original:\nIndice  " + indice);
    System.out.println("\nValor   " + valorOriginal);
    // Imprime el array resultado
    System.out.print("\nArray resultado:\nIndice  " + indice);
    System.out.println("\nValor   " + valorRes2 + valorRes1);
    
  } 
}

