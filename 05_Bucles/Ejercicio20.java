/* Realiza un programa que pinte una pirámide hueca por pantalla. */

public class Ejercicio20 {

  public static void main (String[] args) {
    int h;
    int base = 1;
    int linea = 1;
    int lineaBase = 1;
    int espacios;
    int huecos = 0;
    String caracter;
    
    System.out.println("Este programa pinta una piramide.");
    
    System.out.println("Introduce la altura de la piramide:");
    h = Integer.parseInt(System.console().readLine());
      
    System.out.println("Introduce el caracter con el que se pintara la "
      + "piramide:");
    caracter = System.console().readLine();
    
    System.out.println("Aqui tiene su piramide hueca de altura " + h + ":\n" );
    
    espacios = h - 1;
    
    while(base < h){
      
      // Inserta espacios
      for(int i = 0; i < espacios; i++){
	System.out.print(" ");
      }
      
      // Pinta los caracteres de la parte izquierda
      for(int i = 0; i < linea; i++){
	System.out.print(caracter);
      }
      
      // Inserta los huecos
      for(int i = 1; i < huecos; i++){
	System.out.print(" ");
      }
      
      // Pinta los caracteres de la parte derecha
      if(base > 1){
	for(int i = 0; i < linea; i++){
	  System.out.print(caracter);
	}
      }
      
      System.out.println();
      
      base ++;
      lineaBase += 2;
      huecos += 2;
      espacios --;
    }  
    
    for(int i = 0; i < lineaBase; i++){
	System.out.print(caracter);
      }

  }
}

