import javax.swing.JOptionPane;

public class Ejercicio20 {

    public static void main(String[] args) {
		
      System.out.println("Este programa comprueba si el numero es capicua");
      
      int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un " 
	+ "número con cinco cifras como máximo:"));
      
      System.out.println("El número introducido es " + num + ".");
		
      boolean capicua = false;

      //Números de 5 cifras		5abc5
      if(num < 100000 && num > 9999) {
			
      if(((num / 10000) == (num % 10)) && 
	(((num / 1000) % 10) == ((num / 100) % 10) &&
	((num / 100) % 10) == ((num /10) % 10))) {
	capicua = true;
      }
		
      //Números de 4 cifras	4ab4
      } else if(num < 10000 && num > 999) {
			
      if(((num / 1000) == (num % 10)) && 
	(((num / 100) % 10) == ((num / 10) % 10))) {
	capicua = true;
      } 
		
      //Números de 3 cifras
      } else if(num < 1000 && num > 99) {
      
      if((num / 100) == (num % 10)) {
	capicua = true;
      }
			
      //Números de 2 cifras	
      } else if (num < 100 && num >= 10) {
			
      if((num / 10) == (num % 10)) {
	capicua=true;
      }
			
      } else {
	System.out.println("El número introducido es erróneo.");
	System.exit(0);
      }
		
      if(capicua) {
	System.out.println("El número es CAPICÚA.");
      } else {
	System.out.println("El número NO es CAPICÚA.");
	}
    }

}
