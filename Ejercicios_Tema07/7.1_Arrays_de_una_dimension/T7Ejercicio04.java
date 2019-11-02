public class T7Ejercicio04 {
  
  public static void main (String[] args) {
    int [] numero = new int [20];
    int [] cuadrado = new int [20];
    int [] cubo = new int [20];
    int i;
    
    for (i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random() * 101);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = numero[i] * numero[i] * numero[i];
    }
    
    System.out.println("|-----------------------|");
    System.out.println("|  n  |  n*n  |  n*n*n  |");
    System.out.println("|-----------------------|");
    
    for (i = 0; i < 20; i++) {
      System.out.printf("| %3d | %5d | %7d |\n", numero[i], cuadrado[i], 
	cubo[i]);
    }
    
    System.out.println("|-----------------------|");
  } 
}

