import java.util.ArrayList;
/**
 * @author Javier Luque Rodríguez
 * 
 * Una empresa de venta por internet de productos electrónicos nos ha encargado
 * implementar un carrito de la compra. Crea la clase Carrito. Al carrito se le
 * pueden ir agregando elementos que se guardarán en una lista, por tanto,
 * deberás crear la clase Elemento. Cada elemento del carrito deberá contener el
 * nombre del producto, su precio y la cantidad (número de unidades de dicho
 * producto). A continuación se muestra tanto el contenido del programa principal
 * como la salida que debe mostrar el programa. Los métodos a implementar se
 * pueden deducir del main.
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
    c.add(e);
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
