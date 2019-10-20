import java.util.Scanner;
public class ejercicio12 {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce la nota del primer examen:");
    float primerEx = s.nextFloat();
    
    System.out.println("Introduce la nota que quieres obtener:");
    float mediaDes = s.nextFloat();
    
    float segundoEx = (mediaDes - 0.4f * primerEx) / 0.6f;
    
    System.out.println("Para sacar un " + mediaDes + " tienes que sacar un " + 
    segundoEx);
	}
}

