public class Ejercicio18 {
  
  public static void main (String[] args) {
    System.out.println("Genera tres colores aleatorios diferentes.\n");
    
    int color;
    int color1 = 7;
    int color2 = 8; 
    int color3 = 9;
    boolean repetir;
    
    for (int i = 0; i < 3; i++) {
      
      do{
	repetir = false;
	color = (int)(Math.random() * 6);
	if (i == 0){
	  color1 = color;
	} else if (i == 1 && color != color1) {
	  color2 = color;
	} else if (i == 2 && color1 != color2 && color != color2 &&  
	  color != color1) {
	  color3 = color;
	} else {
	  repetir = true;
	}
      } while (repetir == true);
      
      switch (color) {
	case 0:
	  System.out.print("rojo ");
	  break;
	case 1:
	  System.out.print("azul ");
	  break;
	case 2:
	  System.out.print("verde ");
	  break;
	case 3:
	  System.out.print("amarillo ");
	  break;
	case 4:
	  System.out.print("violeta ");
	  break;
	case 5:
	  System.out.print("naranja ");
	  break;
	default:
      }
     
    }
  } 
}

