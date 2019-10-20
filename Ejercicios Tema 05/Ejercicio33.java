public class Ejercicio33 {
	
  public static void main (String[] args) {
    
    int altura = 1;
    int inputAltura;
    int i = 0;
    
    System.out.println("Este programa imprime pinta la letra U con asteriscos");    
    System.out.println("Introduce la altura de la U: ");
    inputAltura = Integer.parseInt(System.console().readLine());
    
    System.out.println();
    
    // Pinta los palos de la U
    while(altura < inputAltura){
      
      System.out.print("* ");
       
      for(i = 2; i < inputAltura; i++){
	System.out.print("  ");
      }
      
      System.out.print("*");
      System.out.println();
      
      altura++;
    }
    
    // Pinta la base de la U
    System.out.print("  ");
    for(i = 2; i < inputAltura; i++){
      System.out.print("* ");
    }
  }
}

