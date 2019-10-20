public class ExtraBucles1 {
  
  public static void main (String[] args) {
    System.out.println("Este programa pinta una pirámide con un espacio entre "
      + "asteriscos");
    
    System.out.print("Introduce la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el carácter para pintar la pirámide: ");
    char c = System.console().readLine().charAt(0);
    
    int espacios = alturaIntroducida - 1;
    int altura = 1;
    int i;
    
    while (altura <= alturaIntroducida) {
      // Inserta espacios
      for (i = 0; i < espacios; i++) {
	System.out.print(" ");
      }
      
      for (i = 0; i < altura; i++) {
	System.out.print(c + " ");
      }
      System.out.println();
      
      espacios--;
      altura++;
    } // while
  } 
}

