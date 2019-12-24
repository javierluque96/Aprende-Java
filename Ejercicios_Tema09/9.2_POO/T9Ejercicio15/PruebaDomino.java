/**
 * PruebaDomino.java
 * @author Javier Luque Rodríguez
 * 
 * Ejercicio 16.
 * Utiliza la clase anterior para generar una secuencia de 8 fichas creadas de forma aleatoria, que 
 * encajen bien y que estén bien colocadas según el juego del dominó. No hay que controlar si se 
 * repiten o no las fichas. 
 */


public class PruebaDomino {
	
  public static void main (String[] args) {
    int contador = 0;
    FichaDomino f1 = new FichaDomino();
    
    do {
      FichaDomino f2 = new FichaDomino();
      
      if (f1.encajaLinea(f2)) {
	System.out.print(f1);
	f1 = f2;
	contador ++;
      }
    } while (contador < 8);
  }
}

