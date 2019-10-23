public class Ejercicio10 {
  
  public static void main (String[] args) {
    int i, j;
    int longitudLinea;
    int c;
    String caracter = "";
    
    
    for (i = 0; i < 10; i++) {
      longitudLinea = (int)(Math.random()*40) + 1;
      
      c = (int) (Math.random() * 6) + 1;
      
      switch (c) {
	case 1:
	  caracter = "*";
	  break;
	case 2:
	  caracter = "-";
	  break;
	case 3:
	  caracter = "=";
	  break;
	case 4:
	  caracter = ".";
	  break;
	case 5:
	  caracter = "|";
	  break;
	case 6:
	  caracter = "@";
	  break;
      }
      
      for (j = 0; j < longitudLinea; j++) {
	System.out.print(caracter);
      }
      
      System.out.println();
    }
    
  } 
}

