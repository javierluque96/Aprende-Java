import java.util.Scanner;

public class ejercicio3 {
	
	public static void main (String args[]) {
		
    //Conversor Pesetas a Euros
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce el número de PESETAS que quiere pasar a EUROS");
    float pesetas = s.nextFloat();
    
    float euros = pesetas / 166.386f;
    
    System.out.println(pesetas + " Pesetas son " + euros + " Euros.");
	}
}

