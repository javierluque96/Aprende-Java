import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * @author Javier Luque Rodríguez
 * 
 * Modifica el programa Gestisimal realizado anteriormente añadiendo las siguientes mejoras:
 * • Utiliza una lista en lugar de un array para el almacenamiento de los datos.
 * • Comprueba la existencia del código en el alta, la baja y la modificación de 
 *   artículos para evitar errores.
 * • Cambia la opción “Salida de stock” por “Venta”. Esta nueva opción permitirá hacer una venta 
 *   de varios artículos y emitir la factura correspondiente. Se debe preguntar por los códigos y 
 *   las cantidades de cada artículo que se quiere comprar. Aplica un 21% de IVA.
 */
public class Gestisimal {
	
  public static void main (String[] args) {
    ArrayList<Mercancia> a = new ArrayList<Mercancia>();
    HashMap<String, Integer> h = new HashMap<String, Integer>();
    int opcion;
    int opcionFactura;
    int cantidad;
    int cantidadFactura;
    String codigo;
    String descripcion;
    double precioCompra;
    double precioVenta;
    int stock;
    int i;
    double total = 0;
    String pCompraString;
    String pVentaString;
    String stockString;
    
    
    
    do {
      System.out.println("          GESTISIMAL");
      System.out.println("==============================");
      System.out.println("  1. Listado");
      System.out.println("  2. Alta");
      System.out.println("  3. Baja");
      System.out.println("  4. Modificación");
      System.out.println("  5. Entrada de mercancía");
      System.out.println("  6. Venta");
      System.out.println("  7. Salir");
      System.out.print("Introduce una opción: ");
      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion) {
	case 1:
	  for (Mercancia m : a) {
	    System.out.println(m);
	  }
	  break;
	  
	case 2:
	  System.out.println("Introduce los datos de la mercancía.");
	    do {
	      System.out.print("Código: ");
	      codigo = System.console().readLine();
	      
	      if (a.contains(new Mercancia(codigo))) {
		System.out.print("Ese código ya está en uso. Introduce otro. ");
	      }
	    } while (a.contains(new Mercancia(codigo)));
	    
	    System.out.print("Descripción: ");
	    descripcion = System.console().readLine();
	    System.out.print("Precio de Compra: ");
	    precioCompra = Double.parseDouble(System.console().readLine());
	    
	    System.out.print("Precio de Venta: ");
	    precioVenta = Double.parseDouble(System.console().readLine());
	    
	    System.out.print("Stock: ");
	    stock = Integer.parseInt(System.console().readLine());
	    
	    a.add(new Mercancia(codigo, descripcion, precioCompra, precioVenta, stock));
	    
	  break;
	  
	case 3:
	  do {
	    System.out.print("Introduce el código de la mercancía que quieres dar de baja: ");
	    codigo = System.console().readLine();
	    
	    if (!a.contains(new Mercancia(codigo))) {
	      System.out.print("Lo siento, ese código no está dado de alta. ");
	    }
	  } while (!a.contains(new Mercancia(codigo)));
	  
	  a.remove(a.indexOf(new Mercancia(codigo)));
	  
	  System.out.println("Mercancía dada de baja.");
	  break;
	  
	case 4:
	  do {
	    System.out.print("Introduce el código de la mercancía que quieres modificar: ");
	    codigo = System.console().readLine();
	    
	    if (!a.contains(new Mercancia(codigo))) {
	      System.out.print("Lo siento, ese código no está dado de alta. ");
	    }
	  } while (!a.contains(new Mercancia(codigo)));
	  
	  i = a.indexOf(new Mercancia(codigo));
	  
	  do {
	    System.out.println("Código: " + a.get(i).getCodigo());
	    System.out.print("Nuevo código: ");
	    codigo = System.console().readLine();
	    
	    if (a.contains(new Mercancia(codigo))) {
	      System.out.print("Ese código ya está en uso. Introduce otro. ");
	    }
	  } while (a.contains(new Mercancia(codigo)));
	  
	  if (!codigo.equals("")) {
	    (a.get(i)).setCodigo(codigo);
	  }
	  
	  System.out.println("Descripción: " + (a.get(i)).getDescripcion());
	  System.out.print("Nueva descripción: ");
	  descripcion = System.console().readLine();
	  
	  if (!descripcion.equals("")) {
	    (a.get(i)).setDescripcion(descripcion);
	  }
	  
	  System.out.println("Precio de Compra: " + a.get(i).getPrecioCompra());
	  System.out.print("Nuevo precio de compra: ");
	  pCompraString = System.console().readLine();
	  
	  if (!pCompraString.equals("")) {
	    (a.get(i)).setPrecioCompra(Double.parseDouble(pCompraString));
	  }
	  
	  System.out.println("Precio de Venta: " + a.get(i).getPrecioVenta());
	  System.out.print("Nuevo precio de venta: ");
	  pVentaString = System.console().readLine();
	  
	  if (!pVentaString.equals("")) {
	    (a.get(i)).setPrecioVenta(Double.parseDouble(pVentaString));
	  }
	  
	  System.out.println("Stock: " + a.get(i).getStock());
	  System.out.print("Nuevo stock: ");
	  stockString = System.console().readLine();
	  
	  if (!stockString.equals("")) {
	    (a.get(i)).setStock(Integer.parseInt(stockString));
	  }
	  break;
	  
	case 5:
	  do {
	    System.out.print("Introduce el código de la mercancía: ");
	    codigo = System.console().readLine();
	    
	    if (!a.contains(new Mercancia(codigo))) {
	      System.out.print("Lo siento, ese código no está dado de alta. ");
	    }
	  } while (!a.contains(new Mercancia(codigo)));
	  
	  i = a.indexOf(new Mercancia(codigo));
	  
	  System.out.print("Introduce la cantidad que ha entrado de esa mercancía: ");
	  cantidad = Integer.parseInt(System.console().readLine());
	  
	  (a.get(i)).setStock((a.get(i)).getStock() + cantidad);
	  break;
	case 6:
	  do {
	    System.out.println("\n1. Añadir artículo a la factura");
	    System.out.println("2. Generar factura");
	    System.out.println("3. Cancelar");
	    System.out.print("Introduzca una opción: ");
	    opcionFactura = Integer.parseInt(System.console().readLine());
/* • Cambia la opción “Salida de stock” por “Venta”. Esta nueva opción permitirá hacer una venta 
 *   de varios artículos y emitir la factura correspondiente. Se debe preguntar por los códigos y 
 *   las cantidades de cada artículo que se quiere comprar. Aplica un 21% de IVA. */
	    switch(opcionFactura) {
	      case 1:
		do {
		  System.out.print("Introduce el código de la mercancía: ");
		  codigo = System.console().readLine();
		  
		  if (!a.contains(new Mercancia(codigo))) {
		    System.out.print("Lo siento, ese código no existe. ");
		  }
		} while (!a.contains(new Mercancia(codigo)));
		
		if (h.containsKey(codigo)) {
		  cantidadFactura = h.get(codigo);
		} else {
		  cantidadFactura = 0;
		}
		
		i = a.indexOf(new Mercancia(codigo));
		
		System.out.println("Stock del producto: " + a.get(i).getStock());
		System.out.println("Unidades almacenadas para la factura: " + cantidadFactura);
		System.out.print("Introduce la cantidad que quieres vender de ese producto: ");
		cantidad = Integer.parseInt(System.console().readLine());
		
		if ((a.get(i)).getStock() - cantidad >= 0) {
		  (a.get(i)).setStock((a.get(i)).getStock() - cantidad);
		  h.put(codigo, cantidad);
		  System.out.println("La mercancía está saliendo del almacen.");
		} else {
		  System.out.print("Lo siento, no tenemos tanta cantidad de esa mercancía. ");
		}
		break;
		
	      case 2:
		System.out.println("\n\n-------------------------------------------------------"
		  + "----------------------");
		System.out.println("|    CÓDIGO    |  DESCRIPCIÓN  |   UNIDADES   |    PRECIO"
		  + "    |   SUBTOTAL   |\n-------------------------------------------------------"
		  + "----------------------");
		for (Map.Entry articulo : h.entrySet()) {
		  codigo = articulo.getKey().toString();
		  i = a.indexOf(new Mercancia(codigo));
		  cantidad = Integer.parseInt(articulo.getValue().toString());
		  precioVenta = a.get(i).getPrecioVenta();
		  total += cantidad * precioVenta;
		  
		  System.out.printf("|   %7s    | %12s  |   %8d   |   %8.2f   |%11.2f   |\n", 
		    codigo, a.get(i).getDescripcion(), cantidad, precioVenta, 
		    precioVenta * cantidad);
		  
		}
		
		System.out.println("-------------------------------------------------------"
		  + "----------------------");
		System.out.printf("|    TOTAL: %61.2f   |\n", total);
		System.out.println("-------------------------------------------------------"
		  + "----------------------");
		break;
	      default:
	    }
	      
	  } while (opcionFactura == 1);
	  
	  break;
	default:
      }
      
      System.out.println("\n");
    } while (opcion != 7);
  }
}

