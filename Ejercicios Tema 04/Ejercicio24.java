//Programa que genera la nómina de un empleado bien desglosada
public class Ejercicio24 {
  public static void main (String[] args) {
    
    int cargo, diasViaje, estadoCivil;
    int irpf = 0;
    double sueldoBruto, dietas;
    double sueldoBase = 0;
    double retencion = 0;
    
    System.out.println("1 - Programador junior \n2 - Programador senior\n" 
      + "3 - Jefe de proyecto \nIntroduzca el cargo del empleado (1-3):");
    cargo = Integer.parseInt(System.console().readLine());
    
    System.out.println("¿Cuantos dias ha estado de viaje visitando clientes?");
    diasViaje = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado):");
    estadoCivil = Integer.parseInt(System.console().readLine());
    
    switch(cargo){
      case 1: // Programador Junior
	sueldoBase = 950;
	break;
      
      case 2: // Programador Senior
	sueldoBase = 1200;
	break;
      
      case 3: // Jefe de Proyecto
	sueldoBase = 1600;
	break;
      default:
	System.out.println("No ha elegido correctamente el cargo que ocupa.");
    }
  
  dietas = diasViaje * 30;
  
  sueldoBruto = sueldoBase + dietas;
  
    switch(estadoCivil){ 
      case 1: // Soltero
	retencion = sueldoBruto * 0.25;
	irpf = 25;
	break;
      
      case 2: // Casado
      	retencion = sueldoBruto * 0.2;
	irpf = 20;
	break;
      
      default:
	System.out.println("No ha elegido correctamente el Estado Civil.");
    }
  
  // Muestra la nomina desglosada
  System.out.println("------------------------------------------");
  System.out.printf("|Sueldo base \t\t\t %8.2f|\n", sueldoBase);
  System.out.printf("|Dietas(%2d viajes) \t\t   %6.2f|\n", diasViaje, dietas);
  System.out.println("|----------------------------------------|");
  System.out.printf("|Sueldo bruto \t\t\t %8.2f|\n", sueldoBruto);
  System.out.printf("|Retencion IRPF (%2d%%) \t\t   %6.2f|\n", irpf, retencion);
  System.out.println("|----------------------------------------|");
  System.out.printf("|Sueldo neto \t\t\t %8.2f|\n", sueldoBruto - retencion);
  System.out.println("------------------------------------------");
  }
}

