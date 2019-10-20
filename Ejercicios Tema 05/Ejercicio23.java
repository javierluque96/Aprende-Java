public class Ejercicio23 {
	
  public static void main (String[] args) {
    int suma = 0;
    int n;
    int contador = 0;
    double media;
    
    System.out.println("Este programa te permite introducir numeros hasta que "
      + "la suma de los numeros no supere el valor de 10,000.");
      
    while(suma < 10000){
      System.out.println("Introduce un numero entero.");
      n = Integer.parseInt(System.console().readLine());
      
      suma += n;
      contador++;
    }
    media = suma / contador;
    
    System.out.println("El valor total es " + suma + "\nSe han introducido " 
      + contador + " numeros.\nLa media es " + media);
  }
}

