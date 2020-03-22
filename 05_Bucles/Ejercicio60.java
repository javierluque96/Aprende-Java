import java.util.Scanner;

public class Ejercicio60 {
  
  public static void main (String[] args) {
    System.out.println("Este programa pinta un par de calcetines.");
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la altura de los calcetines: ");
    int altura = s.nextInt();
    int i;
    
    for (i = 0; i < altura - 2; i++) {
      System.out.print("***     ***\n");
    }
    
    for (i = 0; i < 2; i++) {
      System.out.print("******  ******\n");
    }
  }
}

