import java.util.Scanner;

public class Ejercicio45 {
	
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa inserta un digito en un número.");    
    
    System.out.println("Introduce un número entero positivo:");  
    long num = s.nextInt();
    
    System.out.println("Introduzca la posición donde quiere insertar: ");
    int posicion = s.nextInt();
    
    System.out.println("Introduzca el dígito que quiere insertar");  
    int digito = s.nextInt();   
    
    long inverso = 0;
    long parte1 = 0;
    long parte2 = 0;
    int extractor = 0;
    int longitud = 0;
    int auxPos = posicion;
    
    // Damos la vuelta al numero para leerlo de izquierda a derecha
    while(num > 0){
      inverso = (inverso * 10) + (num % 10);
      num /= 10;
      
      longitud++;
    }
    
    // Partimos el número en 2 e introducimos el numero a la parte1
    while(posicion > 1){
      parte1 = (parte1 * 10) + (inverso % 10);
      inverso /= 10;
      
      posicion--;
    }
    parte1 =  parte1 * 10 + digito;
    
    // Extraemos el numero de la posición donde queremos introducir el número
    while(inverso > 0){
      if(extractor == 0){
	inverso /= 10;
      } else{
	parte2 = (parte2 * 10) + (inverso % 10);
	inverso /= 10;
      }
      extractor++;
    }

    // CUnimos las dos partes.
    num = parte1 * (long)(Math.pow(10, longitud - auxPos)) + parte2;
    
    System.out.println("El numero resultante es " + num);
  }
}

