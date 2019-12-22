/**
 * Movil.java
 * @author Javier Luque Rodríguez
 * 
 * Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
 * anterior que ya no hace falta modificar). Cada móvil lleva asociada una tarifa
 * que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6, 12 y
 * 30 céntimos respectivamente. Se tarifican los segundos exactos. Obviamente,
 * cuando un móvil llama a otro, se le cobra al que llama, no al que recibe la
 * llamada. A continuación se proporciona el contenido del main y el resultado
 * que debe aparecer por pantalla. Para que el total tarificado aparezca con dos
 * decimales, puedes utilizar DecimalFormat .
 */
import java.text.DecimalFormat; 

public class Movil extends Terminal {
  
  private String tarifa;
  private double total;
  
  public Movil(String numero, String tarifa) {
    super(numero);
    this.tarifa = tarifa;
    this.total = 0;
  }
  
  @Override
  public void llama(Terminal t, int s) {
    super.llama(t, s);
    double minutos = (double) s / 60;
    
    switch (this.tarifa) {
      case "rata":
	this.total += minutos * 0.06;
	break;
      case "mono":
	this.total += minutos * 0.12;
	break;
      case "bisonte":
	this.total += minutos * 0.30;
	break;
      default:
    }
  }
  
  @Override
  public String toString() {
    DecimalFormat euros = new DecimalFormat("0.00");
    
    return "Nº " + this.getNumero() + " - " + this.getSegundos() + "s de conversación - " 
      + euros.format(this.total) + "€";
  }
  
}
