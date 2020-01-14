public class ExtraBucles5 {
  
  public static void main (String[] args) {
    System.out.print("Introduce la altura (al menos 5): ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int anchura = altura;
    int espacios = 0;
    int i, j;
    int huecos;
    
    for (i = 0; i < altura; i++) {
      huecos = 0;
      if (espacios == 3) {
	espacios = 0;
      }
      // Introduce espacios
      for (j = 0; j < espacios; j++) {
	System.out.print(" ");
	huecos++;
      }
      
      // Introduce asteriscos
      for (j = 0; j < altura / 2; j++){
	if (huecos < altura) {
	  System.out.print("*  ");
	}
	huecos += 3;
      }
      
      espacios++;
      System.out.println();
    }
  } 
}
