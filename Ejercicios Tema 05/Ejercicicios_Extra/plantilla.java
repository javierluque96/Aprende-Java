public class ExtraBucles3 {
  
  public static void main (String[] args) {
    System.out.println("");
    
    int altura;
    boolean error = false;
    
    do {
      System.out.print("Introduce la altura  ");
      
      
      System.out.print(" ");
      
    
      if ((fila > 6) || (fila < 2) || (altura < 3)) {
	error = true;
      }
    } while (!error);
  } 
}

