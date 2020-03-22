public class T8Ejercicio18 {
  
  public static void main (String[] args) {
    // Pasa un número de decimal a binario
    System.out.print("Introduce el número que quieres pasar a binario: ");
    long num = Integer.parseInt(System.console().readLine());
    
    System.out.println(num + " en binario es " + decimalABinario(num));
  } 
  
  /* Pasa un número de decimal a binario.
   * 
   * @param decimal número que queremos pasar a binario
   * @return 	    número convertido a binario
   */
  public static long decimalABinario(long decimal) {
  
    if (decimal == 0) {
      return 0;
    }
      
    long binario = 1;
    
    while (decimal > 1) {
      binario = matematicas.Varias.pegaPorDetras(binario, (int)decimal % 2);
      decimal = decimal / 2;
    }
    binario = matematicas.Varias.pegaPorDetras(binario, 1);
    binario = matematicas.Varias.voltea(binario);
    binario = matematicas.Varias.quitaPorDetras(binario, 1);
    
    return binario;
  }
}

