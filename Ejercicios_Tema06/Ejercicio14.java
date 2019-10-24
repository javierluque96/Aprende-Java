public class Ejercicio14 {
  
  public static void main (String[] args) {
    System.out.println("Piensa un número del 0 al 100. Intentaré adivinarlo en "
      + "5 intentos.");
    System.out.println("Pulsa la tecla INTRO cuando estés preparado.");
    System.console().readLine();
    int num;
    int mayor = 101;
    int menor = 0;
    int opcion = 1;
    int intentos = 0;
    boolean fueraBucle = false;
    
    do {
      num = (int)(Math.random() * (mayor - menor)) + menor;
      System.out.println("¿És el " + num + "?");
      
      System.out.print("El número que estás pensando es | 1. Mayor | 2. Menor |"
	+ "3. ¡¡Has acertado!! | Opción escogida: ");
      opcion = Integer.parseInt(System.console().readLine());
      intentos++;
      
      switch (opcion) {
	case 1:
	  menor = num + 1;
	  break;
	case 2:
	  mayor = num - 1;
	  break;
	case 3:
	  fueraBucle = true;
	  System.out.println("¡Bien! ¡he acertado!");
	  break;
	default:
      }
      if (intentos == 5) {
	fueraBucle = true;
      }
      
    } while (fueraBucle == false);
  } 
}

