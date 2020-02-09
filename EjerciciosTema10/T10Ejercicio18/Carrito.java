import java.util.ArrayList;
/**
 * @author Javier Luque Rodríguez
 * 
 * Mejora el programa anterior (en otro proyecto diferente) de tal forma que al 
 * intentar agregar un elemento al carrito, se compruebe si ya existe el producto
 * y, en tal caso, se incremente el número de unidades sin añadir un nuevo
 * elemento. Observa que en el programa anterior, se repetía el producto “Tarjeta
 * SD 64Gb” dos veces en el carrito. En esta nueva versión ya no sucede esto, si
 * no que se incrementa el número de unidades del producto que se agrega.
 */
public class Carrito {
  private ArrayList<Elemento> c = new ArrayList<Elemento>();
  
  public Carrito() {
    
  }
  
  public String toString() {
    String mensaje = "Contenido del Carrito\n=====================\n";
    
    for(Elemento x : c) {
      mensaje += x + "\n";
    }
    
    return mensaje;
  }
  
  public void agrega(Elemento e) {
    if (!c.contains(e)) {
      c.add(e);
    } else {
      int i = c.indexOf(e);
      
      c.get(i).setCantidad(c.get(i).getCantidad() + e.getCantidad());
    }
  }
  
  public int numeroDeElementos() {
    return c.size();
  }
  
  public double importeTotal() {
    double total = 0;
    
    for(Elemento e : c) {
      total += e.getPrecio() * e.getCantidad();
    }
    
    return total;
  }
}
