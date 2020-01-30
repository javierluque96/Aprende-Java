/**
 * Coleccion.java
 * Ejercicio 5.
 * @author Javier Luque Rodríguez
 */


public class Coleccion {
	
  public static void main (String[] args) {
    int opcion;
    String codigo;
    String autor;
    String titulo;
    String genero;
    int duracion;
    int i;
    int[] duracionList = new int[2];
    ArrayList <Disco> coleccion = new ArrayList<Disco>();
    
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
	      for (Disco d : coleccion) {
		System.out.println(d);
	      }
	      break;
	    case 2:
	      System.out.print("Introduce el autor del que quieres el listado: ");
	      autor = System.console().readLine();
	      
	      for (Disco d : coleccion) {
		if (d.getAutor().equals(autor)) {
		  System.out.println(d);
		}
	      }
	      
	      break;
	    case 3:
	      System.out.print("Introduce el género del que quieres el listado: ");
	      genero = System.console().readLine();
	      
	      for (Disco d : coleccion) {
		if (d.getGenero().equals(genero)) {
		  System.out.println(d);
		}
	      }
	      break;
	    case 4:
	      do {
		System.out.print("Introduce la duración mínima del disco: ");
		duracionList[0] = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce la duración máxima del disco: ");
		duracionList[1] = Integer.parseInt(System.console().readLine());
		
		if (duracionList[0] > duracionList[1]) {
		  System.out.print("Datos erróneos.");
		}
	      } while(duracionList[0] > duracionList[1]);
	      
	      for (Disco d : coleccion) {
		if (d.getDuracion() >= duracionList[0] && album[i].getDuracion() 
		<= duracionList[1])) {
		  System.out.println(d);
		}
	      }
	      break;
	    default:
	  }
	  break;
	case 2:
	  System.out.println("Introduce los datos del disco.");
	  System.out.print("Código: ");
	  codigo = System.console().readLine();
	  
	  System.out.print("Autor: ");
	  autor = System.console().readLine();
	  
	  System.out.print("Título: ");
	  titulo = System.console().readLine();
	  
	  System.out.print("Género: ");
	  genero = System.console().readLine();
	  
	  System.out.print("Duración: ");
	  duracion = (Integer.parseInt(System.console().readLine()));
	  
	  album.add(new Disco(codigo, autor, titulo, genero, duracion));
	  break;
	case 3:
	  System.out.print("Introduce el código del disco que quieres cambiar: ");
	  codigo = System.console().readLine();
	  
	  
	  
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
	  
	  a.removeif(codigo.equals(a.get(codigo)));
	  
	  System.out.println("Disco borrado.");
	  break;
	default:
      }
    } while (opcion != 5);
    
  }
}

