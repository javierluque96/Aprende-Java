public class Ejercicio35 {
	
  public static void main (String[] args) {
    
    int alturaIntroducida;
    int altura = 1;
    int espaciosDentro;
    int espaciosAntes;
    int i = 0;
    boolean condicion = true;
    
    System.out.println("Este programa imprime una X hecha con asteriscos.");
    
    do{
      System.out.println("Introduce un numero impar mayor o igual a 3: ");   
      alturaIntroducida = Integer.parseInt(System.console().readLine());
      
      if(alturaIntroducida < 3 || alturaIntroducida % 2 == 0){
	System.out.println("Numero erroneo.");
	condicion = false;	
      }
    } while(condicion == false);
    
    espaciosDentro = alturaIntroducida - 2;
    
    // Pinta la parte de arriba de la x
    while(altura < alturaIntroducida / 2 + 1){
      //Pinta los espacios de la izquierda de la x
      for(i = 1; i < altura; i++){
	System.out.print(" ");
      }
      System.out.print("*");
      
      // Pinta espacios en medio
      for(i = 1; i <= espaciosDentro; i++){
	System.out.print(" ");
	
      }
      
      System.out.print("*");
      System.out.println();
      
      altura++;
      espaciosDentro -=2;
    } // while
    
    // Pinta el la parte de abajo de la x
    espaciosDentro = 1;
    altura = 1;
    espaciosAntes = alturaIntroducida / 2 + 1;
    
    while(altura <= alturaIntroducida / 2 + 1){
      // Pinta los espacios anteriores
      for(i = 1; i < espaciosAntes; i++){
	System.out.print(" ");
      }
      
      System.out.print("*");
      
      for(i = 2; i < espaciosDentro; i++){
	System.out.print(" ");
	
      }
      
      if (altura > 1){
	System.out.print("*");
      }
      System.out.println();
      
      espaciosDentro += 2;
      espaciosAntes -= 1;
      altura++;
    } // while
    
  }
}

