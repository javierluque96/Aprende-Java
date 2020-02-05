import java.util.ArrayList;
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
    int opcion;
    int cantidad;
    String codigo;
    String descripcion;
    double precioCompra;
    double precioVenta;
    int stock;
    int i;
    String pCompraString;
    String pVentaString;
    String stockString;
    
    
    
    do {
      System.out.println("OPCIONES DE GESTISIMAL");
      System.out.println("======================");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Venta");
      System.out.println("7. Salir");
      System.out.print("Introduce una opción: ");
      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion) {
	case 1:
	  for (Mercancia m : a) {
	    System.out.print(m);
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
	  
	  a.remove(a.indexOf(codigo));
	  
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
	  
	  do {
	    System.out.print("Código: ");
	    codigo = System.console().readLine();
	    
	    if (a.contains(new Mercancia(codigo))) {
	      System.out.print("Ese código ya está en uso. Introduce otro. ");
	    }
	  } while (a.contains(new Mercancia(codigo)));
	  
	  i = a.indexOf(new Mercancia(codigo));
	  
	  if (!codigo.equals("")) {
	    (a.get(i)).setCodigo(codigo);
	  }
	  
	  
	  System.out.print("Descripción: ");
	  descripcion = System.console().readLine();
	  
	  if (!descripcion.equals("")) {
	    (a.get(i)).setDescripcion(descripcion);
	  }
	  
	  System.out.print("Precio de Compra: ");
	  pCompraString = System.console().readLine();
	  
	  if (!pCompraString.equals("")) {
	    (a.get(i)).setPrecioCompra(Double.parseDouble(pCompraString));
	  }
	  
	  System.out.print("Precio de Venta: ");
	  pVentaString = System.console().readLine();
	  
	  if (!pVentaString.equals("")) {
	    (a.get(i)).setPrecioVenta(Double.parseDouble(pVentaString));
	  }
	  
	  System.out.print("Stock: ");
	  stockString = System.console().readLine();
	  
	  if (!stockString.equals("")) {
	    (a.get(i)).setStock(Integer.parseInt(stockString));
	  }
	  break;
	  
	case 5:
	  do {
	    System.out.print("Introduce el código de la mercancía: ");
	    codigo = System.console().readLine();
	    
	    if (!a.contains(codigo)) {
	      System.out.print("Lo siento, ese código no está dado de alta. ");
	    }
	  } while (!a.contains(new Mercancia(codigo)));
	  
	  i = a.indexOf(new Mercancia(codigo));
	  
	  System.out.print("Introduce la cantidad que ha entrado de esa mercancía: ");
	  cantidad = Integer.parseInt(System.console().readLine());
	  
	  (a.get(i)).setStock((a.get(i)).getStock() + cantidad);
	  break;
	case 6:
	
/* • Cambia la opción “Salida de stock” por “Venta”. Esta nueva opción permitirá hacer una venta 
 *   de varios artículos y emitir la factura correspondiente. Se debe preguntar por los códigos y 
 *   las cantidades de cada artículo que se quiere comprar. Aplica un 21% de IVA. */
	  do {
	    System.out.print("Introduce el código de la mercancía: ");
	    codigo = System.console().readLine();
	    
	    if (!a.contains(new Mercancia(codigo))) {
	      System.out.print("Lo siento, ese código no está dado de alta. ");
	    }
	  } while (!a.contains(new Mercancia(codigo)));
	  
	  System.out.print("Introduce la cantidad que quieres vender de ese producto: ");
	  cantidad = Integer.parseInt(System.console().readLine());
	  
	  i = a.indexOf(new Mercancia(codigo));
	  
	  if ((a.get(i)).getStock() - cantidad >= 0) {
	    (a.get(i)).setStock((a.get(i)).getStock() - cantidad);
	    System.out.println("La mercancía está saliendo del almacen.");
	  } else {
	    System.out.print("Lo siento, no tenemos tanta cantidad de esa mercancía. ");
	  }
	  break;
	default:
      }
      
      System.out.println("\n");
    } while (opcion != 7);
  }
}

