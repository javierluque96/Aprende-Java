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
  
  /**
   * Ejercicio 36. Devuelve un array con todos los números primos que se 
   * encuentran en otro array que se pasa como parámetro. El tamaño del array
   * que se devuelve será menor o igual que se pasa como parámetro.
   * 
   * @param x array de números enteros
   * @return  array resultado con los números primos del array
   */
  public static int[] filtraPrimos(int x[]) {
    int[] aux = new int[x.length];
    int indice = 0, i;
    
    for (i = 0; i < x.length; i++) {
      if (matematicas.Varias.esPrimo(x[i])) {
	aux[indice++] = x[i];
      }
    }
    
    if(indice == 0) {
      int[] primos = {-1};
      
      return primos;
    } else {
      int[] primos = new int[indice];
      
      for (i = 0; i < indice; i++) {
	primos[i] = aux[i];
      }
      return primos;
    }
  }
  
  /**
   * Ejercicio 36. Devuelve un array con todos los números capicuas que se 
   * encuentran en otro array que se pasa como parámetro. El tamaño del array
   * que se devuelve será menor o igual que se pasa como parámetro.
   * 
   * @param x array de números enteros
   * @return  array resultado de los números capicúa del array 
   */
  public static int[] filtraCapicuas(int x[]) {
    int[] aux = new int[x.length];
    int indice = 0, i;
    
    for (i = 0; i < x.length; i++) {
      if (matematicas.Varias.esCapicua(x[i])) {
	aux[indice++] = x[i];
      }
    }
    
    if(indice == 0) {
      int[] c = {-1};
      
      return c;
    } else {
      int[] c = new int[indice];
      
      for (i = 0; i < indice; i++) {
	c[i] = aux[i];
      }
      return c;
    }
  }
  
  /**
   * Ejercicio 40. Devuelve un array con todos los números que contienen el 7
   * que se encuentran en un array que se pasa como parámetro. El tamaño del 
   * array que se devuelve será menor o igual que se pasa como parámetro.
   * 
   * @param x array de números enteros
   * @return  array con los números que tienen el 7 en el array
   */
  public static int[] filtraCon7(int x[]) {
    int[] aux = new int[x.length];
    int indice = 0, i, j;
    
    for (i = 0; i < x.length; i++) {
      for (j = 0; j < matematicas.Varias.digitos(x[i]); j++) {
	if(matematicas.Varias.digitoN(x[i], j) == 7) {
	  aux[indice++] = x[i];
	}
      }
    }
    
    if(indice == 0) {
      int[] c = {-1};
      
      return c;
    } else {
      int[] c = new int[indice];
      
      for (i = 0; i < indice; i++) {
	c[i] = aux[i];
      }
      return c;
    }
  }
  
  /**
   * Ejercicio 47. Esta función toma como parámetro un array que contiene 
   * números y devuelve una cadena de caracteres con esos números. Por ejemplo, 
   * si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve 62501.
   * 
   * @param x array de números enteros
   * @return  String con los números del array
   */
  public static String convierteArrayEnString(int[] x) {
    String num = "";
    
    for (int n : x) {
      num += n;
    }
    
    return num;
  }
  
  /**
   * Ejercicio 47. Esta función toma dos arrays como parámetros y devuelve un 
   * array que es el resultado de concatenar ambos. Por ej. si a = { 8, 9, 0 } y 
   * b = { 1, 2, 3 }, concatena(a, b) devuelve { 8, 9, 0, 1, 2, 3 }.
   * 
   * @param a array de números enteros
   * @param b array de números enteros
   * @return  array resultado de concatenar los arrays a y b
   */
  public static int[] concatena(int[] a, int[] b) {
    int[] c = new int[a.length + b.length];
    int i;
    int indice = 0;
    
    for (i = 0; i < a.length; i++) {
      c[i] = a[i];
    }
    
    for (i = a.length; i < (a.length + b.length); i++) {
      c[i] = b[indice++];
    }
    
    return c;
  }
  
  /**
   * Ejercicio 50. Esta función toma dos arrays como parámetros y devuelve un 
   * array que es el resultado de mezclar los números de ambos de forma alterna. 
   * Se coge un número de a, luego de b, luego de a, etc. Ejemplo:
   * Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3}
   * 
   * @param a array de números enteros
   * @param b array de números enteros
   * @return  array resultado de mezclar los arrays a y b
   */
  public static int[] mezcla(int[] a, int[] b) {
    int[] resultado = new int[a.length + b.length];
    int i = 0;
    int indiceA = 0;
    int indiceB = 0;
    
    
    do {
      if (indiceA < a.length) {
	resultado[i++] = a[indiceA++];
      } 
      
      if (indiceB < b.length) {
	resultado[i++] = b[indiceB++];
      }
    } while (i < a.length + b.length);
    
    return resultado;
  }
}

