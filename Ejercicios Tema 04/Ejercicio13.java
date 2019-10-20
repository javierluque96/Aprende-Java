public class Ejercicio13 {
  
  public static void main(String[] args) {
    
    System.out.println("Vamos a ordenar tres numeros enteros:");
    
    System.out.println("Introduce el primer numero:");
    int num1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el segundo numero:");
    int num2 = Integer.parseInt(System.console().readLine());
  
    System.out.println("Introduce el tercer numero:");
    int num3 = Integer.parseInt(System.console().readLine());
    
    if(num3 > num2 && num2 > num1){
      
      System.out.printf("\n%d > %d > %d", num3, num2, num1);
      
    } else if(num3 > num1 && num1 > num2){
      
      System.out.printf("\n%d > %d > %d", num3, num1, num2);
      
    } else if(num2 > num1 && num1 > num3){
      
      System.out.printf("\n%d > %d > %d", num2, num1, num3);
      
    } else if(num2 > num3 && num3 > num1){
     
      System.out.printf("\n%d > %d > %d", num2, num3, num1);
      
    } else if(num1 > num2 && num2 > num3){
      
      System.out.printf("\n%d > %d > %d", num1, num2, num3);
      
    } else {
      
      System.out.println("Opción no contemplada.");
      
    }
    
  }
}

