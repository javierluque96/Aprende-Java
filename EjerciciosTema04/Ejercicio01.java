package ejercicioT4;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce el día de la semana:");

		//Entrada del día de la semana
		String dia = s.nextLine();
		
		//Te dice la asignatura que tienes a primera hora ese día
		if(dia.equalsIgnoreCase("Lunes")) {
			System.out.println("Tienes ED a primera hora.");
		} else if(dia.equalsIgnoreCase("martes") || dia.equalsIgnoreCase("miercoles")
			|| dia.equalsIgnoreCase("jueves")) {
			
			System.out.println("Tienes PRO a primera hora.");
			
		} else if(dia.equalsIgnoreCase("viernes")){
			System.out.println("Tienes FOL a primera.");
		} else {
			System.out.println("Ese día no tienes clase majo.");
		}
		
		s.close();
	}
}
