import java.util.Scanner;
public class Ejercicio2 {
	
	public static void main (String args[]) {
		
    //Conversor euros a pesetas
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce el número de euros que quiere convertir a pesetas");
    float euros = s.nextFloat();
    
    float pesetas;
    pesetas= euros * 166.386f;
    
    System.out.println(pesetas);
    
    
	}
}

