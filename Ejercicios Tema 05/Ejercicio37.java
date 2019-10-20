public class Ejercicio37 {
	
  public static void main (String[] args) {
    
    int num;
    int inverso = 0;
    int i = 0;
    int contador = 0;
    
    System.out.println("Conversor del sistema decimal al sistema palotes: ");    
    
    System.out.println("Introduce un numero entero positivo: ");
    num = Integer.parseInt(System.console().readLine());
    
    // Damos la vuelta al numero para imprimir los palotes desde la izq
    while(num > 0){
      inverso = (inverso * 10) + (num % 10);
      num /= 10;
      contador++;
    }
    
    // Pinta el numero en sistema palotes
    while(inverso > 0){
      for(i = 0; i < inverso % 10; i++){
	System.out.print("|");
      }
      
      if(contador > 1){
      System.out.print("-");
      }
      
      contador--;
      inverso /= 10;
    } // While
  }
}

