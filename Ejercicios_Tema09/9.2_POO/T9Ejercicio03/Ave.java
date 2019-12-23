/**
 * Ave.java
 * @author Javier Luque Rodríguez
 */

public abstract class Ave extends Animal{

  public Ave() {
    super(Sexo.HEMBRA);
  }
  
  public Ave(Sexo s) {
    super(s);
  }
  
  public void ponHuevo() {
    if (this.getSexo() == Sexo.HEMBRA) {
      System.out.println("Estoy poniendo un huevo");
    } else {
      System.out.println("Lo siento, soy macho y no puedo poner huevos");
    }
  }
  
  public void vuela() {
    System.out.println("Volando");
  }
  
  public void aletea() {
    System.out.println("Aleteando");
  }
}
