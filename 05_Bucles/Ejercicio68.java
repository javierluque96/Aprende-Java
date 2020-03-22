public class Ejercicio68 {
  
  public static void main (String[] args) {
    System.out.println("Este programa disloca un número.");
    
    System.out.print("Introduzca un número: ");
    long num = Long.parseLong(System.console().readLine());
    
    long disloque = num;
    long inverso = 0;
    
    // Da la vuelta al número
    while(disloque > 0) {
      inverso = (inverso * 10) + (disloque % 10);
      
      disloque /= 10;
    }
    
    // Disloca el número
    disloque = 0;
    while(inverso > 0) {
      if (inverso % 2 == 0) {
	disloque = (disloque * 10) + (inverso % 10) + 1;
      } else {
	disloque = (disloque * 10) + (inverso % 10) - 1;
      }
      inverso /= 10;
    }
    
    System.out.println("Dislocando el " + num + " sale el " + disloque);
  } 
}

