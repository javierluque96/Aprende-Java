public class Ejercicio11 {
	
  public static void main (String[] args) {
    
    System.out.println("Este programa muestra tres columnas con el cuadrado y "
      + "el cubo de los 5 números enteros a partir de uno introducido.");
    
    System.out.print("Introduce un número:");
    int num = Integer.parseInt(System.console().readLine());
    
    int i;
    
    for (i = num; i < num + 5; i++) {

      
      System.out.printf("%4d %8d %8d\n" , i , i * i, i * i * i);
      
    }
    
  }
}

