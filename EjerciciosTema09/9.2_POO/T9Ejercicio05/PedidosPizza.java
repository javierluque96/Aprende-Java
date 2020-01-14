/**
 * Ejercicio 5 --> PedidosPizza.java
 * @author Javier Luque Rodríguez
 */
public class PedidosPizza {

  public static void main(String[] args) {
    
    Pizza p1 = new Pizza("cuatro quesos", "mediana");
    Pizza p2 = new Pizza("funghi", "mediana");
    Pizza p3 = new Pizza("margarita", "familiar");
    
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    
    p1.sirve();
    p2.sirve();
    p1.sirve();
    
    System.out.println("Servidas: " + Pizza.getServidas());
    System.out.println("Pedidas: " + Pizza.getPedidas());
  }
}
