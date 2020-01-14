import java.util.Scanner;

public class Ejercicio07y08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Cálculo de la media de tres notas.");
		
		//Introducimos por teclado las tres notas
		System.out.println("Introduce la primera nota:");
		float nota1 = s.nextFloat();
		
		System.out.println("Introduce la segunda nota:");
		float nota2 = s.nextFloat();
		
		System.out.println("Introduce la tercera nota:");
		float nota3 = s.nextFloat();
		
		//Calcula la media de las tres notas y la imprime por pantalla
		float notaMedia = (nota1 + nota2 + nota3)/3f;
		
		System.out.printf("La nota media es de %.2f\n", notaMedia);
		
		//Tranforma la nota media en insufienciente, suficiente, bien, etc.
		if(notaMedia < 5) {
			System.out.println("Insuficiente");
		} else if(notaMedia == 5) {
			System.out.println("Suficiente");
		} else if(notaMedia == 6) {
			System.out.println("Bien");
		} else if(notaMedia > 6 && notaMedia <9) {
			System.out.println("Notable");
		} else if(notaMedia > 8 && notaMedia < 11) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Nota no contemplada.");
		}
	}

}
