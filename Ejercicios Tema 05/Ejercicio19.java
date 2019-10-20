/* Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.
 */


public class Ejercicio19 {

  public static void main (String[] args) {
    int h;
    int base = 1;
    int linea = 1;
    int espacios;
    String caracter;
    
    System.out.println("Este programa pinta una piramide.");
    
    System.out.println("Introduce la altura de la piramide:");
    h = Integer.parseInt(System.console().readLine());
      
    System.out.println("Introduce el caracter con el que se pintara la "
      + "piramide:");
    caracter = System.console().readLine();
    
    System.out.println("Aqui tiene su piramide de altura " + h + ":\n" );
    
    espacios = h - 1;
    
    while(base <= h){
      
      // Inserta espacios
      for(int i = 0; i < espacios; i++){
	System.out.print(" ");
      }
      
      // Pinta los caracteres
      for(int i = 0; i < linea; i++){
	System.out.print(caracter);
      }
      
      System.out.println();
      
      base ++;
      linea += 2;
      espacios --;
    }  
    
    

  }
}

