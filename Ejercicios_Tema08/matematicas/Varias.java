package matematicas;

public class Varias {
  /* Ejercicio 1. Comprueba si un número es capicua
   * 
   * @param x número que queremos saber si es capicua
   * @return true si es capicua o false si no es capicua
   */
  public static boolean esCapicua(int x) {
    return x == voltea(x);
  } 
  
  /* Ejercicio 2. Comprueba si un número es primo.
   * 
   * @param número entero positivo que queremos saber si es primo
   * return true si es primo o false si no es primo
   */
  public static boolean esPrimo(int x) {
    if (x < 2) {
      return false;
    } else {
      for (int i = 2; i < x; i++) {
	if (x % i == 0) {
	  return false;
	}
      }
    }
    return true;
  }
  
  /* Ejercicio 3. Devuelve el menor primo que es mayor al número que se pasa 
   * como parámetro.
   * 
   * @param x un número entero
   * @return  el menor primo que es mayor al número que se pasa como parámetro.
   */
  public static int siguientePrimo(int x) {
    while (!esPrimo(x)) {
      x++;
    }
    return x;
  }
  
  /* Ejercicio 4. Devuelve la potencia de una base y exponento dados.
   * 
   * @param base      base de la potencia
   * @param exponente exponente de la potencia
   * @return          número resultante de elevar la base al exponente
   */
  public static double potencia(int base, int exponente)   {
    if (exponente == 0) {
      return 1;
    }
    
    if (exponente < 0) {
      return 1/potencia(base, -exponente);
    }
    
    int x = 1;
    
    for (int i = 0; i < Math.abs(exponente); i++) {
      x *= base;
    }
    
    return x;
  }
  
  /* Ejercicio 5. Cuenta el número de dígitos de un número entero.
   * 
   * @param x número del que queremos saber el número de dígitos
   * @return  el número de dígitos
   */
  public static int digitos(int x) {
    int longitud = 0;
    
    while (x > 0) {
      x /= 10;
      longitud++;
    }
    
    return longitud;
  }
  
  /* Ejercicio 6. Da la vuelta a un número.
   * 
   * @param x número que queremos voltear
   * @return  número volteado
   */
  public static int voltea(int x) {
    int volteado = 0;
    
    while (x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x /= 10;
    }
    return volteado;
  }
  
  /* Ejercicio 7. Devuelve el dígito que está en la posición n. La posición la 
   * cuenta desde 0 de izquierda a derecha.
   * 
   * @param n número del que queremos saber la posición del dígito
   * @param p posición del dígito que queremos
   * @return  dígito que está en la posición indicada
   */
  public static int digitoN(int n, int p) {
    if (p < 0 || p > digitos(n)) {
      return -1;
    }
    
    return (quitaPorDetras(n, (digitos(n) - p - 1)) % 10);
  }
  
  /* Ejercicio 8. Da la posición de un dígito dentro de un número, si no se
   * encuentra, devuelve -1.
   * 
   * @param n número entero 
   * @param d digito que queremos saber la posición que ocupa dentro del número
   * @return  posición que ocupa el dígito
   */
  public static int posicionDeDigito(int n, int d) {
    for(int i = 0; i < digitos(n); i++) {
      if (d == digitoN(n, i)) {
	return i;
      }
    }
    return -1;
  }
  
  /* Ejercicio 9. Le quita a un número n digitos por detrás (derecha).
   * 
   * @param num número entero al que queremos quitar dígitos
   * @param x	número de dígitos que queremos quitar
   * @return	número con los dígitos extraídos por detrás
   */
  public static int quitaPorDetras(int num, int x) {
    if (x > digitos(num) || x < 0) {
      return -1;
    }
    return num / (int)potencia(10, x);
  }
  
  /* Ejercicio 10. Le quita a un número n digitos por delante (izquierda).
   * 
   * @param num número entero al que queremos quitar dígitos
   * @param x	número de dígitos que queremos quitar
   * @return	número con los dígitos extraídos por detrás
   */
  public static int quitaPorDelante(int num, int x) {
    if (x > digitos(num) || x < 0) {
      return -1;
    }
    return num % (int)potencia(10, digitos(num) - x);
  }
  
  /* Ejercicio 11. Añade un dígito a un número por detrás.
   * 
   * @param num número entero al que queremos añadir un dígito
   * @param d	número que queremos añadir del 0 al 9
   * @return 	número con el dígito añadido
   */
  public static int pegaPorDetras(int num, int d) {
    if (d > 9 || d < 0) {
      return -1;
    }
    return num = num * 10 + d;
  }
  
  /* Ejercicio 12. Añade un dígito a un número por delante.
   * 
   * @param n número entero al que queremos añadir un dígito
   * @param d número que queremos añadir del 0 al 9
   * @return  número con el dígito añadido
   */
  public static int pegaPorDelante(int n, int d) {
    if (d > 9 || d < 0) {
      return -1;
    }
    return juntaNumeros(d, n);
  }
  
  /* Ejercicio 13. Toma como parámetros las posiciones inicial y final dentro de
   * un número y devuelve el trozo correspondiente.
   * 
   * @param n número entero 
   * @param i posición inicial
   * @param f posición final
   * @return  trozo del número que queremos
   */
  public static int trozoDeNumero(int n, int i, int f) {
    if (i > digitos(n) || f > digitos(n) || i < 0 || f < 0) {
      return -1;
    }
    return quitaPorDelante(quitaPorDetras(n, digitos(n) - f - 1), i);
  }
  
  /* Ejercicio 14. Pega dos números para formar uno.
   * 
   * @param n1 número entero 
   * @param n2 número entero
   * @return  trozo del número que queremos
   */
  public static int juntaNumeros(int n1, int n2) {
    return n1 * (int)potencia(10, digitos(n2)) + n2;
  }
}

