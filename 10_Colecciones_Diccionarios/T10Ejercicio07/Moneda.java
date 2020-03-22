/**
 * @author Javier Luque Rodríguez
 */
public class Moneda {
  
  private String[] posiciones = {"Cara", "Cruz"};
  private String[] monedas = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", 
    "20 céntimos", "50 céntimos", "1 euro", "2 euros"};
  private String posicion;
  private String moneda;
  
  public Moneda() {
    this.posicion = posiciones[(int)(Math.random() * 2)];
    this.moneda = monedas[(int)(Math.random() * 8)];
  }
  
  public String toString() {
    return moneda + "--" + posicion;
  }
  
  public String getPosicion() {
    return posicion;
  }
  
  public String getMoneda() {
    return moneda;
  }
}
