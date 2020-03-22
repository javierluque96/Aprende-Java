public class Ejercicio1 {
	
	public static void main (String args[]) {
		
    String num;
    System.out.println("Introduzca el primer número");
    num = System.console().readLine();
    int num1 = Integer.parseInt(num);
    
    System.out.println("Introduzca el segundo número");
    int num2 = Integer.parseInt(System.console().readLine());
    
    int mul = num1 * num2;
    
    System.out.println("\nLa multiplicación da... " + mul);
    
	}
}

