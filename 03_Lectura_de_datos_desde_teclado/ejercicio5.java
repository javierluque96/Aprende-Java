public class ejercicio5 {
	
	public static void main (String args[]) {
		
    //Calculadora área rectángulo    
    
    System.out.println("Introduce la BASE del rectángulo: ");
    int num1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce la ALTURA del rectángulo:");
    int num2 = Integer.parseInt(System.console().readLine());
    
    System.out.println("El ÁREA del rectángulo es: " + num1 * num2);
	}
}

