public class T7Ejercicio18 {
  
  
  public static void main (String[] args) {
    int[] num = new int[10];
    int[] menores = new int[10];
    int[] mayores = new int[10];
    int indiceMenores = 0;
    int indiceMayores = 0;
    int menoresColocados = 0;
    int mayoresColocados = 0;
    int i;
    
    // Imprime el array original
    System.out.println("Array Original:");
    System.out.println("------------------------------------------------");
    System.out.print("|Indice|");
    // General el array original e imprime el indice
    for (i = 0; i < 10; i++) {
      num[i] = (int)(Math.random() * 201);
      // Clasifica los numeros mayores que 100 en un array y 
      // los menores o iguales en otro
      if (num[i] > 100) {
	mayores[indiceMayores++] = num[i];
      } else {
	menores[indiceMenores++] = num[i];
      }
      System.out.printf("%3d|", i);
    }
    System.out.println("\n------------------------------------------------");
    System.out.print("|Valor |");
    for (int n : num) {
      System.out.printf("%3d|", n);
    }
    System.out.println("\n------------------------------------------------");
    
    // Genera el array resultado
    i = 0;
    do {
      if (menoresColocados < indiceMenores) {
	num[i++] = menores[menoresColocados++];
      }
      
      if (mayoresColocados < indiceMayores) {
	num[i++] = mayores[mayoresColocados++];
      }
    } while (i < 10);
    
    
    // Imprime el array resultado
    System.out.println("\nArray Resultado:");
    System.out.println("------------------------------------------------");
    System.out.print("|Indice|");
    for (i = 0; i < 10; i++) {
      System.out.printf("%3d|", i);
    }
    System.out.println("\n------------------------------------------------");
    System.out.print("|Valor |");
    for (int n : num) {
      System.out.printf("%3d|", n);
    }
    System.out.println("\n------------------------------------------------");
  } 
}

