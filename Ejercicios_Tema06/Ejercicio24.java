public class Ejercicio24 {
  
  public static void main (String[] args) {
    System.out.println("Introduce un número entero positivo: ");
    long numero = Integer.parseInt(System.console().readLine());
    
    long aux = numero;
    int longitud = 0;
    int aleatorio;
    // Calcula la longitud del número
    while (aux > 0) {
      aux /= 10;
      longitud++;
    }
    
    aleatorio = (int)(Math.random() * longitud) + 1;
    // Escoge un dígito al azar del número introducido
    while (aleatorio > 0) {
      aux = numero % 10;
      numero /= 10;
      aleatorio--;
    }
    System.out.println(aux);
  } 
}

