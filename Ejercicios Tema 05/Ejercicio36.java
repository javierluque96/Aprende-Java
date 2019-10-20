public class Ejercicio36 {
	
  public static void main (String[] args) {
    
    long num;
    long aux;
    long inverso = 0;
    int i = 0;
    
    System.out.println("Este programa comprueba si el numero es capicua: ");    
    
    System.out.println("Introduce un numero entero positivo: ");
    num = Long.parseLong(System.console().readLine());
    
    aux = num; 
    
    while (aux > 0){
      inverso = (inverso * 10) + (aux % 10);
      aux /= 10;
    }
    
    if(num == inverso){
      System.out.println("El " + num + " es capicúa.");
      
    } else {
      System.out.println("El " + num + " no es capicúa.");
    }
  }
}

