public class EjercicioSorpresaBucles1 {
	
  public static void main (String[] args) {
    
    int altura = 0;
    int alturaIntro;
    int incrementoAltura;
    int espacios;
    int caracteres;
    int i = 0;
    int repetir;
    String s;
    boolean condicion;
    
    // Pregunta altura inical
    do{
      condicion = true;
      
      System.out.print("Introduzca la altura del reloj de arena inicial: ");    
      alturaIntro = Integer.parseInt(System.console().readLine());
      
      if(alturaIntro < 3 || alturaIntro % 2 == 0){
	System.out.println("Debes introducir un número impar mayor o igual a "
	  + "3.");
	
	condicion = false;
      }
    } while(condicion == false);
    
    // Pide el caracter a pintar
    System.out.print("Introduzca el carácter para dibujar: ");
    s = System.console().readLine();
    
    // Pide el incremento de la altura
    do{
      condicion = true;
      
      System.out.print("Introduzca el incremento de la altura: ");    
      incrementoAltura = Integer.parseInt(System.console().readLine());
      
      if(incrementoAltura % 2 != 0){
	System.out.println("Debes introducir un número par.");
	
	condicion = false;
      }
    } while(condicion == false);
    
    // Pide el numero de veces que se repetirá el reloj de arena
    System.out.print("Introduzca el número de veces que desea dibujar el "
      + "reloj: ");
    repetir = Integer.parseInt(System.console().readLine());
    
    // Pinta los relojes de arenas
    
    while (repetir > 0) {
      
      System.out.println();
      
      // Pinta la parte de arriba del reloj
      
      altura = 0;
      caracteres = alturaIntro;
      
      while(altura < alturaIntro / 2 + 1){
	// Pinta los espacios de la izquierda del reloj
	for(i = 0; i < altura; i++){
	  System.out.print(" ");
	}
	
	// Pinta los asteriscos
	for(i = 1; i <= caracteres; i++){
	  System.out.print(s);
	}
	
	System.out.println();
	
	caracteres -= 2;
	altura++;
      } // While
      
      // Pinta la parte de abajo del reloj
      espacios = alturaIntro / 2 - 1;
      altura = 1;
      caracteres = 3;
      while(altura < alturaIntro / 2 + 1){
	// Pinta los espacios de la parte izquierda del reloj
	for(i = 0; i < espacios ; i++){
	  System.out.print(" ");
	}
	
	// Pinta asteriscos
	for(i = 1; i <= caracteres; i++){
	  System.out.print(s);
	}
	
	System.out.println();
	
	altura++;
	espacios--;
	caracteres += 2;
      } // while
      
      alturaIntro += incrementoAltura;
      repetir--;
    } // While Repetir  
  }
}

