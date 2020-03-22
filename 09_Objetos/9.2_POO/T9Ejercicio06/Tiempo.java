/**
 * Tiempo.java
 * 
 * @author Javier Luque Rodríguez
 * 
 * Ejercicio 6. Crea la clase Tiempo con los métodos suma y resta . Los objetos de la clase Tiempo 
 * son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20, 30) donde los 
 * parámetros que se le pasan al constructor son las horas, los minutos y los segundos 
 * respectivamente. Crea el método toString para ver los intervalos de tiempo de la forma 
 * 10h 35m 5s . Si se suman por ejemplo 30m 40s y 35m 20s el resultado debería ser 1h 6m 0s . 
 * Realiza un programa de prueba para comprobar que la clase funciona bien.
 */


public class Tiempo {
	
  private int segundos;
  private int minutos;
  private int horas;
  
  public Tiempo(int h, int m, int s) {
    this.horas = h;
    this.minutos = m;
    this.segundos = s;
  }
  
  public Tiempo(int m, int s) {
    this.minutos = m;
    this.segundos = s;
  }
  
  public Tiempo(int s) {
    this.segundos = s;
  }
  
  // Métodos
  public int getHoras() {
    return this.horas;
  }
  
  public int getMinutos() {
    return this.minutos;
  }
  
  public int getSegundos() {
    return this.segundos;
  }
  
  public String toString() {
    return this.horas + " horas, " + this.minutos + " minutos, " + this.segundos + " segundos.";
  }
  
  /**
   * Sumas de tiempos. t1.suma(t2) --> t1 + t2
   * 
   * @param t tiempo que queremos sumar
   * 
   * return   objeto de tiempo con el tiempo de ambos sumados
   */
  public Tiempo suma(Tiempo t) {
    
    int total = 0;
    
    total += (this.horas * 60 * 60) + (this.minutos * 60) + this.segundos;
    total += (t.horas * 60 * 60) + (t.minutos * 60) + t.segundos;
    
    Tiempo resultado = new Tiempo(total / 3600, (total / 60) % 60, total % 60);
    
    return resultado;
  }
  
  /**
   * Resta dos tiempos --> t1.resta(t2) --> t1 - t2
   * @param t objeto de tiempo que queremos restar al otro.
   * 
   * return   objeto Tiempo con el tiempo de t2 restado a t1.
   */
  public Tiempo resta(Tiempo t) {
    int total = 0;
    
    total += (this.horas * 60 * 60) + (this.minutos * 60) + this.segundos;
    total -= (t.horas * 60 * 60) + (t.minutos * 60) + t.segundos;
    
    Tiempo resultado = new Tiempo(total / 3600, (total / 60) % 60, total % 60);
    
    return resultado;
  }
}

