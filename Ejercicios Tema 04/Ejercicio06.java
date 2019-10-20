import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Cálculo del tiempo de caída de un objeto.");
		System.out.println("Introduce la altura en metros de la que caera el objeto: ");
		
		double h = s.nextDouble();
		
		final double g = 9.81;
		
		double t = Math.sqrt(2*h/g);
			
		System.out.printf("El objeto tardará en caer %.2f segundos.", t);
	}

}
