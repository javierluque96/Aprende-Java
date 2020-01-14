import java.util.Scanner;

public class Ejercicio47 {
	
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    boolean condicion = true;
    int altura, i, j;
    System.out.println("Este programa pinta un un OCHO hechos con M.");    
    
    do{
    
      System.out.println("Introduce la altura (número impar mayor o igual "
	+ "que 5): ");
      altura = s.nextInt();
      
      if (altura < 5 || altura % 2 == 0){
	System.out.println("La altura introducida no es correcta. Vuelve la "
	  + "altura.");
	condicion = false;
      }
    
    } while (condicion == false);
    
    // Pinta la parte superior de M
    System.out.print("MMMMMM");
  
    for(i = 1; i <= altura / 2 - 1; i ++){
      System.out.println();
      System.out.print("M    M");
    }
    
    // Pinta la parte inferior de M
    System.out.print("\nMMMMMM");
    
    for(i = 1; i <= altura / 2 - 1; i ++){
      System.out.println();
      System.out.print("M    M");
    }
    
    System.out.println("\nMMMMMM");
  }
}

