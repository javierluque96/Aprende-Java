import javax.sound.sampled.*;
/**
 * TONOS:
 * SILENCIO, DOB, DO, DOSOS, REB, RE, RESOS, MIB, MI, MISOS, FAB, FA, FASOS, SOLB, SOL, SOLSOS, LAB, 
 * LA, LASOS, SIB, SI, SISOS
 * 
 * FIGURAS:
 * CUADRADA, REDONDA, REDONDAP, BLANCA, BLANCAP, NEGRA, NEGRAP, CORCHEA, CORCHEAP, SEMICORCHEA, 
 * SEMICORCHEAP, FUSA, FUSAP, SEMIFUSA, SEMIFUSAP
 */
public class PruebaNotas {
  public static void main (String[] args) throws Exception {
    
    NotaMusical doBlanca5 = new NotaMusical(Tonos.DO, Figuras.BLANCA);
    NotaMusical doBlanca6 = new NotaMusical(Tonos.DO, Figuras.BLANCA, 6);
    NotaMusical reBlanca5 = new NotaMusical(Tonos.RE, Figuras.BLANCA);
    NotaMusical reBlancaP6 = new NotaMusical(Tonos.RE, Figuras.BLANCAP, 6);
    NotaMusical reRedonda6 = new NotaMusical(Tonos.RE, Figuras.REDONDA, 6);
    NotaMusical solRedonda5 = new NotaMusical(Tonos.SOL, Figuras.REDONDA);
    NotaMusical solRedonda6 = new NotaMusical(Tonos.SOL, Figuras.REDONDA, 6);
    NotaMusical laBlanca5 = new NotaMusical(Tonos.LA, Figuras.BLANCA);
    NotaMusical laRedondaP5 = new NotaMusical(Tonos.LA, Figuras.REDONDAP);
    NotaMusical siBlanca5 = new NotaMusical(Tonos.SI, Figuras.BLANCA);

    NotaMusical[] StarWars = {
      reBlanca5, reBlanca5, reBlanca5, solRedonda5, reRedonda6, doBlanca6, siBlanca5, laBlanca5, 
      solRedonda6, reBlancaP6, doBlanca6, siBlanca5, laBlanca5, solRedonda6,reBlancaP6, doBlanca6, 
      siBlanca5, doBlanca6, laRedondaP5
    };
    
    
    
    for (NotaMusical n : StarWars) {
      System.out.print(n + "--");
      n.tocarNota(8);
    }

  }
}
