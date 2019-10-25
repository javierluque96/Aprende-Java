public class Ejercicio15 {
  
  public static void main (String[] args) {
    int i, j;
    int nota;
    String notaMusical = "";
    int melodia = (int)(Math.random() * 7 + 1);
    
    // Genera entre 1 y 7 compases
    for (i = 1; i <= melodia; i++) {
      // Genera las cuatro notas musicales
      for (j = 0; j < 4; j++) {
	nota = (int)(Math.random() * 7 + 1);
	
	switch (nota) {
	  case 1:
	    notaMusical = "do";
	    break;
	  case 2:
	    notaMusical = "re";
	    break;
	  case 3:
	    notaMusical = "mi";
	    break;
	  case 4:
	    notaMusical = "fa";
	    break;
	  case 5:
	    notaMusical = "sol";
	    break;
	  case 6:
	    notaMusical = "la";
	    break;
	  case 7:
	    notaMusical = "si";
	    break;
	  default:
	}
	System.out.print(notaMusical + " ");
      }
      // Imprime || si estamos en el último compas
      if (i != melodia) {
	System.out.print("| ");
      } else {
	System.out.print("||");
      }
    }
  } 
}

