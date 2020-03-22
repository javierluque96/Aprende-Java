/**
 * Coleccion.java
 * Ejercicio 3.
 * @author Javier Luque Rodríguez
 */


public class Coleccion {
	
  public static void main (String[] args) {
    int opcion;
    String codigo;
    int i;
    int libre;
    Disco[] album = new Disco[100];
    
    for (i = 0; i < 100; i++) {
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
	  for (i = 0; i < 100; i++) {
	    if (!album[i].getCodigo().equals("LIBRE")) {
	      System.out.println(album[i]);
	    }
	  }
	  break;
	case 2:
	  i = 0;
	  do {
	    if (!album[i].getCodigo().equals("LIBRE")) {
	      i++;
	    }
	  } while (!album[i].getCodigo().equals("LIBRE"));
	  
	  System.out.println("Introduce los datos del disco.");
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
	  System.out.print("Introduce el código del disco que quieres borrar: ");
	  codigo = System.console().readLine();
	  
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

