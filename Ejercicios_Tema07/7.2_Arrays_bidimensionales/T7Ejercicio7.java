public class T7Ejercicio7 {
  
  public static void main (String[] args) {
    // se definen constantes para representar el contenido de las celdas
    final int VACIO = 0;
    final int MINA = 1;
    final int TESORO = 2;
    final int INTENTO = 3;
    final int MINACERCA = 4;
    final int INTENTOMINACERCA = 5;
    int tesoroX;
    int tesoroY;
    int minaX;
    int minaY;
    int x;
    int y;
    int[][] cuadrante = new int[5][4];
    boolean salir = false;
    String c = "";
   
    // inicializa el array
    for(x = 0; x < 4; x++) {
      for(y = 0; y < 3; y++) {
	cuadrante[x][y] = VACIO;
      }
    }
    
    // coloca la mina
    minaX = (int)(Math.random() * 5);
    minaY = (int)(Math.random() * 4);
    
    cuadrante[minaX][minaY] = MINA;
    
    // Coloca area de peligro de la mina
    if ((minaX > 0) && (minaY > 0)) {
      cuadrante[minaX - 1][minaY - 1] = MINACERCA;
    }
    
    if ((minaX < 4) && (minaY < 3)) {
      cuadrante[minaX + 1][minaY + 1] = MINACERCA;
    }
    
    if (minaX < 4) {
      cuadrante[minaX + 1][minaY] = MINACERCA;
    }
    
    if (minaY < 3) {
      cuadrante[minaX][minaY + 1] = MINACERCA;
    }
    
    if (minaX > 0) {
      cuadrante[minaX - 1][minaY] = MINACERCA;
    }
    
    if (minaY > 0) {
      cuadrante[minaX][minaY - 1] = MINACERCA;
    }
    
    if ((minaX > 0) && (minaY < 3)) {
      cuadrante[minaX - 1][minaY + 1] = MINACERCA;
    }
    
    if ((minaX < 4) && (minaY > 0)) {
      cuadrante[minaX + 1][minaY - 1] = MINACERCA;
    }
    
    // coloca el tesoro
    do {
      tesoroX = (int)(Math.random() * 5);
      tesoroY = (int)(Math.random() * 4);
    } while ((minaX == tesoroX) && (minaY == tesoroY));
    
    cuadrante[tesoroX][tesoroY] = TESORO;
    
    // juego
    System.out.println("¡BUSCA EL TESORO!");
    
    do {
      // pinta el cuadrante mientras estamos en el juego
      for(y = 3; y >= 0; y--) {
	System.out.print(y + "|");
	for(x = 0; x < 5; x++) {
	if (cuadrante[x][y] == INTENTO) {
	    System.out.print("x ");
	  } else if (cuadrante[x][y] == INTENTOMINACERCA) {
	    System.out.print("c ");
	  } else {
	    System.out.print("  ");
	  }
	}
	System.out.println();
      }
      System.out.println("  ----------\n  0 1 2 3 4\n");
      
      // pide las coordenadas
      System.out.print("Coordenada x: ");
      x = Integer.parseInt(System.console().readLine());
      System.out.print("Coordenada y: ");
      y = Integer.parseInt(System.console().readLine());
      
      // mira lo que hay en las coordenadas indicadas por el usuario
      switch(cuadrante[x][y]) {
	case VACIO:
	  cuadrante[x][y] = INTENTO;
	  break;
	case MINA:
	  System.out.println("Lo siento, has perdido.");
	  salir = true;
	  break;
	case TESORO:
	  System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
	  salir = true;
	  break;
	case MINACERCA:
	  System.out.println("¡Cuidado! ¡Hay una mina cerca!");
	  cuadrante[x][y] = INTENTOMINACERCA;
	  break;

	default:
      }
    } while (!salir);
    
    // pinta el cuadrante si ganamos o perdemos el juego
    for(y = 3; y >= 0; y--) {
      System.out.print(y + "|");
      for(x = 0; x < 5; x++) {
	switch(cuadrante[x][y]) {
	  case VACIO:
	    c = "  ";
	    break;
	  case MINA:
	    c = "* ";
	    break;
	  case TESORO:
	    c = "T "; 
	    break;
	  case INTENTO:
	    c = "x ";
	    break;
	  case MINACERCA:
	    c = "P "; // Zona de Peligro
	    break;
	  case INTENTOMINACERCA:
	    c = "c "; // Zona de Peligro pisada
	    break;
	  default:
	}
	System.out.print(c);
      }
      System.out.println();
    }
    System.out.println(" ----------\n 0 1 2 3 4\n");
  } 
}

