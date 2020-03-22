/**
 * Coleccion.java
 * Ejercicio 4.
 * @author Javier Luque Rodríguez
 */


public class Coleccion {
	
  public static void main (String[] args) {
    int x = 100; // Determina tamaño del array de albumes
    int opcion;
    int opcionListado;
    String codigo;
    String autor; 
    String genero;
    int i;
    int[] duracion = new int[2];
    int discosLibres = 100;
    boolean repetido;
    boolean existe;
    Disco[] album = new Disco[x];
    
    for (i = 0; i < x; i++) {
      album[i] = new Disco();
    }
    
    do {
      System.out.println("\n\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion) {
	case 1:
	  System.out.println("\n\nOPCIONES DE LISTADO");
	  System.out.println("===================");
	  System.out.println("1. Completo");
	  System.out.println("2. Por autor");
	  System.out.println("3. Por género");
	  System.out.println("4. Por duración");
	  System.out.print("Introduzca una opción: ");
	  opcionListado = Integer.parseInt(System.console().readLine());
	  
	  switch (opcionListado) {
	    case 1:
	      for (i = 0; i < x; i++) {
		if (!album[i].getCodigo().equals("LIBRE")) {
		  System.out.println(album[i]);
		}
	      }
	      break;
	    case 2:
	      System.out.print("Introduce el autor del que quieres el listado: ");
	      autor = System.console().readLine();
	      
	      for (i = 0; i < x; i++) {
		if (!album[i].getCodigo().equals("LIBRE") && album[i].getAutor().equals(autor)) {
		  System.out.println(album[i]);
		}
	      }
	      break;
	    case 3:
	      System.out.print("Introduce el género del que quieres el listado: ");
	      genero = System.console().readLine();
	      
	      for (i = 0; i < x; i++) {
		if (!album[i].getCodigo().equals("LIBRE") && album[i].getGenero().equals(genero)) {
		  System.out.println(album[i]);
		}
	      }
	      break;
	    case 4:
	      do {
		System.out.print("Introduce la duración mínima del disco: ");
		duracion[0] = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce la duración máxima del disco: ");
		duracion[1] = Integer.parseInt(System.console().readLine());
		
		if (duracion[0] > duracion[1]) {
		  System.out.print("Datos erróneos.");
		}
	      } while(duracion[0] > duracion[1]);
	      
	      for (i = 0; i < x; i++) {
		if (!album[i].getCodigo().equals("LIBRE") && (album[i].getDuracion() >= duracion[0]
		&& album[i].getDuracion() <= duracion[1])) {
		  System.out.println(album[i]);
		}
	      }
	      break;
	    default:
	  }
	  break;
	case 2:
	  if (discosLibres > 0) {
	    System.out.println("Introduce los datos del disco.");
	    do {
	      System.out.print("Código: ");
	      codigo = System.console().readLine();
	      repetido  = false;
	      discosLibres = 0;
	      
	      // Cuenta el número de discosLibres que quedan y comprueba que no se repita el código
	      for (i = 0; i < x; i++) {
		if (codigo.equals(album[i].getCodigo())) {
		  repetido = true;
		}
		
		if (album[i].getCodigo().equals("LIBRE")) {
		  discosLibres++;
		}
	      }
	      
	      if (repetido) {
		System.out.print("Código repetido. Introduce otro. ");
	      }
	    } while (repetido);
	    
	    discosLibres--;
	    i = 0;
	    do {
	      if (!album[i].getCodigo().equals("LIBRE")) {
		i++;
	      }
	    } while (!album[i].getCodigo().equals("LIBRE"));
	    
	    album[i].setCodigo(codigo);
	    
	    System.out.print("Autor: ");
	    album[i].setAutor(System.console().readLine());
	    
	    System.out.print("Título: ");
	    album[i].setTitulo(System.console().readLine());
	    
	    System.out.print("Género: ");
	    album[i].setGenero(System.console().readLine());
	    
	    System.out.print("Duración: ");
	    album[i].setDuracion(Integer.parseInt(System.console().readLine()));
	  } else {
	    System.out.println("Lo siento, no quedan más discos libres. Modifica o borra alguno.");
	  }
	  break;
	case 3:
	  System.out.print("Introduce el código del disco que quieres cambiar: ");
	  codigo = System.console().readLine();
	  
	  i = 0;
	  do {
	    if (!codigo.equals(album[i].getCodigo())) {
	      i++;
	    }
	  } while (!codigo.equals(album[i].getCodigo()));
	  
	  System.out.print("Código: ");
	  album[i].setCodigo(System.console().readLine());
	  
	  System.out.print("Autor: ");
	  album[i].setAutor(System.console().readLine());
	  
	  System.out.print("Título: ");
	  album[i].setTitulo(System.console().readLine());
	  
	  System.out.print("Género: ");
	  album[i].setGenero(System.console().readLine());
	  
	  System.out.print("Duración: ");
	  album[i].setDuracion(Integer.parseInt(System.console().readLine()));
	  break;
	case 4:
	  do {
	    System.out.print("Introduce el código del disco que quieres borrar: ");
	    codigo = System.console().readLine();
	    existe = false;
	    
	    for (i = 0; i < x; i++) {
	      if (codigo.equals(album[i].getCodigo())) {
		existe = true;
	      }
	    }
	  } while (!existe);
	  
	  i = 0;
	  do {
	    if (!codigo.equals(album[i].getCodigo())) {
	      i++;
	    }
	  } while (!codigo.equals(album[i].getCodigo()));
	  
	  album[i] = new Disco();
	  
	  System.out.println("Disco borrado.");
	  break;
	default:
      }
    } while (opcion != 5);
    
  }
}

