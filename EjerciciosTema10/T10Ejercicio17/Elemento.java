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
public class Elemento {
  private String nombre;
  private double precio;
  private int cantidad;
  
  public Elemento(String nombre, double precio, int cantidad) {
    this.nombre = nombre;
    this.precio = precio;
    this.cantidad = cantidad;
  }
  
  public String toString() {
    return nombre + ": PVP: " + String.format("%.2f", precio) + " Unidades: " + cantidad 
      + " Subtotal: " + String.format("%.2f", precio * cantidad);
  }
  
  public String getNombre() {
    return nombre;
  }
  
  public double getPrecio() {
    return precio;
  }
  
  public void setNombre(String producto) {
    this.nombre = nombre;
  }
  
  public void setPrecio(double precio) {
    this.precio = precio;
  }
  
  public int getCantidad() {
    return cantidad;
  }
  
  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }
}
