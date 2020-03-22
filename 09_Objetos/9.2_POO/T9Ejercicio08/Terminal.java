/**
 * Terminal.java
 * 
 * @author Javier Luque Rodríguez
 * 
 * Implementa la clase Terminal . Un terminal tiene asociado un número. Los terminales se pueden 
 * llamar unos a otros y el tiempo de conversación corre para ambos. A continuación se proporciona 
 * el contenido del main y el resultado que debe aparecer por pantalla.
 * Programa principal:
 * Terminal t1 = new Terminal("678 11 22 33");
 * Terminal t2 = new Terminal("644 74 44 69");
 * Terminal t3 = new Terminal("622 32 89 09");
 * Terminal t4 = new Terminal("664 73 98 18");
 * System.out.println(t1);
 * System.out.println(t2);
 * t1.llama(t2, 320);
 * t1.llama(t3, 200);
 * System.out.println(t1);
 * System.out.println(t2);
 * System.out.println(t3);
 * System.out.println(t4);
 */
public class Terminal {
  
  private String numero;
  private int segundos;
  
  public Terminal(String num) {
    this.numero = num;
    this.segundos = 0;
  }
  
  public String toString() {
    return "Nº " + this.numero + " - " + this.segundos + "s de conversación";
  }
  
  public void llama(Terminal t, int s) {
    this.segundos += s;
    t.segundos += s;
  }
}
