/**
 * Ejercicio 5 --> Pizza.java
 * @author Javier Luque Rodríguez
 * 
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
 * se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
 * quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
 * información sobre el número total de pizzas que se han pedido y que se
 * han servido. Siempre que se crea una pizza nueva, su estado es “pedida”
 */
public class Pizza {
  
  // Atributos
  private static int pedidas = 0;
  private static int servidas = 0;
  
  private String tam;
  private String tipo;
  private String estado;
  
  // Constructor
  public Pizza(String ti, String ta) {
    this.tam = ta;
    this.tipo = ti;
    this.estado = "pedida";
    Pizza.pedidas++;
  }
  
  // Métodos
  public String toString() {
    return "Pizza " + this.tam + ", " + this.tipo + ", " + this.estado + ".";
  }
  
  public static int getPedidas() {
    return pedidas;
  }
  
  public static int getServidas() {
    return servidas;
  }
  
  public void sirve() {
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      Pizza.servidas++;
    } else {
      System.out.println("Esta pizza ya está servida.");
    }
    
  }
}
