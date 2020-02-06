import java.text.DecimalFormat;
/**
 * Mercancia.java
 * 
 * @author Javier Luque Rodríguez
 * 
 * De cada artículo se debe saber el código, la descripción, el precio de compra, el precio de 
 * venta y el stock (número de unidades).
 */
public class Mercancia {
	
  private String codigo;
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock;
  
  public Mercancia(String c) {
    this.codigo = c;
    this.descripcion = "";
    this.precioCompra = 0;
    this.precioVenta = 0;
    this.stock = 0;
  }
  
  public Mercancia(String c, String d, double pCompra, double pVenta, int s) {
    this.codigo = c;
    this.descripcion = d;
    this.precioCompra = pCompra;
    this.precioVenta = pVenta;
    this.stock = s;
  }
  
  public String toString() {
    DecimalFormat df = new DecimalFormat("0.00");
    return "------------------------------------------\nCódigo: " + codigo + "\nDescripción: " 
    + descripcion + "\nPrecio de compra: " + df.format(precioCompra) + "\nPrecio de venta: " 
    + df.format(precioVenta) + "\nStock: " + stock + "\n------------------------------------------";
  }
  
  public String getCodigo() {
    return codigo;
  }
  
  public String getDescripcion() {
    return descripcion;
  }
  
  public double getPrecioCompra() {
    return precioCompra;
  }
  
  public double getPrecioVenta() {
    return precioVenta;
  }
  
  public int getStock() {
    return stock;
  }
  
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  
  public void setPrecioCompra(double precioCompra) {
    this.precioCompra = precioCompra;
  }
  
  public void setPrecioVenta(double precioVenta) {
    this.precioVenta = precioVenta;
  }
  
  public void setStock(int stock) {
    this.stock = stock;
  }
  
  @Override
  public boolean equals(Object m) {
    return codigo.equals(((Mercancia)m).getCodigo());
  }
}

