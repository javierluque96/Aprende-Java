public class Ejercicio41 {
	
  public static void main (String[] args) {
    
    long num, aux;
    int digito = 0;
    int pares = 0;
    int impares = 0;
    
    System.out.println("Es programa cuenta los digitos pares e impares en un "
      + "número.");
    System.out.println("Introduce un número entero positivo:");    
    num = Long.parseLong(System.console().readLine());
    
    aux = num;
    
    while(num > 0){
      digito = (int) num % 10;
      num /= 10;
      
      if(digito % 2 == 0){
	pares++;
      } else{
	impares++;
      }
    }
    
    System.out.println("El " + aux + " contiene " + pares + " dígitos pares y "
      + impares + " dígitos impares.");
  }
}

