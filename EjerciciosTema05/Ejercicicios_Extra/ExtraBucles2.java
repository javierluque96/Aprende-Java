public class ExtraBucles2 {
  
  public static void main (String[] args) {
    System.out.println("Este programa pinta una pirámide.");
    
    System.out.print("Introduce la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el carácter con el que pintar la pirámide: ");
    char c = System.console().readLine().charAt(0);
    
    int linea = 1;
    int espaciosIzquierda = altura - 1;
    String imprimeLinea;
    String espacios = " ";
    String caracteres = c + " ";
    
    while (linea <= altura) {
      // Imprime con espacios hasta que alcanza el valor de %1s%s
      if (espaciosIzquierda >= 1) {
	imprimeLinea = String.format("%%%ds%%s\n", espaciosIzquierda);
	System.out.printf(imprimeLinea, espacios, caracteres);
      } else {
	System.out.printf("%s\n", caracteres);
      }
      
      linea++;
      espaciosIzquierda--;
      caracteres += c + " ";
    }
  }
}

