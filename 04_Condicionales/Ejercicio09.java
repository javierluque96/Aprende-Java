import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Calculadora de ecuaciones de segundo grado\n"
				+ "ax^2 + bx + c = 0");
		
		//Introducimos los parametros de la ecuación
		
		System.out.println("Introduce el parametro a: ");
		double a = s.nextDouble();
		
		System.out.println("Introduce el parametro b: ");
		double b = s.nextDouble();
		
		System.out.println("Introduce el parametro c: ");
		double c = s.nextDouble();
		
		double x1,x2;
		
		//Calcula la raiz cuadrada para b=0 y para el resto de opciones
		if(b == 0) {
			
			x1 = Math.sqrt(-c / a);
			x2 = -x1;
			System.out.println("x1 = " + x1 + "\nx2 = " + x2);
			
		} else {
			x1 = (-b + Math.sqrt(b*b - 4*a*c)) / 2*a;
			x2 = (-b - Math.sqrt(b*b - 4*a*c)) / 2*a;
			
			System.out.println("x1 = " + x1 + "\nx2 = " + x2);	
		}
	}

}
