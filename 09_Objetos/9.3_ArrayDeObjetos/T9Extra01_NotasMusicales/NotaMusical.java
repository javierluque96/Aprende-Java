import javax.sound.sampled.*;

public class NotaMusical {
  
  private static int semitonosAlLa [] = {432, -10, -9, -8, -8, -7, -6, -6, -5, -4, -5, -4, -3, -3,
     -2, -1, -1, 0, 1, 1, 2, 3};
  private static int duracion[] =  {256,128,192,64,96,32,48,16,24,8,12,4,6,2,3};
  public static float SAMPLE_RATE = 8000f;
  private Tonos tono;
  private Figuras figura;
  private int octava;

  public NotaMusical(Tonos tono, Figuras figura) {
    this.tono = tono;
    this.figura = figura;
    this.octava = 5;
  }
  
  public NotaMusical(Tonos tono, Figuras figura, int octava) {
    this.tono = tono;
    this.figura = figura;
    this.octava = octava;
  }
  
  public String toString() {
    return tono + "--" + figura + "--" + octava;
  }
  
  public static void tone(int hz, int msecs) throws LineUnavailableException {
     tone(hz, msecs, 1.0);
  }

  public static void tone(int hz, int msecs, double vol) throws LineUnavailableException {
    byte[] buf = new byte[1];
    AudioFormat af = 
        new AudioFormat(
            SAMPLE_RATE, // sampleRate
            8,           // sampleSizeInBits
            1,           // channels
            true,        // signed
            false);      // bigEndian
    SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
    sdl.open(af);
    sdl.start();
    
    for (int i = 0; i < msecs * 8; i++) {
      double angle = i / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
      buf[0] = (byte)(Math.sin(angle) * 127.0 * vol);
      sdl.write(buf,0,1);
    }
    
    sdl.drain();
    sdl.stop();
    sdl.close();
  }

  public void tocarNota (int velocidad) throws Exception {
    
    int tonoFrecuencia = 0;
    if (semitonosAlLa[tono.ordinal()] != 432) {
      tonoFrecuencia = (int)(440 * Math.pow(1.0594630943592953, (octava - 4) * 12 
	+ semitonosAlLa[tono.ordinal()]));
    }
    System.out.println(tonoFrecuencia);
    
    int tiempoSonando = duracion[figura.ordinal()] * velocidad; 
    
    tone(tonoFrecuencia, tiempoSonando);
    Thread.sleep(0);
  }
}
