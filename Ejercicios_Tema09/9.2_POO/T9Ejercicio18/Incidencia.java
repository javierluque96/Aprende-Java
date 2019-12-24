/*
 * Empresa.java
 * @author Javier Luque Rodríguez
 * 
 * Ejercicio 18.
 * Una empresa quiere implementar un programa que lleve el control de las incidencias que se 
 * producen en sus ordenadores. Cada incidencia tiene un código: 1, 2, 3, 4, etc. Cuando se crea 
 * una nueva incidencia, se le asigna un código de forma automática y se pone el estado como 
 * “pendiente”. Al crear una incidencia hay que indicar también el número de puesto (un número
 * entero). Cuando se resuelve una incidencia, hay que proporcionar información sobre cómo se ha 
 * resuelto o qué es lo que fallaba, además, el estado pasa a “resuelta”.
 */
public class Incidencia {
  
  private int codigo;
  private String estado = "Pendiente";
  private String problema;
  private String solucion;
  private static int total = 0;
  private static int resueltas = 0;
  
  public Incidencia(int codigo, String problema) {
    this.codigo = codigo;
    this.problema = problema;
    total++;
  }
  
  public String toString() {
    return "Incidencia: " + codigo + " - " + problema + " - " + estado + 
    (estado.equals("Pendiente") ? "" : " - " + solucion);
  }
  
  public void resuelve(String solucion) {
    this.solucion = solucion;
    this.estado = "Resuelta";
    resueltas++;
  }
  
  public static int getPendientes() {
    return total - resueltas;
  }
}
