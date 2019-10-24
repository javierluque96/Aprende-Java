public class Ejercicio11 {
  
  public static void main (String args[]) {
    int notas;
    int i;
    for (i = 0; i < 20; i++) {
      notas = (int)(Math.random() * 10) + 1;
      
      switch (notas) {
	case 1:
	case 2:
	case 3:
	case 4:
	  System.out.println("Suspenso");
	  break;
	case 5:
	  System.out.println("Suficiente");
	  break;
	case 6:
	  System.out.println("Bien");
	  break;
	case 7:
	case 8:
	  System.out.println("Notable");
	  break;
	case 9:
	case 10:
	  System.out.println("Sobresaliente");
	  break;
	default:
      }
    }
  }
}
