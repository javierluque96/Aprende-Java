

public class ejercicio4 {
	
    public static void main (String args[]) {
		
      System.out.println("Introduce el primer número.");
      String num = System.console().readLine();
      int num1 = Integer.parseInt(num);
    
      System.out.println("Introduce el segundo número");
      int num2 = Integer.parseInt(System.console().readLine());
    
      int suma = num1 + num2;
      int resta = num1 - num2;
      int mul = num1 * num2;
      float div = num1 / num2;
    
      System.out.println("Suma = " + suma + "\nResta = " + resta 
	+ "\nMultiplicación = " + mul + "\nDivisión = " + div);
    
	}
}

