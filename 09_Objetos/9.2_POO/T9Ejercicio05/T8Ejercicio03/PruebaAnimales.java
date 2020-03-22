/**
 * Prueba las clases implementadas en el Ejercicio 3.
 * @author Javier Luque Rodríguez
 */

public class PruebaAnimales {
  
  public static void main(String[] args) {
    
    Gato chiqui = new Gato(Sexo.HEMBRA, "albina");
    chiqui.caza();
    chiqui.corre();
    
    Perro daniela = new Perro(Sexo.HEMBRA, "Perro de Agua");
    daniela.ladra();
    
    Canario rigoberto = new Canario(Sexo.MACHO);
    rigoberto.pia();
    rigoberto.canta();
    
    Pinguino riquitin = new Pinguino(Sexo.MACHO);
    riquitin.come("pescado");
    riquitin.duerme();
    riquitin.formacionPinguino();
    
    Lagarto antonia = new Lagarto();
    antonia.solecito();
    antonia.huye();
    
    
  }
}
