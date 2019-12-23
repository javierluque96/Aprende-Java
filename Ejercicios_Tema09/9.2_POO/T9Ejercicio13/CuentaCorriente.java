/**
 * CuentaCorriente.java
 * Ejercicio 13.
 * @author Javier Luque Rodríguez
 * Implementa la clase CuentaCorriente. Cada cuenta corriente tiene un número de cuenta de 10 
 * dígitos. Para simplificar, el número de cuenta se genera de forma aleatoria cuando se crea una 
 * cuenta nueva. La cuenta se puede crear con un saldo inicial; en caso de no especificar saldo, se 
 * pondrá a cero inicialmente. En una cuenta se pueden hacer ingresos y gastos. También es posible 
 * hacer una transferencia entre una cuenta y otra. Se permite el saldo negativo.
 */
public class CuentaCorriente {
  
  private String numero = "";
  private double saldo = 0;
  
  public CuentaCorriente() {    
    this.generaNum();
  }
  
  public CuentaCorriente(int saldo) {
    this.saldo = saldo;
    this.generaNum();
  }
  
  private void generaNum() {    
    for (int i = 0; i < 10; i++) {
      numero += (int)(Math.random() * 10);
    }
  }
  
  public String toString() {
    return "Número de cuenta: " + this.numero + " - Saldo: " + String.format("%.2f", this.saldo) 
      + "€.";
  }
  
  public void cargo(int c) {
    this.saldo -= c;
  }
  
  public void ingreso(int ing) {
    this.saldo += ing;
  }
  
  public void transferencia(CuentaCorriente c, int cantidad) {
    c.saldo += cantidad;
    this.saldo -= cantidad;
  }
  
}
