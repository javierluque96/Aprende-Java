/**
 * @author Javier Luque Rodríguez
 */
public class Figura {
  
  private String nombre;
  private int valor;
  private int cantidad;
  
  public Figura(String n, int v, int c)  {
    this.nombre = n;
    this.valor = v;
    this.cantidad = c;
  }
  
  public String toString() {
    return nombre + " (" + valor + (valor == 1 ? " peón)" : " peones)");
  }
  
  public boolean esCapturable() {
    return this.cantidad > 0;
  }
  
  public void capturado() {
    this.cantidad--;
  }
  
  public int getValor() {
    return valor;
  }
}
