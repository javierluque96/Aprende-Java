public class Ejercicio10 {
	
  public static void main (String[] args) {
    int i = 0; 
    int input;
    float media = 0f;
    boolean fueraBucle = true;
    
    System.out.println("Este programa calcula la media. Ponga un numero "
      +"negativo cuando haya terminado de introducir los numeros.");    
    
    while(fueraBucle){
      System.out.println("Introduce los numeros:");
      input = Integer.parseInt(System.console().readLine());
      
      if(input >= 0){
	media += input;
	i++;
      
      } else {
	fueraBucle = false;
	
      }
    }
    media = media / i;
    
    System.out.println("Media = " + media);
  }
}

