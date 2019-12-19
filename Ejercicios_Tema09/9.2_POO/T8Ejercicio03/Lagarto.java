/**
 * Lagarto.java
 * @author Javier Luque Ródríguez
 */
 
 public class Lagarto extends Animal {
   
    public Lagarto() {
      super();
    }
    
    public Lagarto(Sexo s) {
      super(s);
    }
    
    public void solecito() {
      System.out.println("Que agusto se está al solecito");
    }
    
    public void huye() {
      System.out.println("Jeje casi me atrapas");
    }
    
    public void escondete() {
      System.out.println("Aquí no me encuentra ni cristo");
    }
  }
