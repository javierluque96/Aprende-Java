public class ExtraBucles3 {
  
  public static void main (String[] args) {
    System.out.println("Adivina el número. PISTA: el número está entre el "
      + "0 y el 10.000.");
    
    int num = 1996;
    int adivina;
    int mayor = 10000;
    int menor = 0;
    boolean adivinado;
  
    
    do {
      adivinado = false;
      
      System.out.print("\nIntroduce un número: ");
      adivina = Integer.parseInt(System.console().readLine());
      
      if (adivina > num) {
	if ((mayor - num) > (adivina - num)) {
	  mayor = adivina;
	}
	
	System.out.println("\n" + adivina + " es más grande que el número a "
	  + "adivinar.\nNúmero mayor más cercano: " + mayor + "\nNúmero menor "
	    + "más cercano: " + menor);
	    
      } else if (adivina < num) {
	if ((num - menor) > (num - adivina)) {
	  menor = adivina;
	}
	
	System.out.println("\n" + adivina + " es más pequeño que el número a "
	  + "adivinar.\nNúmero mayor más cercano: " + mayor + "\nNúmero menor "
	    + "más cercano: " + menor);
	    
      } else {
	System.out.println("\n¡¡Enhorabuena, has acertado el número!!");
	adivinado = true;
      }
    } while (adivinado == false);
  } 
}

