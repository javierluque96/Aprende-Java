public class T7Ejercicio07 {
  
  public static void main (String[] args) {
    int i;
    int [] num = new int [100];
    int valor1;
    int valor2;
    
    // Genera un array de 100 numero con números aleatorios del 0 al 20
    System.out.print("Array original: ");
    for (i = 0; i < 100; i++) {
      num[i] = (int)(Math.random() * 21);
      
      System.out.printf("  %d", num[i]);
    }
    
    System.out.print("\n\nIntroduzca un número de los que se han mostrado: ");
    valor1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
    valor2 = Integer.parseInt(System.console().readLine());
    
    // Imprime el array resultado
    System.out.print("\nArray resultado: ");
    
    System.out.print("\nValor: ");
    for (i = 0; i < 100; i++) {
      if (num[i] == valor1) {
	num[i] = valor2;
	System.out.printf("  \"" + "%d" + "\"", num[i]);
      } else {
	System.out.printf("  %d", num[i]);
      }
    }
  } 
}

