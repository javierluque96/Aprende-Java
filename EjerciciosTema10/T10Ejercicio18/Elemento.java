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
  
  @Override
  public boolean equals(Object o) {
    return nombre.equals(((Elemento)o).getNombre()) && precio == ((Elemento)o).getPrecio();
  }
}
