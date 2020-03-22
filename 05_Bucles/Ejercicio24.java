public class Ejercicio24 {
  public static void main (String[] args) {
    
    
    System.out.println("Este programa crea una piramide de numeros");
    System.out.println("Introduce el numero de filas que desea:");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    int altura = 0;
    int espacios = alturaIntroducida - 1;
    int i = 0;
    
    while(altura < alturaIntroducida){
      
      // Inserta los espacios iniciales
      for(i = 0; i < espacios; i++){
	System.out.print(" ");
      }
      
      // Inserta los numeros de la parte izquierda a centro
      for(i = 1; i <= (altura + 1); i++){
	System.out.print(i);
      }      
      
      // Inserta numeros de la parte derecha
      for(i = altura; i > 0; i--){
	System.out.print(i);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
    } //while
  }
}

