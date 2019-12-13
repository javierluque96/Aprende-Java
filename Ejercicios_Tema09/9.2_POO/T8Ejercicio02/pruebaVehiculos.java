/**
 * Vehiculo.java
 * Ejercicio2.
 * Definición de la clase Vehiculo
 * @author Javier Luque Rodríguez
 */
import java.util.Scanner;

public class pruebaVehiculos {
  public static void main(String[] args) {
    
    int opcion;
    int km;
    Scanner s = new Scanner(System.in);
    Coche cocheDeAdri = new Coche("BMW", 140);
    Bicicleta biciDeRuben = new Bicicleta("RAW", "Descenso");
    
    do {
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.print("Elige una opción (1-8): ");
      
      opcion = s.nextInt();
      
      switch(opcion) {
	case 1:
	  System.out.print("¿Cuántos kilómetros has recorrido? ");
	  km = s.nextInt();
	  biciDeRuben.recorre(km);
	  break;
	case 2:
	  biciDeRuben.caballito();
	  break;
	case 3:
	  System.out.print("¿Cuántos kilómetros has recorrido? ");
	  km = s.nextInt();
	  cocheDeAdri.recorre(km);
	  break;
	case 4:
	  cocheDeAdri.quemaRueda();
	  break;
	case 5:
	  System.out.println("\nLos kilómetros recorridos por la Bici de Ruben "
	    + "son " + biciDeRuben.getKilometrosRecorridos() + " km.");
	  break;
	case 6:
	  System.out.println("\nLos kilómetros recorridos por el coche de Adri "
	    + "son " + cocheDeAdri.getKilometrosRecorridos() + " km.");
	  break;
	case 7:
	  System.out.println("\nLos kilómetros recorridos por ambos vehículos "
	    + "son " + Vehiculo.getKilometrosRecorridosTotales() + " km.");
	  break;
	default:
      }
      
    } while (opcion != 8);
    
  }
}
