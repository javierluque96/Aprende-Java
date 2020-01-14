/**
 * Mamifero.java
 * @author Javier Luque Ródríguez
 */

public abstract class Mamifero extends Animal {

  public Mamifero() {
    super();
  }
  
  public Mamifero(Sexo s) {
    super(s);
  }
  
  public void amamanta() {
    if (this.getSexo() == Sexo.HEMBRA) {
      System.out.println("Estoy alimentando a mi cría.");
    } else {
      System.out.println("Lo siento, pero no puedo alimentar a tus crías.");
    }
  }
  
  public void anda() {
    System.out.println("Andando");
  }
  
  public void corre() {
    System.out.println("Corriendo");
  }
}
