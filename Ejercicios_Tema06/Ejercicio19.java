public class Ejercicio19 {
  
  public static void main (String[] args) {
    System.out.println("Muestra 50 número aleatorios entre el -100 y el 200.");
    
    int aleatorio;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int suma = 0;
    
    for (int i = 0; i < 50; i++) {
      aleatorio = (int)(Math.random() * 401) - 100;
      
      if (aleatorio >= maximo && aleatorio % 2 == 0) {
	maximo = aleatorio;
      }
      if (aleatorio < minimo && aleatorio % 2 != 0) {
	minimo = aleatorio;
      }
      suma += aleatorio;
    }
    
    System.out.printf("Máximo = %d\nMínimo = %d\nMedia = %.2f", maximo, minimo, 
      (double)suma / 50);
  } 
}

