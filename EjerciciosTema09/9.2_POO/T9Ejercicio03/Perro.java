/**
 * Perro.java
 * @author Javier Luque Ródríguez
 */

public class Perro extends Mamifero {
  
  private String raza;
  
  public Perro() {
    super(Sexo.HEMBRA);
    this.raza = "indeterminado";
  }
  
  public Perro(Sexo s) {
    super(s);
    this.raza = "indeterminado";
  }
  
  public Perro(Sexo s, String r) {
    super(s);
    this.raza = r;
  }
  
  public void ladra() {
    System.out.println("Guau guau");
  }
  
  public void sienta() {
    System.out.println("Estoy sentado");
  }
  
  public void patita() {
    System.out.println("Te doy la patita, pero dame mi regalito");
  }
  
}
