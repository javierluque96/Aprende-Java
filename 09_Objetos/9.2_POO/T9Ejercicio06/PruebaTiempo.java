/**
 * PruebaTiempo.java
 * 
 * @author  Javier Luque Rodríguez
 * 
 * Ejercicio 6.
 */

public class PruebaTiempo {
	
  public static void main (String[] args) {
    Tiempo t1 = new Tiempo(1, 30, 50);
    Tiempo t2 = new Tiempo(2, 30, 10);
    
    System.out.println("t1: " + t1);
    System.out.println("t2: " + t2);
    
    System.out.println("Los minutos de t1 son " + t1.getMinutos() + ".");
    
    System.out.println("La suma de t1 y t2 es " + t1.suma(t2));
    System.out.println("La resta de t1 y t2 es " + t2.resta(t1));
  }
  
}

