public class T7Ejercicio19 {
  
  
  public static void main (String[] args) {
    int[] numero = new int[12];
    int numeroIntroducido;
    int posicion;
    int i;
    
    // Imprime el array original
    System.out.println("----------------------------------------------------"
      + "----------------");
    System.out.print("|Indice|");
    for (i = 0; i < 12; i++) {
      numero[i] = (int)(Math.random() * 201);
      System.out.printf("%4d|", i);
    }
    System.out.println("\n----------------------------------------------------"
      + "----------------");
    System.out.print("|Valor |");
    for (int n : numero) {
      System.out.printf("%4d|", n);
    }
    System.out.println("\n----------------------------------------------------"
      + "----------------");
    
    // Pregunta el número y la posición
    System.out.print("Introduzca el número que quiere insertar: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la posición donde lo quiere insertar (0 - 11)"
      + ": ");
    posicion = Integer.parseInt(System.console().readLine());
    
    // Rota los números una posicion a la derecha desde la posición indicada
    for (i = 11; i > posicion; i--) {
      numero[i] = numero[i - 1];
    }
    
    // Introduce el número en la posición indicada
    numero[posicion] = numeroIntroducido;
    
    // Imprime el array resultado
    System.out.println("\n----------------------------------------------------"
      + "----------------");
    System.out.print("|Indice|");
    for (i = 0; i < 12; i++) {
      System.out.printf("%4d|", i);
    }
    System.out.println("\n----------------------------------------------------"
      + "----------------");
    System.out.print("|Valor |");
    for (int n : numero) {
      System.out.printf("%4d|", n);
    }
    System.out.println("\n----------------------------------------------------"
      + "----------------");
  } 
}

