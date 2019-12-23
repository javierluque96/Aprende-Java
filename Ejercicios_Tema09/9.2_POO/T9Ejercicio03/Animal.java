/*
 * Animal.java
 * 
 * Ejercicio 3. Crea las clases Animal , Mamifero , Ave , Gato , Perro , Canario , Pinguino y 
 * Lagarto . Crea, al menos, tres métodos específicos de cada clase y redefne el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 */

public class Animal {
  
  private Sexo sexo;
  
  public Animal() {
    this.sexo = Sexo.HEMBRA;
  }
  
  public Animal(Sexo s) {
    this.sexo = s;
  }
  
  public Sexo getSexo() {
    return this.sexo;
  }
  
  public void duerme() {
    System.out.println("ZzzzzZzzZzzZ");
  }
  
  public void come(String comida) {
    System.out.println(comida + " Ñaaaaaam Ñam Ñam Ñam Ñaaam");
  }
}

