import java.util.Scanner;

public class Ejercicio46 {
	
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    int anchura;
    int altura;
    int i, j;
    boolean condicion = true;
    
    System.out.println("Este programa pinta un rectángulo.");    
    
    do{
      
      System.out.println("Introduce la anchura del rectángulo (como mínimo 2):");
      anchura = s.nextInt();
    
      System.out.println("Introduce la altura del rectángulo (como mínimo 2):");
      altura = s.nextInt();
      
      if (altura < 2 || anchura < 2){
	System.out.println("Los datos introducidos no son correctos. Vuelve a "
	  + "introducirlos.");
	condicion = false;
      }
    
    } while (condicion == false);
    
    System.out.println();
    
    // Pinta la linea superior
    for (i = 1; i <= anchura; i++){
      System.out.print("* ");
    }
    
    // Pinta las lineas de en medio 
    for(i = 1; i <= altura - 2; i++){
      System.out.print("\n* ");
      
      // Pinta los espacios del centro
      for(j = 1; j <= anchura - 2; j++){
	System.out.print("  ");
      }
      System.out.print("*");
    }
    
    // Pinta la linea inferior
    System.out.println();
    for (i = 1; i <= anchura; i++){
      System.out.print("* ");
    }
  }
}

