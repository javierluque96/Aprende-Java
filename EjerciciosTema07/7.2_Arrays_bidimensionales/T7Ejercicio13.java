public class T7Ejercicio13 {
  
  public static void main (String[] args) {
    String [] pais = new String [4];
    int [][] estatura = new int [4][10];
    int maximo = 139;
    int minimo = 211;
    int suma = 0;
    int x, y;
    
    pais[0] = "España";
    pais[1] = "Rusia";
    pais[2] = "Japón";
    pais[3] = "Australia";
    
    System.out.printf("%62s MED  MIN  MAX\n", " ");
    
    for (y = 0; y < 4; y++) {
      maximo = 139;
      minimo = 211;
      suma = 0;
      
      System.out.printf("%9s:", pais[y]);
      
      for (x = 0; x < 10; x++) {
	estatura[y][x] = (int)(Math.random() * 71 + 140);
	System.out.printf("%5d", estatura[y][x]);
	
	if (estatura[y][x] > maximo) {
	  maximo = estatura[y][x];
	}
	if (estatura[y][x] < minimo) {
	  minimo = estatura[y][x];
	}
	
	suma += estatura[y][x];
      }
      
      System.out.printf("|%5d%5d%5d\n", suma / 10, minimo, maximo);
      
    }
  } 
}

