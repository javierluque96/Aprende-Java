import java.util.HashMap;
import java.util.ArrayList;
/**
 * @author Javier Luque Rodríguez
 * 
 * Realiza una nueva versión del ejercicio anterior con las siguientes mejoras: Si
 * algún producto se repite en diferentes líneas, se deben agrupar en una sola.
 * Por ejemplo, si se pide primero 1 bote de tomate y luego 3 botes de tomate, en
 * el extracto se debe mostrar que se han pedido 4 botes de tomate. Después de
 * teclear “fin”, el programa pide un código de descuento. Si el usuario introduce
 * el código “ECODTO”, se aplica un 10% de descuento en la compra.
 */
public class T10Ejercicio15 {
  
  public static void main (String[] args){
    HashMap<String, Double> h = new HashMap<String, Double>();
    ArrayList<String> p = new ArrayList<String>();
    ArrayList<Integer> c = new ArrayList<Integer>();
    String palabra;
    String codigo;
    int i;
    double total = 0;
    double descuento = 0;
    
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
	if (p.contains(palabra)) {
	  System.out.print("Cantidad: ");
	  i = p.indexOf(palabra);
	  c.set(i, c.get(i) + (Integer.parseInt(System.console().readLine())));
	} else {
	  p.add(palabra);
	  
	  System.out.print("Cantidad: ");
	  c.add(Integer.parseInt(System.console().readLine()));
	}
	
      
	
      } 
      
    } while (!palabra.equalsIgnoreCase("fin"));
    
    System.out.print("Introduce código de descuento (INTRO si no tiene ninguno): ");
    codigo = System.console().readLine();
    
    System.out.println("\nProducto Precio Cantidad Subtotal\n---------------------------------");
    for (i = 0; i < p.size(); i++) {
      System.out.printf("%-9s %4.2f %8d %8.2f\n", p.get(i), h.get(p.get(i)), c.get(i), 
	h.get(p.get(i)) * c.get(i));
      total += h.get(p.get(i)) * c.get(i);
    }
    
    if (codigo.equals("ECODTO")) {
      descuento = total * 0.1;
    }
    
    System.out.printf("---------------------------------\nDESCUENTO: %4.2f\n", descuento);
    System.out.printf("---------------------------------\nTOTAL: %7.2f", total - descuento);
  }
  
}
