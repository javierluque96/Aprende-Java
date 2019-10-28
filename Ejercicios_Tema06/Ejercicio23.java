public class Ejercicio23 {
  
  public static void main (String[] args) {
    System.out.println("Cinco tiradas de un dado de poker: ");
    
    int dado;
    int i;
    
    for (i = 0; i < 5; i++) {
      dado = (int)(Math.random() * 6);
      
      switch (dado) {
	case 0:
	  System.out.print("As ");
	  break;
	case 1:
	  System.out.print("K ");
	  break;
	case 2:
	  System.out.print("Q ");
	  break;
	case 3:
	  System.out.print("J ");
	  break;
	case 4:
	  System.out.print("7 ");
	  break;
	case 5:
	  System.out.print("8 ");
	  break;
	default:
      }
      
    }
  } 
}

