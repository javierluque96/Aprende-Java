public class T7Ejercicio15 {
  
  public static void main (String[] args) {
    int[] mesa = new int[10];
    int num;
    int i;
    int numMesa = 0;
    boolean mesaLibre;
    // Genera mesas aleatorias
    for (i = 0; i < 10; i++) {
      mesa[i] = (int)(Math.random() * 5);
    }
    
    // Imprime la tabla con las mesas
    for (i = 0; i < 10; i++) {
      mesa[i] = (int)(Math.random() * 5);
    }
    
    for (i = 0; i < 41; i++) {
      System.out.print("-");
    }
    
    System.out.print("\n|Mesa     |");
    for(i = 0; i < 10; i++) {
      System.out.printf("%2d|", i + 1);
    }
    
    System.out.println();
    for (i = 0; i < 41; i++) {
      System.out.print("-");
    }
    
    System.out.print("\n|Ocupacion|");
    for(i = 0; i < 10; i++) {
      System.out.printf("%2d|", mesa[i]);
    }
    
    System.out.println();
    for (i = 0; i < 41; i++) {
      System.out.print("-");
    }
    
    // Pregunta al cliente hasta que introduzca -1
    do {
      System.out.print("\n\n¿Cuántos son? (Introduzca -1 para salir del "
	+ "programa): ");
      num = Integer.parseInt(System.console().readLine());
      
      if (num > 0 && num < 5) {
	mesaLibre = false;
	
	// Si hay una mesa libre cogemos la mesa que hay libre
	for (i = 0; i < 10; i++) {
	  if ((mesa[i] == 0) && (mesaLibre == false)) {
	    numMesa = i;
	    mesaLibre = true;
	  } 
	}
	
	// Si no hay mesa libre, se comparte la primera mesa en la que entren
	if (mesaLibre) {
	  mesa[numMesa] += num;
	  System.out.println("Por favor, siéntese en la mesa número " 
	    + (numMesa + 1) + ".\n");
	} else {
	  for (i = 0; i < 10; i++) {
	    if (((mesa[i] + num) <= 4) && (mesaLibre == false)) {
	      numMesa = i;
	      mesaLibre = true;
	    } 
	  } 
	  
	  // Si aun compartiendo mesa no entran en ninguna mesa, entonces no hay 
	  // mesa libre para los clientes
	  if (mesaLibre) {
	    mesa[numMesa] += num;
	    System.out.println("Tendrán que compartir mesa, siéntese en la mesa" 
	      + " número " + (numMesa + 1) + ".\n");
	  } else {
	    System.out.println("Lo siento, en estos momentos no queda sitio."
	      + "\n");
	  }
	}
      
	// Imprime la tabla con las mesas
	for (i = 0; i < 41; i++) {
	  System.out.print("-");
	}
	
	System.out.print("\n|Mesa     |");
	for(i = 0; i < 10; i++) {
	  System.out.printf("%2d|", i + 1);
	}
	
	System.out.println();
	for (i = 0; i < 41; i++) {
	  System.out.print("-");
	}
	
	System.out.print("\n|Ocupacion|");
	for(i = 0; i < 10; i++) {
	  System.out.printf("%2d|", mesa[i]);
	}
	
	System.out.println();
	for (i = 0; i < 41; i++) {
	  System.out.print("-");
	}
      } 
    } while (num >= 0);
  } 
}

