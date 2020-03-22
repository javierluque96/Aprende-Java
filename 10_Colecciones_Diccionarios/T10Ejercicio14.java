import java.util.HashMap;
import java.util.ArrayList;
/**
 * @author Javier Luque Rodríguez
 * 
 * Un supermercado de productos ecológicos nos ha pedido hacer un programa para vender su mercancía. 
 * En esta primera versión del programa se tendrán en cuenta los productos que se indican en la 
 * tabla junto con su precio. Los productos se venden en bote, brick, etc. Cuando se realiza la 
 * compra, hay que indicar el producto y el número de unidades que se compran, por ejemplo
 * “guisantes” si se quiere comprar un bote de guisantes y la cantidad, por ejemplo “3” si se 
 * quieren comprar 3 botes. La compra se termina con la palabra "fin". Suponemos que el usuario no 
 * va a intentar comprar un producto que no existe. Utiliza un diccionario para almacenar los 
 * nombres y precios de los productos y una o varias listas para almacenar la compra que realiza el 
 * usuario. Productos: 
 * 	avena 2.21 
 * 	garbanzos 2.39
 * 	tomate 1.59
 * 	jengibre 3.13
 * 	quinoa 4.50
 * 	guisantes 1.60
 * 
 * Producto Precio Cantidad Subtotal
 * ---------------------------------
 * TOTAL: 15,98
 */
public class T10Ejercicio14 {
  
  public static void main (String[] args){
    HashMap<String, Double> h = new HashMap<String, Double>();
    ArrayList<String> p = new ArrayList<String>();
    ArrayList<Integer> c = new ArrayList<Integer>();
    String palabra;
    double total = 0;
    
    h.put("avena", 2.21);
    h.put("garbanzos", 2.39);
    h.put("tomate", 1.59);
    h.put("jengibre", 3.13);
    h.put("quinoa", 4.50);
    h.put("guisantes", 1.60);
    
    do {
      System.out.print("Producto: ");
      palabra = System.console().readLine();
      if (h.containsKey(palabra)) {
	p.add(palabra);
      
	System.out.print("Cantidad: ");
	c.add(Integer.parseInt(System.console().readLine()));
      } 
      
    } while (!palabra.equalsIgnoreCase("fin"));
    
    System.out.println("\nProducto Precio Cantidad Subtotal\n---------------------------------");
    for (int i = 0; i < p.size(); i++) {
      System.out.printf("%-9s %4.2f %8d %8.2f\n", p.get(i), h.get(p.get(i)), c.get(i), 
	h.get(p.get(i)) * c.get(i));
      total += h.get(p.get(i)) * c.get(i);
    }
    System.out.printf("---------------------------------\nTOTAL: %7.2f", total);
  }
  
}
