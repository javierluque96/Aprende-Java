public class T7Ejercicio10 {
  
  public static void main (String[] args) {
    
    int [] num = new int [20];
    int [] pares = new int [20];
    int [] impares = new int [20];
    int i;
    int numPar = 0;
    int numImpar = 0;
    
    for (i = 0; i < 20; i++) {
      num[i] = (int)(Math.random() * 101);
      // Introduce los números pares e impares en arrays auxiliares
      if (num[i] % 2 == 0) {
	pares[numPar++] = num[i];
      } else {
	impares[numImpar++] = num[i];
      }
    }
    
    System.out.print("Array original:   ");
    for (i = 0; i < 20; i++) {
      System.out.print(num[i] + "  ");
    }
    
    // Introduce los números pares al princio del array original
    for (i = 0; i < numPar; i++) {
      num[i] = pares[i];
    }
    // Introduce los impares una vez se hayan introducido los pares
    for (i = numPar; i < 20; i++) {
      num[i] = impares[i - numPar];
    }
    
    System.out.print("\n\nArray resultado:  ");
    for (i = 0; i < 20; i++) {
      System.out.print(num[i] + "  ");
    }
  } 
}

