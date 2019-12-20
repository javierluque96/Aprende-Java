/**
 * Ejercicio 4 --> Fraccion.java
 * @author Javier Luque Rodríguez
 */

public class Fraccion {
  
  // Atributos de la instancia
  private int signo;
  private int numerador;
  private int denominador;
  
  // Constructor
  public Fraccion(int n, int d) {
    
    if (d == 0) {
      System.out.println("Una fracción no puede tener denominador igual a 0.");
    } else {
      this.numerador = Math.abs(n);
      this.denominador = Math.abs(d);
      
      if (n * d >= 0) {
	this.signo = +1;
      } else {
	this.signo = -1;
      }
    }
  }
  
  // Metodos: invierte , simplifica , multiplica , divide , etc.
  public int getNumerador() {
    return this.numerador;
  }
  
  public int getDenominador() {
    return this.denominador;
  }
  
  public String toString() {
    if (signo < 0) {
      return "-" + this.numerador + "/" + this.denominador;
    } else {
      return this.numerador + "/" + this.denominador;
    }
  }
  
  public Fraccion invierte() {
    return new Fraccion(this.signo * this.denominador, this.numerador);
  }
  
  public Fraccion multiplica(Fraccion f) {
    return new Fraccion(f.signo * f.numerador * this.numerador * this.signo, f.denominador
      * this.denominador);
  }
  
  public Fraccion divide(Fraccion f) {
    return new Fraccion(f.signo * this.signo * this.numerador * f.denominador, 
      f.numerador * this.denominador);
  }
  
  public Fraccion simplifica() {
    int s = this.signo;
    int n = this.numerador;
    int d = this.denominador;
    
    for (int i = 2; i < Math.min(n, d); i++) {
      while ((n % i == 0) && (d % i == 0)) {
	n /= i;
	d /= i;
      }
    }
    
    return new Fraccion(s * n, d);
  }
}
