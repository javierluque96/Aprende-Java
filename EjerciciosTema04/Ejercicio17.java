package ejercicioT4;

import javax.swing.JOptionPane;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número "
				+ "entero:"));
		
		System.out.println("El número introducido es " + num + ".");
		
		num = num%10;
		
		System.out.println("La última cifra del número introducido es " + num);
	}

}
