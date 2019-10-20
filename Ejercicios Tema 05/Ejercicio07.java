public class Ejercicio07 {
	
  public static void main (String[] args) {
    int i; // Contador
    int input;
    boolean key = false;
    
    for(i = 0; i < 4; i++){
      System.out.println("Introduce la combinación de la caja fuerte:");
      input = Integer.parseInt(System.console().readLine());
      
      if(input == 1996){
	key = true;
	break;
    
      } else{
	System.out.println("Combinación incorrecta.");
      }
    }
    if(key){
      System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
      
    } else {
      System.out.println("Lo siento, ha agotado los 4 intentos.");
    }
  }
}

