public class Ejercicio16 {
  
  public static void main (String[] args) {
    int figura;
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;
    int i;
    boolean ganar = false;
    
    System.out.print("Programa simulador de máquinas tragaperras.\n\n|");
    
    for (i = 0; i < 3; i++) {
      figura = (int)(Math.random() * 5) + 1;
      
      // Transforma el número aleatorio en figura
      switch (figura) {
	case 1:
	  System.out.print("| corazon |");
	  break;
	case 2:
	  System.out.print("| diamante |");
	  break;
	case 3:
	  System.out.print("| herradura |");
	  break;
	case 4:
	  System.out.print("| campana |");
	  break;
	case 5:
	  System.out.print("| limón |");
	  break;
	default:
      }
      
      // Almacena el valor de las figuras generadas en cada vuelta de bucle
      switch (i) {
	case 0:
	  figura1 = figura;
	  break;
	case 1:
	  figura2 = figura;
	  break;
	case 2:
	  figura3 = figura;
	  break;
      }
    }
    
    // Comprueba si las figuras son iguales o distintas
    if (figura1 == figura2 && figura1 == figura3) {
      System.out.println("|\nEnhorabuena, ha ganado 10 monedas.");
    } else if (figura1 != figura2 && figura2 != figura3 && figura1 != figura3) {
      System.out.println("|\nLo siento, has perdido.");
    } else {
      System.out.println("|\nBien, ha recuperado su moneda.");
    }
  } 
}

