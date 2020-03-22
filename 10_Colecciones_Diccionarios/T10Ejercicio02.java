import java.util.ArrayList;
/**
 * @author Javier Luque Rodríguez
 * 
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList y que 
 * luego calcule la suma, la media, el máximo y el mínimo de esos números. El tamaño de la lista 
 * también será aleatorio y podrá oscilar entre 10 y 20 elementos ambos inclusive.
 */
public class T10Ejercicio02 {
  
  public static void main (String[] args){
    ArrayList <Integer> a = new ArrayList<>();
    int total = 0;
    int maximo = -1;
    int minimo = 101;
    int tamanio = (int)(Math.random() * 11 + 10);
    
    for (int i = 0; i < tamanio; i++) {
      a.add((int)(Math.random() * 101));
      
      if (a.get(i) > maximo) {
	maximo = a.get(i);
      }
      
      if (a.get(i) < minimo) {
	minimo = a.get(i);
      }
      
      total += a.get(i);
    }
    
    System.out.println("Suma: " + total);
    System.out.println("Tamaño: " + tamanio);
    System.out.println("Media: " + total / tamanio);
    System.out.println("Máximo: " + maximo);
    System.out.println("Mínimo: " + minimo);
    System.out.println(a);
    
  }
  
}
