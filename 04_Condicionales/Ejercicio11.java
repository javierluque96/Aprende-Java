package ejercicioT4;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¿Cuánto tiempo falta para medianoche?");
		
		int hora = Integer.parseInt(JOptionPane.showInputDialog("Introduce la "
				+ "hora (0-24):"));
		int minutos = Integer.parseInt(JOptionPane.showInputDialog("Introduce los "
				+ "minutos (0-60):"));
		int horasRestantes, minutosRestantes;
		
		System.out.println("La hora introducida es: " + hora + ":" + minutos);
		
		if(hora<23 && minutos < 60) {
			horasRestantes = 24 - hora - 1;
			minutosRestantes = 60 - minutos;
			System.out.println("Faltan " + horasRestantes + " horas y " + 
					minutosRestantes + " minutos para medianoche.");
			
		} else if(hora == 23 && minutos <60) {
			minutosRestantes = 60 - minutos;
			System.out.println("Faltan " + minutosRestantes + " minutos para "
					+ "medianoche.");
		} else {
			System.out.println("Hora erronea.");
		}
	}

}
