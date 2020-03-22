// Javier Luque Rodríguez
// Ejercicio sorpresa bucles 2 31/10/19  --> 18JLR
public class EjercicioSorpresaBucles2 {
  
  public static void main (String[] args) {
    double nota;
    int contador = 0;
    double suma = 0;
    double maximo = 0;
    double media;
    
    do {
      System.out.print("Introduzca la nota del examen: ");
      nota = Double.parseDouble(System.console().readLine());
      
      // Comprueba que el número este entre 0 y 10
      if (nota < 11 && nota >= 0) {
	suma += nota;
	contador++;
      }
      // Comprueba la nota máxima inferior a 5
      if (nota < 5 && nota > maximo) {
	maximo = nota;
      }
      
    } while(nota >= 0);
    
    media = suma / contador;
    
    // Si la media es inferior a 5, la media será la mayor nota inferior a 5
    if (media > maximo) {
      System.out.printf("\nMedia = %.2f", media);
    } else {
      System.out.printf("\nMedia = %.2f", (double)maximo);
    }
  } 
}

