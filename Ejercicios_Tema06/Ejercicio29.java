public class Ejercicio29 {
  
  public static void main (String[] args) {
    System.out.println("1. Primavera\n2. Verano\n3. Otoño\n4. Invierno");
    System.out.print("Seleccione la estación del año (1-4): ");
    int estacion = Integer.parseInt(System.console().readLine());
    
    int i;
    int temp1 = 0;
    int temp2 = 0;
    int tiempo;
    String cielo = "";
    
    System.out.println("\nPrevisión del tiempo para mañana");
    System.out.println("--------------------------------");
    
    switch (estacion) {
      case 1: // Primavera
	temp1 = (int)(Math.random() * 16 + 15);
	temp2 = (int)(Math.random() * 16 + 15);
	tiempo = (int)(Math.random() * 100) + 1;
	
	if (tiempo <= 40) {
	  cielo = "Nublado";
	} else {
	  cielo = "Soleado";
	}
	break;
	
      case 2: // Verano
	temp1 = (int)(Math.random() * 26 + 20);
	temp2 = (int)(Math.random() * 26 + 20);
	tiempo = (int)(Math.random() * 100) + 1;
	
	if (tiempo <= 20) {
	  cielo = "Nublado";
	} else {
	  cielo = "Soleado";
	}
	break;
	
      case 3: // Otoño
	temp1 = (int)(Math.random() * 11) + 20;
	temp2 = (int)(Math.random() * 11) + 20;
	tiempo = (int)(Math.random() * 100) + 1;
	
	if (tiempo <= 40) {
	  cielo = "Soleado";
	} else {
	  cielo = "Nublado";
	}
	break;
	
      case 4: // Invierno
	temp1 = (int)(Math.random() * 26);
	temp2 = (int)(Math.random() * 26);
	tiempo = (int)(Math.random() * 100) + 1;

	if (tiempo <= 20) {
	  cielo = "Soleado";
	} else {
	  cielo = "Nublado";
	}
	break;
	
      default:
	System.out.println("La estación seleccionada no es correcta.");
    } // switch
    
    // Pone la temperatura más alta como máxima y la más baja como mínima
    if (temp1 < temp2) {
      System.out.println("Temperatura mínima: " + temp1);
      System.out.println("Temperatura máxima: " + temp2);
    } else {
      System.out.println("Temperatura mínima: " + temp2);
      System.out.println("Temperatura máxima: " + temp1);
    }
    // Imprime si está nublado o soleado
    System.out.println(cielo);
  } 
}

