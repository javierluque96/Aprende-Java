/**
 * TarjetaRegalo.java
 * @author Javier Luque Rodríguez
 * Ejercicio 11.
 * La empresa El Corte Islandés nos ha encargado una aplicación para gestionar las tarjetas regalo. 
 * Como primer paso para implementar la aplicación, es necesario crear la clase principal. 
 * Implementa la clase TarjetaRegalo. Cuando se crea una nueva tarjeta, se le da un saldo y se 
 * asigna de forma automática un número de 5 dígitos. Si se intenta gastar más dinero del que tiene 
 * la tarjeta, se debe mostrar un mensaje de error. Dos tarjetas regalo se pueden fusionar creando 
 * una nueva tarjeta con la suma del saldo que tenga cada una y un nuevo número aleatorio de 5 
 * cifras. Al fusionar dos tarjetas en una, las dos tarjetas originales se quedarían con 0 € de 
 * saldo.
 */
import java.text.DecimalFormat;

public class TarjetaRegalo {
  
  private double saldo;
  private String id = "";
  
  public TarjetaRegalo(double saldo) {
    this.saldo = saldo;
    
    // Genera el nº de identificación
    for (int i = 0; i < 5; i++) {
      this.id += (int)(Math.random() * 10);
    }
  }
  
  public String toString() {
    DecimalFormat euros = new DecimalFormat("0.00");
    return "Tarjeta Nº " + this.id + " - Saldo " + euros.format(this.saldo) + "€";
  }
  
  public void gasta(double gasto) {
    if (gasto <= this.saldo) {
      this.saldo -= gasto;
    } else {      
      System.out.printf("Lo siento, no tienes saldo suficiente para gastar %.2f€\n", gasto);
    }
  }
  
  public TarjetaRegalo fusionaCon(TarjetaRegalo t) {
    TarjetaRegalo x = new TarjetaRegalo(this.saldo + t.saldo);
    this.saldo = 0;
    t.saldo = 0; 
    
    return x;
  }
  
}
