/**
 * Gestisimal.java
 * Ejercicio 5.
 * @author Javier Luque Rodríguez
 */


public class Gestisimal {
	
  public static void main (String[] args) {
    
    int x = 5; //tamaño del array
    int opcion;
    int cantidad;
    int i;
    String codigo;
    boolean repetido;
    boolean existe;
    Mercancia[] a = new Mercancia[x];
    
    for (i = 0; i < x; i++) {
      a[i] = new Mercancia();
    }
    
    do {
      System.out.println("OPCIONES DE GESTISIMAL");
      System.out.println("======================");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salir");
      System.out.print("Introduce una opción: ");
      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion) {
	case 1:
	  for (i = 0; i < x; i++) {
	    if (!a[i].getCodigo().equals("LIBRE")) {
	      System.out.println(a[i]);
	    }
	  }
	  break;
	  
	case 2:
	  System.out.println("Introduce los datos de la mercancía.");
	    do {
	      System.out.print("Código: ");
	      codigo = System.console().readLine();
	      repetido  = false;
	      
	      // Comprueba que no se repita el código
	      for (i = 0; i < x; i++) {
		if (codigo.equals(a[i].getCodigo())) {
		  repetido = true;
		}
	      }
	      
	      if (repetido) {
		System.out.print("Código repetido. Introduce otro. ");
	      }
	    } while (repetido);
	    
	    i = 0;
	    do {
	      if (!a[i].getCodigo().equals("LIBRE")) {
		i++;
	      }
	    } while (!a[i].getCodigo().equals("LIBRE"));
	    
	    a[i].setCodigo(codigo);
	    
	    System.out.print("Descripción: ");
	    a[i].setDescripcion(System.console().readLine());
	    
	    System.out.print("Precio de Compra: ");
	    a[i].setPrecioCompra(Double.parseDouble(System.console().readLine()));
	    
	    System.out.print("Precio de Venta: ");
	    a[i].setPrecioVenta(Double.parseDouble(System.console().readLine()));
	    
	    System.out.print("Stock: ");
	    a[i].setStock(Integer.parseInt(System.console().readLine()));
	  break;
	  
	case 3:
	  do {
	    System.out.print("Introduce el código de la mercancía que quieres dar de baja: ");
	    codigo = System.console().readLine();
	    existe = false;
	    
	    for (i = 0; i < x; i++) {
	      if (codigo.equals(a[i].getCodigo())) {
		existe = true;
	      }
	    }
	    
	    if (!existe) {
	      System.out.print("Lo siento, ese código no está dado de alta. ");
	    }
	  } while (!existe);
	  
	  i = 0;
	  do {
	    if (!codigo.equals(a[i].getCodigo())) {
	      i++;
	    }
	  } while (!codigo.equals(a[i].getCodigo()));
	  
	  a[i] = new Mercancia();
	  
	  System.out.println("Mercancía dada de baja.");
	  break;
	  
	case 4:
	  do {
	    System.out.print("Introduce el código de la mercancía que quieres modificar: ");
	    codigo = System.console().readLine();
	    existe = false;
	    
	    for (i = 0; i < x; i++) {
	      if (codigo.equals(a[i].getCodigo())) {
		existe = true;
	      }
	    }
	    
	    if (!existe) {
	      System.out.print("Lo siento, ese código no está dado de alta. ");
	    }
	  } while (!existe);
	  
	  i = 0;
	  do {
	    if (!codigo.equals(a[i].getCodigo())) {
	      i++;
	    }
	  } while (!codigo.equals(a[i].getCodigo()));
	  
	  do {
	    System.out.print("Código: ");
	    codigo = System.console().readLine();
	    repetido  = false;
	    
	    // Comprueba que no se repita el código
	    for (i = 0; i < x; i++) {
	      if (codigo.equals(a[i].getCodigo())) {
		repetido = true;
	      }
	    }
	    
	    if (repetido) {
	      System.out.print("Código repetido. Introduce otro. ");
	    }
	  } while (repetido);
	  
	  i = 0;
	  do {
	    if (!a[i].getCodigo().equals("LIBRE")) {
	      i++;
	    }
	  } while (!a[i].getCodigo().equals("LIBRE"));
	  
	  a[i].setCodigo(codigo);
	    
	  System.out.print("Descripción: ");
	  a[i].setDescripcion(System.console().readLine());
	  
	  System.out.print("Precio de Compra: ");
	  a[i].setPrecioCompra(Double.parseDouble(System.console().readLine()));
	  
	  System.out.print("Precio de Venta: ");
	  a[i].setPrecioVenta(Double.parseDouble(System.console().readLine()));
	  
	  System.out.print("Stock: ");
	  a[i].setStock(Integer.parseInt(System.console().readLine()));
	  break;
	  
	case 5:
	  do {
	    System.out.print("Introduce el código de la mercancía: ");
	    codigo = System.console().readLine();
	    existe = false;
	    
	    for (i = 0; i < x; i++) {
	      if (codigo.equals(a[i].getCodigo())) {
		existe = true;
	      }
	    }
	    
	    if (!existe) {
	      System.out.print("Lo siento, ese código no está dado de alta. ");
	    }
	  } while (!existe);
	  
	  i = 0;
	  do {
	    if (!codigo.equals(a[i].getCodigo())) {
	      i++;
	    }
	  } while (!codigo.equals(a[i].getCodigo()));
	  
	  System.out.print("Introduce la cantidad que ha entrado de esa mercancía: ");
	  cantidad = Integer.parseInt(System.console().readLine());
	  
	  a[i].setStock(a[i].getStock() + cantidad);
	  break;
	case 6:
	  do {
	    System.out.print("Introduce el código de la mercancía: ");
	    codigo = System.console().readLine();
	    existe = false;
	    
	    for (i = 0; i < x; i++) {
	      if (codigo.equals(a[i].getCodigo())) {
		existe = true;
	      }
	    }
	    
	    if (!existe) {
	      System.out.print("Lo siento, ese código no está dado de alta. ");
	    }
	  } while (!existe);
	  
	  i = 0;
	  do {
	    if (!codigo.equals(a[i].getCodigo())) {
	      i++;
	    }
	  } while (!codigo.equals(a[i].getCodigo()));
	  
	  System.out.print("Introduce la cantidad que ha salido de ese producto: ");
	  cantidad = Integer.parseInt(System.console().readLine());
	  
	  if (a[i].getStock() - cantidad >= 0) {
	    a[i].setStock(a[i].getStock() - cantidad);
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

