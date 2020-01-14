import matematicas.Varias;

public class T8Ejercicio17 {
  
  public static void main (String[] args) {
    System.out.print("Introduce el número que quieres pasar a decimal: ");
    int binario = Integer.parseInt(System.console().readLine());
    
    int decimal = 0;
    int i;
    int bits = matematicas.Varias.digitos(binario);
    
    for (i = 0; i < bits; i++) {
      decimal += matematicas.Varias.digitoN(binario, bits - i - 1) * 
	matematicas.Varias.potencia(2, i);
    }
    
    System.out.println(binario + " en decimal es " + decimal);
  } 
}

