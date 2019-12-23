/**
 * Gato.java
 * @author Javier Luque Ródríguez
 */
public class Gato extends Mamifero {
  private String raza;
  
  public Gato(Sexo s, String r) {
    super(s);
    this.raza = r;
  }
  
  public Gato(Sexo s) {
    super(s);
    this.raza = "indeterminada";
  }
  
  public Gato(String r) {
    super(Sexo.HEMBRA);
    this.raza = r;
  }
  
  public Gato() {
    super(Sexo.MACHO);
    this.raza = "indeterminada";
  }
  
  public void maulla() {
    System.out.println("Miaaaau");
  }
  
  public void bufa() {
    System.out.println("Ffffffffffffuuuuu");
  }
  
  public void caza() {
    System.out.println("Estoy cazando");
  }
  
  public void ronronea() {
    System.out.println("Prrrrrrmrrrrrmrrr");
  }
}


