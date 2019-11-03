public class T7Ejercicio08 {
  
  public static void main (String[] args) {
    int [] temperatura = new int [12];
    int i, j;
    String[] mes = {
      "enero", "febrero", "marzo", "abril", "mayo", "junio",
      "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };
    
    // Recoge las temperaturas
    for (i = 0; i < 12; i++) {
      System.out.print("Introduzca la temperatura media del mes " + mes[i]
	+ ": ");
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }
    
    // Imprime el diagrama de barras horizontal
    for (i = 0; i < 12; i++) {
      System.out.printf("\n%-11s|", mes[i]);
      
      for (j = 0; j < temperatura[i]; j++) {
	System.out.print("*");
      }
    }
    
    // Imprime los ejes
    System.out.println();
    for (i = 0; i < 70; i++) {
	System.out.print("-");
      }
    System.out.printf("\n|%3s%-7s| ", " ", "mes");
    System.out.printf("%33s%23s| ", "temperatura", " ");
  } 
}

