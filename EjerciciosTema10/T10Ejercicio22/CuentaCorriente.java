import java.util.ArrayList;
/**
 * @author Javier Luque Rodríguez
 * 
 * Amplía el ejercicio 13 del capítulo anterior que implementaba cuentas corrientes de un banco de 
 * tal forma que cada cuenta lleve un registro de todos los movimientos realizados: ingresos, 
 * cargos y transferencias (tanto enviadas como recibidas).
 */
public class CuentaCorriente {

  private String numero = "";
  private double saldo;
  private ArrayList<String> movimientos = new ArrayList<>();

  public CuentaCorriente() {
    this.generaNumero();
  }

  public CuentaCorriente(double saldo) {
    this.generaNumero();
    this.saldo = saldo;
  }

  private void generaNumero() {
    for (int i = 0; i < 10; i++) {
      numero += (int) (Math.random() * 10);
    }
  }

  @Override
  public String toString() {
    return "Número de cta: " + numero + " Saldo: " + String.format("%.2f", saldo) + " €";
  }

  public void ingreso(double dinero) {
    saldo += dinero;
    
    movimientos.add("Ingreso de " + String.format("%.2f", dinero) + "€  " + "Saldo: " 
      + String.format("%.2f", saldo) + "€");
  }
  
  public void cargo(double dinero) {
    saldo -= dinero;
    
    movimientos.add("Cargo de " + String.format("%.2f", dinero) + "€  " + "Saldo: " 
      + String.format("%.2f", saldo) + "€");
  }

  public void transferencia(CuentaCorriente cuentaDestino, double dinero) {
    saldo -= dinero;
    cuentaDestino.saldo += dinero;
    
    movimientos.add("Transf. emitida de " + String.format("%.2f", dinero) + "€ a la cuenta " 
      + cuentaDestino.numero + "  Saldo: " + String.format("%.2f", saldo) + "€");
    
    cuentaDestino.movimientos.add("Transf. recibida de " + String.format("%.2f", dinero) 
      + "€ de la cuenta " + cuentaDestino.numero + "  Saldo: " 
      + String.format("%.2f", cuentaDestino.saldo) + "€");
  }
  
  public void movimientos() {
    System.out.println("Movimientos de la cuenta " + numero 
      + "\n-----------------------------------");
      
    for (String m : movimientos) {
      System.out.println(m);
    }
  }
}
