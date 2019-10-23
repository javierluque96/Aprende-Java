public class Ejercicio09 {
  
  public static void main (String[] args) {
    System.out.println("Este programa genera números pares entre el 0 y el 100."
      + " El bucle terminará cuando se genere el número 24.");
    
    int aleatoriosPares = 1;
    int contador = 0;
    
    while (aleatoriosPares != 24) {
      aleatoriosPares = (int)(Math.random() * 51) * 2;
      System.out.print(aleatoriosPares + " ");
      contador++;
    }
    System.out.print("\nSe han generado " + contador + " números pares.");
  } 
}

