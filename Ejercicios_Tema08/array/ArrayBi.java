package array;
import matematicas.Varias;

public class ArrayBi {
  
  /**
   * Muestra todos los números enteros de un array bidimensonal por pantalla.
   * 
   * @param x[][] array bidimensional de números enteros
   */
  public static void muestraArrayBiInt(int x[][]) {
    for(int i = 0; i < x.length; i++) {
      for(int j = 0; j < x[0].length; j++) {
	System.out.printf("%5d", x[i][j]);
      }
      System.out.println();
    }
    
  }
  
  /**
   * Ejercicio 29. Genera un array de tamaño n x m con números aleatorios cuyo 
   * intervalo (mínimo y máximo) se indica como parámetro.
   * 
   * @param filas    filas del array bidimensional
   * @param columnas columnas del array bidimensional
   * @param minimo   limite inferior del intervalo de números aleatorios
   * @param maximo   limite superior del intervalo de números aleatoios
   * @return         array con las filas y columnas indicadas con números 
   *                 comprendidos entre el mínimo y el máximo
   */
  public static int[][] generaArrayBiInt(int filas, int columnas, int minimo,
  int maximo) {
    int [][] x = new int[filas][columnas];
    
    for(int i = 0; i < filas; i++) {
      for(int j = 0; j < columnas; j++) {
	x[i][j] = (int)(Math.random() * (maximo - minimo + 1) + minimo);
      }
    }
    
    return x;
  }
  
  /**
   * Ejercicio 30. Devuelve la fila i-ésima del array que se pasa como 
   * parámetro.
   * 
   * @param x    array bidimensional de números enteros
   * @param fila número de la fila que queremos
   * @return     fila i-ésima del array
   */
  public static int[] filaDeArrayBiInt(int x[][], int fila) {
    int[] f = new int[x[0].length];
    
    for (int i = 0; i < x[0].length; i++) {
      f[i] = x[fila][i];
    }
    
    return f;
  }
  
  /**
   * Ejercicio 31. Devuelve la columna j-ésima del array que se pasa como
   * parámetro.
   * 
   * @param x    array bidimensional de números enteros
   * @param fila número de la columna que queremos
   * @return     columna j-ésima del array
   */
  public static int[] columnaDeArrayBiInt(int x[][], int columna) {
    int[] c = new int[x.length];
    
    for (int i = 0; i < x.length; i++) {
      c[i] = x[i][columna];
    }
    
    return c;
  }
  
  /**
   * Ejercicio 32. Devuelve la fila y la columna de la primera ocurrencia de un
   * número dentro de un array bidimensional. Si el número no se encuentra en el
   * array devuelve {-1, -1}
   * 
   * @param x   array bidimensional de números enteros
   * @param num número que queremos encontrar en el array
   * @return    posición del número que buscamos
   */
  public static int[] coordenadasEnArrayBiInt(int x[][], int num) {
    int[] coordenadas = {-1, -1};
    boolean encontrado = false;
    
    for (int i = 0; i < x.length; i++) { // Filas
      for (int j = 0; j < x[0].length; j++) { // Columnas
	if (x[i][j] == num && !encontrado) {
	  coordenadas[0] = i;
	  coordenadas[1] = j;
	}
      }
    }
    
    return coordenadas;
  }
  
  /**
   * Ejercicio 33. Dice si un número es punto de silla, es decir, mínimo en su 
   * fila y máximo en su columna.
   * 
   * @param x array bidimensional de números enteros
   * @param i fila del array
   * @param j columna del array
   * @return  true si es punto de silla o false si no lo es
   */
  public static boolean esPuntoDeSilla(int x[][], int i, int j) {
    int[] fila = filaDeArrayBiInt(x, i);
    int[] columna = columnaDeArrayBiInt(x, j);
    
    if ((Array.minimoArrayInt(fila) == x[i][j]) && 
      (Array.maximoArrayInt(columna) == x[i][j])) {
      return true;
    } else {
      return false;
    }
  }
  
  /**
   * Ejercicio 34. Devuelve un array que contiene una de las diagonales del 
   * array bidimensional que se pasa como parámetro. Se pasan como parámetros
   * fila, columna y dirección. La fila y la columna determinan el número que
   * marcará las dos posibles diagonales dentro del array. La dirección es una 
   * cadena de caracteres que puede ser nose o neso. La cadena nose
   * indica que se elige la diagonal que va del noroeste hacia el sureste, 
   * mientras que la cadena neso indica que se elige la diagonal que va del 
   * noreste hacia el suroeste.
   * 
   * @param x       array bidimensional de números enteros
   * @param fila    fila del número que queremos indicar
   * @param columna columna del número que queremos indicar
   * @param dir     dirección de la diagonal nose o neso
   * @return        array unidimension con los números de la diagonal
   */
  public static int[] diagonal(int x[][], int fila, int columna, String dir) {
    int[] aux = new int[x.length];
    int i, j;
    int indice = 0;
    
    // Obtenemos la diagonal en un array que puede pasarse del tamaño necesario
    for (i = 0; i < x.length; i++) {
      for (j = 0; j < x[0].length; j++) {
	if ( (((columna - j) == (fila - i)) && dir.equals("nose")) || 
	  (((columna - j) == (i - fila)) && dir.equals("neso")) ) {
	  aux[indice++] = x[i][j];
	}
      }
    }
    
    // Array con el tamaño que es necesario para la diagonal
    int[] d = new int[indice];
    for (i = 0; i < indice; i++) {
      d[i] = aux[i];
    }
    
    return d;
  }
  
  /** Ejercicio 53.Devuelve el número que ocupa la posición n-esima dentro de
   * un array bidimensional contando de izquierda a derecha y de arriba a abajo.
   * El primer elemento es el 0. 
   * 
   * @param n[][]    array bidimensional de números enteros
   * @param posicion posición dentro del array bidimensional
   * @return 	     número que ocupa la posición o -1 si la posición es 
   * 		     incorrecta
   */
  public static int nEsimo(int[][] n, int posicion) {
    int contador = 0;
    if (posicion > n.length * n[0].length) {
      return -1;
    }
    
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
	if(posicion == contador) {
	  return n[i][j];
	}
	contador++;
      }
    }
    
    return -1;
  }
}

