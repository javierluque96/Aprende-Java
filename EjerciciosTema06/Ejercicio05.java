public class Ejercicio05 {
  
  public static void main (String[] args) {
    System.out.println("Muestra 50 números entre el 100 y 199, y muestra el "
      + "máximo, mínimo y media.");
    
    int random;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int suma = 0;
    
    for (int i = 0; i < 50; i++) {
      random = (int)(Math.random() * 100) + 100;
      System.out.print(random + " ");
      
      if (random > maximo) {
	maximo = random;
      }
      if (random < minimo) {
	minimo = random;
      }
      
      suma += random;
    }
    System.out.printf("\nMáximo: %d\nMínimo: %d\nMedia: %d", maximo, minimo, 
      suma / 50);
  } 
}

