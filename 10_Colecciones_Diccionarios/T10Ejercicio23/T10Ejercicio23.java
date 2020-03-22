import java.util.ArrayList;
/**
 * @author Javier Luque Rodríguez
 * 
 * En ajedrez, el valor de las piezas se mide en peones. Una dama vale 9 peones,
 * una torre 5 peones, un alfil 3, un caballo 2 y un péon vale, lógicamente,
 * 1 peón. Realiza un programa que genere al azar las capturas que ha hecho
 * un jugador durante una partida. El número de capturas será un valor aleatorio
 * entre 0 y 15. Hay que tener en cuenta que cada jugador tiene la posibilidad de
 * capturar algunas de las siguientes piezas (no más): 1 dama, 2 torres, 2 alfiles,
 * 2 caballos y 8 peones. Al final debe aparecer la puntuación total.
 */
public class T10Ejercicio23 {
  
  public static void main (String[] args){
    ArrayList<Figura> f = new ArrayList<Figura>();
    Figura aux;
    int capturas = (int)(Math.random() * 16);
    int c = 0;
    int puntos = 0;
    
    f.add(new Figura("Dama", 9, 1));
    f.add(new Figura("Torre", 5, 2));
    f.add(new Figura("Alfil", 3, 2));
    f.add(new Figura("Caballo", 2, 2));
    f.add(new Figura("Peón", 1, 8));
    
    System.out.println("Fichas capturadas por el jugador:");
    
    do {
      aux = f.get((int)(Math.random() * f.size()));
      
      if (aux.esCapturable()) {
	aux.capturado();
	System.out.println(aux);
	c++;
	puntos += aux.getValor();
      }
    } while (c < capturas);
    
    System.out.println("Puntos totales " + puntos + " peones.");
  }
  
}
