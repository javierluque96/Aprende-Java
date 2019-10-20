import java.util.Scanner;

public class Ejercicio31 {
	
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    char asteriscos = '*';
    int altura = 1;
    int alturaIntroducida;
    int longitudL;
    
    System.out.println("Este programa pinta una L hecha con asteriscos");    
    System.out.println("Introduce la altura de la L:");
    alturaIntroducida = s.nextInt();
    
    System.out.println();
    
    while(altura < alturaIntroducida){
      System.out.println(asteriscos);
      altura++;
    }
    
    for(int i = 0; i < (alturaIntroducida / 2 + 1); i++){
      System.out.print(asteriscos + " ");
    }
  }
}

