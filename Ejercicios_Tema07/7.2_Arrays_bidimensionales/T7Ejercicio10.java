public class T7Ejercicio10 {
  
  public static void main (String[] args) {
    final String JUGADOR = "X";
    final String ORDENADOR = "O";
    
    String[][] tablero = new String[3][3];
    boolean jugadorGana = false;
    boolean ordenadorGana = false;
    int i, j;
    int fila, columna;
    int movimientos = 0;
    String posicion;
    // inicializa el tablero
    for(i = 0; i < 3; i++) {
      for(j = 0; j < 3; j++) {
        tablero[i][j] = " ";
      }
    }
    
    // Comienza el juego
    do {
      // Pinta el tablero
      System.out.println("  -------------");
      System.out.printf("c | %s | %s | %s |", tablero[2][0], tablero[2][1], 
	tablero[2][2]);
      System.out.println("\n  -------------");
      System.out.printf("b | %s | %s | %s |", tablero[1][0], tablero[1][1], 
      tablero[1][2]);
      System.out.println("\n  -------------");
      System.out.printf("a | %s | %s | %s |", tablero[0][0], tablero[0][1], 
	tablero[0][2]);
      System.out.println("\n  -------------");
      System.out.print("    1   2   3");
      
      // pide la posición del jugador y comprueba que sea correcta
      do {
	System.out.print("\n\nIntroduzca la posición, por ejemplo b2: ");
	posicion = System.console().readLine();
	fila = (int)(posicion.charAt(0) - 97);;
	columna = (int)posicion.charAt(1) - 1 - 48;
	
	if (tablero[fila][columna] == JUGADOR || 
	    tablero[fila][columna] == ORDENADOR) {
	  System.out.print("Posición introducida incorrecta.");
	}
	
      } while (tablero[fila][columna] == JUGADOR || 
	  tablero[fila][columna] == ORDENADOR);
	
      tablero[fila][columna] = JUGADOR;
      movimientos++;
      
      // comprueba si gana el jugador
      jugadorGana = (
        (tablero[0][0] == JUGADOR) && (tablero[0][1] == JUGADOR) && 
	(tablero[0][2] == JUGADOR) ||
        (tablero[1][0] == JUGADOR) && (tablero[1][1] == JUGADOR) && 
	(tablero[1][2] == JUGADOR) ||
        (tablero[2][0] == JUGADOR) && (tablero[2][1] == JUGADOR) && 
	(tablero[2][2] == JUGADOR) ||
        (tablero[0][0] == JUGADOR) && (tablero[1][0] == JUGADOR) && 
	(tablero[2][0] == JUGADOR) ||
        (tablero[0][1] == JUGADOR) && (tablero[1][1] == JUGADOR) && 
	(tablero[2][1] == JUGADOR) ||
        (tablero[0][2] == JUGADOR) && (tablero[1][2] == JUGADOR) && 
	(tablero[2][2] == JUGADOR) ||
        (tablero[0][0] == JUGADOR) && (tablero[1][1] == JUGADOR) && 
	(tablero[2][2] == JUGADOR) ||
        (tablero[0][2] == JUGADOR) && (tablero[1][1] == JUGADOR) && 
	(tablero[2][0] == JUGADOR)
      );
      
      if (!jugadorGana && (movimientos < 9)) {
        // Genera un posición aleatoria para el ordenador
        do {
          fila = (int)(Math.random() * 3);
          columna = (int)(Math.random() * 3);
        } while (!tablero[fila][columna].equals(" "));
        
        tablero[fila][columna] = ORDENADOR;
        movimientos++;
        // comprueba si gana el ordenador
        ordenadorGana = (
          (tablero[0][0] == ORDENADOR) && (tablero[0][1] == ORDENADOR) && 
	  (tablero[0][2] == ORDENADOR) ||
          (tablero[1][0] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && 
	  (tablero[1][2] == ORDENADOR) ||
          (tablero[2][0] == ORDENADOR) && (tablero[2][1] == ORDENADOR) && 
	  (tablero[2][2] == ORDENADOR) ||
          (tablero[0][0] == ORDENADOR) && (tablero[1][0] == ORDENADOR) && 
	  (tablero[2][0] == ORDENADOR) ||
          (tablero[0][1] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && 
	  (tablero[2][1] == ORDENADOR) ||
          (tablero[0][2] == ORDENADOR) && (tablero[1][2] == ORDENADOR) && 
	  (tablero[2][2] == ORDENADOR) ||
          (tablero[0][0] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && 
	  (tablero[2][2] == ORDENADOR) ||
          (tablero[0][2] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && 
	  (tablero[2][0] == ORDENADOR)
        );
      }
    } while (!jugadorGana && !ordenadorGana && (movimientos < 9));
    
    if (jugadorGana) {
      System.out.println("\n¡Enhorabuena! ¡Has ganado!");
    } else if (ordenadorGana) {
      System.out.println("\nGana el ordenador.");
    } else {
      System.out.println("\nEmpate. No gana nadie.");
    }
    
    // Pinta el tablero
    System.out.println("  -------------");
    System.out.printf("c | %s | %s | %s |", tablero[2][0], tablero[2][1], 
      tablero[2][2]);
    System.out.println("\n  -------------");
    System.out.printf("b | %s | %s | %s |", tablero[1][0], tablero[1][1], 
    tablero[1][2]);
    System.out.println("\n  -------------");
    System.out.printf("a | %s | %s | %s |", tablero[0][0], tablero[0][1], 
      tablero[0][2]);
    System.out.println("\n  -------------");
    System.out.print("    1   2   3");
  } 
}

