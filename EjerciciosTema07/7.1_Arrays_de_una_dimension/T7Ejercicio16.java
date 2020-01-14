public class T7Ejercicio16 {
  
  public static void main (String[] args) {
    int[] num = new int[20];
    int i;
    int opcion;
    
    for (i = 0; i < 20; i++) {
      num[i] = (int)(Math.random() * 401);
      System.out.print(num[i] + "  ");
      
    }
    
    System.out.print("\n¿Qué números quiere resaltar? (1 - los múltiplos de 5,"
      + " 2 - los múltiplos de 7): ");
    
    switch (Integer.parseInt(System.console().readLine())) {
      case 1: // Multiplos de 5
	for (i = 0; i < 20; i++) {
	  if (num[i] % 5 == 0) {
	    System.out.print("[" + num[i] + "]  ");
	  } else {
	    System.out.print(num[i] + "  ");
	  }
	}
	break;
	
      case 2: // Multiplos de 7
	for (i = 0; i < 20; i++) {
	  if (num[i] % 7 == 0) {
	    System.out.print("[" + num[i] + "]  ");
	  } else {
	    System.out.print(num[i] + "  ");
	  }
	}
	break;
      
      default:
    }
  } 
}

