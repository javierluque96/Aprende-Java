public class Ejercicio04 {
  
  public static void main (String[] args) {
    System.out.println("Muestra 20 número aleatorios entre 0 y 10.");
    
    for (int i = 0; i < 20; i++) {
      System.out.print((int)(Math.random() * 11) + " ");
    }
  } 
}

