public class T7Ejercicio8 {
  
  public static void main (String[] args) {
    int filaAlfil = 0;
    int columnaAlfil = 0;
    int fila, columna;
    String posicion;
    
    System.out.print("Introduce la posición del alfil: ");
    posicion = System.console().readLine();
    
    columnaAlfil = (int)(posicion.charAt(0) - 96);
    filaAlfil = (int)(posicion.charAt(1)) - 48;
    
    
    
    // Movimientos hacía la esquina superior derecha
    columna = columnaAlfil + 1;
    System.out.println("\nMovimientos hacía la esquina superior --> ");
    for (fila = filaAlfil + 1; fila <= 8; fila++) {
      if (columna <= 8) {
	System.out.print((char)(columna + 96) + "" + (fila) + "  ");
      
	columna++;
      }
    }
    
    // Movimientos hacía la esquina superior izquierda
    System.out.println("\nMovimientos hacía la esquina superior <-- ");
    columna = columnaAlfil - 1;
    for (fila = filaAlfil + 1; fila <= 8; fila++) {
      if (columna >= 1) {
	System.out.print((char)(columna + 96) + "" + (fila) + "  ");
	
	columna--;
      }
    }
    
    // Movimientos hacía la esquina inferior derecha
    System.out.println("\nMovimientos hacía la esquina inferior --> ");
    columna = columnaAlfil + 1;
    for (fila = filaAlfil - 1; fila >= 1; fila--) {
      if (columna <= 8) {
	System.out.print((char)(columna + 96) + "" + (fila) + "  ");
	
	columna++;
      }
    }
    
    // Movimientos hacía la esquina inferior izquierda
    System.out.println("\nMovimientos hacía la esquina inferior <-- ");
    columna = columnaAlfil - 1;
    for (fila = filaAlfil - 1; fila >= 1; fila--) {
      if (columna >= 1) {
	System.out.print((char)(columna + 96) + "" + (fila) + "  ");
      
	columna--;
      }
    }
  } 
}

