public class Ejercicio13 {
  
  public static void main (String[] args) {
    int dado1, dado2;
    
    System.out.println("Este programa muestra la tirada de dos dados hasta que "
      + "la tirada de ambos dados sean el mismo número.");
    do{
      dado1 = (int)(Math.random() * 6) + 1;
      dado2 = (int)(Math.random() * 6) + 1;
      
      System.out.print(dado1 + " " + dado2 + " ");
      System.out.println();
    } while (dado1 != dado2);
  } 
}

