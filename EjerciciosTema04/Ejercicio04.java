import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca el número de hora trabajas durante la"
				+ " semana");
		
		int horas = s.nextInt();
		int sueldo;
		
		//Calcula el sueldo en función de las horas introducidas.
		if(horas < 41) {
			
			sueldo = horas * 12;
			System.out.println("El sueldo semanal que le corresponde es: " + sueldo);
		} else if(horas > 40) {
			
			sueldo = horas * 16;
			System.out.println("El sueldo semanal que le corresponde es: " + sueldo);
		}
	}

}
