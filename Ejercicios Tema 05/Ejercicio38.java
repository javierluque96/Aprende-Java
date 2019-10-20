public class Ejercicio38 {
	
  public static void main (String[] args) {
    
    boolean condicion = true;
    int altura = 0;
    int alturaIntro;
    int espacios;
    int asteriscos;
    int i = 0;
    
    do{
      System.out.println("Introduce la altura del reloj de arena:");    
      alturaIntro = Integer.parseInt(System.console().readLine());
      
      if(alturaIntro < 3 || alturaIntro % 2 == 0){
	System.out.println("Debes introducir un número impar mayor o igual a "
	  + "3.");
	
	condicion = false;
      }
    } while(condicion == false);
    
    System.out.println();
    
    // Pinta la parte de arriba del reloj
    
    asteriscos = alturaIntro;
    
    while(altura < alturaIntro / 2 + 1){
      // Pinta los espacios de la izquierda del reloj
      for(i = 0; i < altura; i++){
	System.out.print(" ");
      }
      
      // Pinta los asteriscos
      for(i = 1; i <= asteriscos; i++){
	System.out.print("*");
      }
      
      System.out.println();
      
      asteriscos -= 2;
      altura++;
    } // While
    
    // Pinta la parte de abajo del reloj
    espacios = alturaIntro / 2 - 1;
    altura = 1;
    asteriscos = 3;
    while(altura < alturaIntro / 2 + 1){
      // Pinta los espacios de la parte izquierda del reloj
      for(i = 0; i < espacios ; i++){
	System.out.print(" ");
      }
      
      // Pinta asteriscos
      for(i = 1; i <= asteriscos; i++){
	System.out.print("*");
      }
      
      System.out.println();
      
      altura++;
      espacios--;
      asteriscos += 2;
    }
  }
}

