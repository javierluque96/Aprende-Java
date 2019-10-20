// Escribe un programa que lea una lista de diez números y determine cuántos
// son positivos, y cuántos son negativos.
public class Ejercicio13 {
	
  public static void main (String[] args) {
    int pos = 0; 
    int neg = 0;
    int i = 0;
    int n;

    
    System.out.println("Introduce diez numeros y el programa te dira cuantos "
      + "numeros positivos y negativos has introducido.");    
    
      
    while(i < 10){
      System.out.println("Introduce un numero: ");
      n = Integer.parseInt(System.console().readLine());
      i++;
      
      if(n >= 0){
	pos++;
	
      } else{
	neg++;
	
      }
    }
    
    System.out.println("Has introducido " + pos + " numeros positivos y "
      + neg + " numeros negativos.");

  }
}

