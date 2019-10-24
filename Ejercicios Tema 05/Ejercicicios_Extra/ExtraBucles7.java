public class ExtraBucles7 {
  
  public static void main (String[] args) {
    System.out.print("Introduce la altura (al menos 5): ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int izquierda = 0;
    int i, j;
    int cuentaHuecos;
    int cuenta3;
    String caracteres;
    String imprimeLinea;
    
    for (i = 0; i < altura; i++) {
      cuentaHuecos = 0;
      cuenta3 = 0;
      caracteres = " ";
      
      // Pinta los espacios de la izquierda
      if (izquierda == 3) {
	izquierda = 0;
      } else if (izquierda >= 1) {
	imprimeLinea = String.format("%%%ds", izquierda);
	System.out.printf(imprimeLinea, caracteres);
	cuentaHuecos += izquierda;
      } 
      
      // Pinta las * y los espacios 
      for (j = cuentaHuecos; j < altura; j++) {
	if (cuenta3 % 3 == 0) {
	  caracteres = "*";
	} else {
	  caracteres = " ";
	}
	System.out.printf("%s", caracteres);
	cuenta3++;
	cuentaHuecos++;
      }
      izquierda++;
      System.out.println();
    }
  } 
}
