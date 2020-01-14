/**
 * Pinguino.java
 * @author Javier Luque Ródríguez
 */
public class Pinguino extends Ave {

  public Pinguino() {
    super();
  }
  
  public Pinguino(Sexo s) {
    super(s);
  }
  
  public void saltaAlAgua() {
    System.out.println("Que fresquita que está el agua");
  }
  
  public void formacionPinguino() {
    System.out.println("Que calentito se está");
  }
  
  public void come(String comida) {
    if (comida.equalsIgnoreCase("pescado")) {
      System.out.println("Mmmmm esto está riquisimo");
    } else {
      System.out.println("Lo siento, soy un pingüino muy exquisito y solo como pescado.");
    }
  }
}
