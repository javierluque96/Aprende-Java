public class Ejercicio09 {
	
  public static void main (String[] args) {
    int i = 0; 
    int input, numInicial;
    
    System.out.println("Este programa calcula cuantos digitos tiene el numero "
      + "introducido.");
    System.out.println("Introduce un numero:");
    input = Integer.parseInt(System.console().readLine());
    
    numInicial = input;
    
    if(input == 0){
      i++;
      
    } else{
      while(input > 0){
	input = input / 10;
	i++;
      }
    }
    System.out.println(numInicial + " tiene " + i + " digitos.");
  }
}

