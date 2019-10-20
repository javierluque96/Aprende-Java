import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Este programa resuelve ecuaciones de primer grado del tipo:"
				+ "\nax + b = 0");
		
		//Se introducen los valores de los parámetros de la ecuación
		System.out.println("Introduce el valor de a: ");
		float a = s.nextFloat();
		
		System.out.println("Introduce el valor de b: ");
		float b = s.nextFloat();
		
		//Calcula el resultado de la ecuación
		if(a != 0) {
			float x = -b / a;
			System.out.println("x = " + x);
		} else {
			System.out.println("Esa ecuación no tiene solución real.");
		}
	}

}
