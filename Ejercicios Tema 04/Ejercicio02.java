package ejercicioT4;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
		
		System.out.println("¿Qué hora es?");
		int hora = s.nextInt();
		
		//
		if(hora > 5 && hora < 13) {
			System.out.println("BUENOS DÍAS CHAVALEEEE!");
		} else if(hora > 12 && hora < 21) {
			System.out.println("BUENAS TARDES, AMONOOO.");
		} else if((hora > 20 && hora < 25) || (hora >=0 && hora < 6)){
			System.out.println("BUENAS NOCHES, HASTA MAÑANA LOOS LUNIS...");
		} else {
			System.out.println("No sabía yo que el día tenía tantas horas baia baia...");
		}
	}

}
