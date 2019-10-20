

public class Ejercicio23 {
	
  public static void main (String[] args) {
    
    double base;
    double impuesto = 0;
    double precioIva = 0;
    double precioPromo = 0;
    double precioFinal = 0;
    String iva, promo;
    
    //Introducimos los valores de las variables
    System.out.println("Introduzca la base imponible:");
    base = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduzca el tipo de IVA (general, reducido o"
      + " superreducido):");
    iva = System.console().readLine();
      
    System.out.println("Introduzca el codigo promocional (nopro, mitad, meno5 "
      + "o 5porc):");
    promo = System.console().readLine();
    
    //Calculamos los precios con IVA
    if(iva.equalsIgnoreCase("general")){
      impuesto = base * 0.21;
      precioIva = base + impuesto;
      iva = "IVA(21%)";
      
    } else if(iva.equalsIgnoreCase("reducido")){
      impuesto = base * 0.1;
      precioIva = base + impuesto;
      iva = "IVA(10%)";
      
    } else if(iva.equalsIgnoreCase("superreducido")){
      impuesto = base * 0.04;
      precioIva = base - impuesto;
      iva = "IVA(4%)";
      
    } else{
      System.out.println("¡¡ERROR: IVA MAL INTRODUCIDO!!");
      System.exit(0);
    }
    
    // Precios con la promoción
    if(promo.equalsIgnoreCase("mitad")){
      precioPromo = precioIva / 2;
      precioFinal = precioIva - precioPromo;
      
    } else if(promo.equalsIgnoreCase("meno5")){
      precioPromo = 5;
      precioFinal = precioIva - precioPromo;
      
    } else if(promo.equalsIgnoreCase("5porc")){
      precioPromo = precioIva * 0.05;
      precioFinal = precioIva - precioPromo;
      
    } else if(promo.equalsIgnoreCase("nopro")){
      precioPromo = 0;
      precioFinal = precioIva - precioPromo;
      
    } else{
      System.out.println("¡¡CODIGO DE PROMOCION ERRONEO!!");
      System.exit(0);
    }
    //Se podría alinear de una forma mas elegante que añadir espacios?
  System.out.printf("\nBase imponible \t%12.2f\n", base);
  System.out.printf("%-8s \t%12.2f\n", iva, impuesto);
  System.out.printf("Precio con IVA \t%12.2f\n", precioIva);
  System.out.printf("Cod. promo (%5s)   -%6.2f\n", promo, precioPromo);
  System.out.printf("TOTAL                 %6.2f", precioFinal);
    
  }
}

