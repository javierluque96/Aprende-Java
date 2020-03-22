/*
 * PruebaZona.java
 * 
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches Campanillas que tiene 
 * 3 zonas, la sala principal con 1000 entradas disponibles, la zona de compra-venta con 200 
 * entradas disponibles y la zona vip con 25 entradas disponibles. Hay que controlar que existen 
 * entradas antes de venderlas.
 * 
 * El menú del programa debe ser el que se muestra a continuación. Lógicamente, el 
 * programa debe controlar que no se puedan vender más entradas de la cuenta.
 * 1. Mostrar número de entradas libres
 * 2. Vender entradas
 * 3. Salir
 */
import java.util.Scanner;

public class PruebaZona {
	
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    
    int opcion;
    int opcionZona;
    int venta;
    do {
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      opcion = s.nextInt();
      
      switch (opcion) {
	case 1:
	  System.out.println("Zona principal: " + principal.getEntradasPorVender());
	  System.out.println("Zona compra-venta: " + compraVenta.getEntradasPorVender());
	  System.out.println("Zona vip: " + vip.getEntradasPorVender() + "\n");
	  break;
	  
	case 2:
	  System.out.println("Elige las entradas de la zona que quieres vender: ");
	  System.out.println("1. Zona principal");
	  System.out.println("2. Zona compra-venta");
	  System.out.println("3. Zona vip");
	  opcionZona = s.nextInt();
	  System.out.println("¿Cuántas entradas quieres vender?");
	  venta = s.nextInt();
	  
	  switch (opcionZona) {
	    case 1:
	      principal.vender(venta);
	      System.out.println();
	      break;
	    case 2:
	      compraVenta.vender(venta);
	      System.out.println();
	      break;
	    case 3:
	      vip.vender(venta);
	      System.out.println();
	      break;
	    default:
	  }
	  break;
	  
	default:
      }
      
    } while (opcion != 3);
  }
}

