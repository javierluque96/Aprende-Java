/**
 * PruebaCaballo.java
 * Ejercicio1.
 * @author Javier Luque Rodríguez
 */


public class PruebaCaballo {
	
  public static void main (String[] args) {
    Caballo r = new Caballo("Rocinante", "pura", "blanco", 10, 23);
    
    System.out.println(r.getNombre());
    
    r.rumia();
    
    r.trota();
  }
}

