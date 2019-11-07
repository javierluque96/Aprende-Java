public class T7Ejercicio14 {
  
  public static void main (String[] args) {
    String[] palabras = new String[8];
    String[] resultado = new String[8];
    String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa",
      "negro", "blanco", "morado"};
    int i;
    int indiceResultado = 0;
    boolean esColor = false;
    
    System.out.println("Introduce ocho palabras, si es un color el programa "
      + "los colocará al principio. Los colores almacenados son: verde, rojo, "
      + "azul, amarillo, naranja, rosa, negro, blanco y morado.");
    
    for (i = 0; i < 8; i++) {
      palabras[i] = System.console().readLine();
      
      // Si la palabra es un color lo introduce en el array resultado
      for (String c : colores) {
	if(palabras[i].equals(c)) {
	  resultado[indiceResultado++] = palabras[i];
	}
      }
    }
    
    for (i = 0; i < 8; i++) {
      esColor = false;
      // Identifica si la palabra es un color
      for (String c : colores) {
	if(palabras[i].equals(c)) {
	  esColor = true;
	}
      }
      // Si no es un color lo introduce en el array resultado
      if(!esColor) {
	resultado[indiceResultado++] = palabras[i];
      }
    }
    
    // Imprime el array original
    System.out.print("\nArray Original: \n");
    for (i = 0; i < 73; i++){
      System.out.print("-");
    }
    
    System.out.print("\n|");
    for (i = 0; i < 8; i++) {
      System.out.printf("%8d|", i);
    }
    
    System.out.println();
    for (i = 0; i < 73; i++){
      System.out.print("-");
    }
    
    System.out.print("\n|");
    for (i = 0; i < 8; i++) {
      System.out.printf("%8s|", palabras[i]);
    }
    
    System.out.println();
    for (i = 0; i < 73; i++){
      System.out.print("-");
    }
    
    // Imprime el array resultado
    System.out.print("\n\nArray Resultado: \n");
    for (i = 0; i < 73; i++){
      System.out.print("-");
    }
    
    System.out.print("\n|");
    for (i = 0; i < 8; i++) {
      System.out.printf("%8d|", i);
    }
    
    System.out.println();
    for (i = 0; i < 73; i++){
      System.out.print("-");
    }
    
    System.out.print("\n|");
    for (i = 0; i < 8; i++) {
      System.out.printf("%8s|", resultado[i]);
    }
    
    System.out.println();
    for (i = 0; i < 73; i++){
      System.out.print("-");
    }
  } 
}

