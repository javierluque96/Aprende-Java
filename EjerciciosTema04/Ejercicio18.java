package ejercicioT4;

import javax.swing.JOptionPane;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número "
				+ "entero con cinco cifras como máximo:"));
		System.out.println("El número introducido es " + num + ".");
		
		if(num < 100000 && num > 9999) {
			num = num / 10000;
			
		} else if(num < 10000 && num > 999) {
			num = num / 1000;
			
		} else if(num < 1000 && num > 99) {
			num = num / 100;
			
		} else if(num < 100 && num > 9) {
			num = num / 10;
			
		} else {
			System.out.println("El número introducido es erróneo.");
			System.exit(0);
		}
		
		System.out.println("La primera cifra del número introducido es " + num);
	}

}
