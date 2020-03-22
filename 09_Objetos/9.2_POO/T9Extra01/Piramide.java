/**
 * @author Javier Luque Rodríguez
 */

public class Piramide {
  
  private int altura;
  private char caracter;
  
  public Piramide(int altura, char caracter) {
    this.altura = altura;
    this.caracter = caracter;
  }
  
  public String toString() {
    String pir = "";
    int j;
    int caracteres = 1;
    
    for (int i = altura; i > 0; i--) {
      for (j = 0; j < i - 1; j++) {
	pir += " ";
      }
      
      for (j = 0; j < caracteres; j++) {
	pir += this.caracter;
      }
      
      pir += "\n";
      caracteres += 2;
    }
    
    return pir;
  }
  
  public boolean aumentarAltura() {
    if (altura < 12) {
      this.altura++;
      return true;
    } else {
      return false;
    }
  }
  
  public boolean disminuirAltura() {
    if (altura > 1) {
      this.altura--;
      return true;
    } else {
      return false;
    }
  }
  
  public void setCaracter(char c) {
    this.caracter = c;
  }
}


