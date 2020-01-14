package ejercicioT4;

import javax.swing.JOptionPane;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número "
				+ "entero con cinco cifras como máximo:"));
		System.out.println("El número introducido es " + num + ".");
		
		if(num < 100000 && num > 9999) {
			num = 5;
			
		} else if(num < 10000 && num > 999) {
			num = 4;
			
		} else if(num < 1000 && num > 99) {
			num = 3;
			
		} else if(num < 100 && num > 9) {
			num = 2;
			
		} else if(num < 10){
			num = 1;
			
		} else {
			System.out.println("El número introducido es erróneo.");
			System.exit(0);
		}
		
		System.out.printf("El número introducido tiene %d cifras.", num);
	}

}
