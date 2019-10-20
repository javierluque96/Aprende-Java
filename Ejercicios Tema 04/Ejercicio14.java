public class Ejercicio14{

  public static void main(String args[]){
    
    System.out.println("Este programa compruba si el numero introducido es par " 
      + "y/o divisible por 5");
      
    System.out.println("Introduce un numero entero: ");
    int n = Integer.parseInt(System.console().readLine());
    
    if(n % 5 == 0 && n % 2 == 0){
    
      System.out.printf("El numero %d es par y divisible por 5.", n);
      
    } else if(n % 5 == 0){
      
      System.out.printf("El numero %d es divisible por 5", n);
    
    } else if(n % 2 == 0){
      
      System.out.printf("El numero %d es par", n);
    
    } else {
     
      System.out.printf("El numero %d no es par ni divisible por 5", n);
      
    }
    
  }
}
