package array;
import matematicas.Varias;

public class Array {
  
  /**
   * Muestra todos los números enteros de un array unidimensonal por pantalla.
   * 
   * @param x[] array unidimensional de números enteros
   */
  public static void muestraArrayInt(int x[]) {
    for(int n : x) {
      System.out.print(n + " ");
    }
    System.out.println();
  }
  
  /**
   * Ejercicio 20. Genera un array con el tamaño que le indiquemos con números
   * aleatorios. El intervalo (mínimo y máximo) de los números aleatorios se
   * los indicaremos como parámetros.
   * 
   * @param n      tamaño del array
   * @param inferior límite inferior de los números aleatorios
   * @param superior límite superior de los números aleatorios
   */
  public static int[] generaArrayInt(int n, int inferior, int superior) {
    int[] x = new int[n];
    
    for(int i = 0; i < n; i++) {
      x[i] = (int)(Math.random() * (superior + 1 - inferior) + inferior);
    }
    
    return x;
  } 
  
  /**
   * Ejercicio 21. Devuelve el mínimo del array que se pasa como parámetro.
   * 
   * @param x array de números enteros
   * @return  mínimo de los números del array
   */
  public static int minimoArrayInt(int[] x) {
    int minimo = Integer.MAX_VALUE;
    
    for (int n : x) {
      if (n < minimo) {
	minimo = n;
      }
    }
    return minimo;
  }
  
  /**
   * Ejercicio 22. Devuelve el máximo del array que se pasa como parámetro.
   * 
   * @param x array de números enteros
   * @return  máximo de los números del array
   */
  public static int maximoArrayInt(int[] x) {
    int maximo = Integer.MIN_VALUE;
    
    for (int n : x) {
      if (n > maximo) {
	maximo = n;
      }
    }
    return maximo;
  }
  
  /**
   * Ejercicio 23. Devuelve el máximo del array que se pasa como parámetro.
   * 
   * @param x array de números enteros
   * @return  media de los números del array
   */
  public static int mediaArrayInt(int[] x) {
    int suma = 0;
    
    for (int n : x) {
      suma += n;
    }
    return suma / x.length;
  }
  
  /**
   * Ejercicio 24. Dice si un número está en un array o no.
   * 
   * @param x array de números enteros
   * @param y número que queremos saber si está en el array
   * @return  true si está o false si no está en el array
   */
  public static boolean estaEnArrayInt(int[] x, int y) {
    
    for (int n : x) {
      if (n == y) {
	return true;
      }
    }
    return false;
  }
  
  /**
   * Ejercicio 25. Dice la posición que ocupa un número en un array.
   * 
   * @param x array de números enteros
   * @param d digito que queremos saber la posición que ocupa
   * @return  posición que ocupa el dígito en el array
   */
  public static int posicionEnArrayInt(int[] x, int d) {
    
    for (int i = 0; i < x.length; i++) {
      if (x[i] == d) {
	return i;
      }
    }
    return -1;
  }
  
  /**
   * Ejercicio 26. Le da la vuelta a un array.
   * 
   * @param x array de números enteros
   * @return  array volteado
   */
  public static int[] volteaArrayInt(int[] x) {
    int[] volteado = new int[x.length];
    int indice = 0;
    
    for (int i = x.length - 1; i >= 0; i--) {
      volteado[indice++] = x[i];
    }
    return volteado;
  }
  
  /**
   * Ejercicio 27. Rota n posiciones a la derecha los números de un array.
   * 
   * @param x array de números enteros
   * @param n número de veces que queremos rotar a la derecha el array
   * @return  array rotado a la derecha n veces
   */
  public static int[] rotaDerechaArrayInt(int[] x, int n) {
    int aux;
    // Clona el array que pasamos por parámetro
    int[] rotado = x.clone(); 
    
    // Rota el array n veces a la derecha
    while (n > 0) {
      aux = rotado[rotado.length - 1];
      
      for(int i = rotado.length - 1; i >= 0; i--) {
	if(i > 0) {
	  rotado[i] = rotado[i - 1];
	}
      }
      
      rotado[0] = aux;
      n--;
    }
    return rotado;
  }
  
  /**
   * Ejercicio 27. Rota n posiciones a la izquierda los números de un array.
   * 
   * @param x array de números enteros
   * @param n número de veces que queremos rotar a la izquierda el array
   * @return  array rotado a la izquierda n veces
   */
  public static int[] rotaIzquierdaArrayInt(int[] x, int n) {
    int aux;
    // Clona el array que pasamos por parámetro
    int[] rotado = x.clone(); 
    
    // Rota el array n veces a la izquierda
    while (n > 0) {
      aux = rotado[0];
      
      for(int i = 0; i < rotado.length - 1; i++) {
	rotado[i] = rotado[i + 1];
      }
      
      rotado[rotado.length - 1] = aux;
      n--;
    }
    return rotado;
  }
  
}

