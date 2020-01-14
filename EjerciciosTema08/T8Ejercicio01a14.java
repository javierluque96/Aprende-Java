import matematicas.Varias;

public class T8Ejercicio01a14 {
  
  public static void main (String[] args) {
    // esCapicua
    System.out.println("esCapicua:");
    if (matematicas.Varias.esCapicua(232)) {
      System.out.println("El 232 es capicúa.");
    }
    
    if (matematicas.Varias.esCapicua(29)) {
      System.out.println("El 29 es capicúa.");
    }
    
    // esPrimo
    System.out.println("\nesPrimo:");
    if (matematicas.Varias.esPrimo(5)) {
      System.out.println("El 5 es primo.");
    }
    
    if (matematicas.Varias.esPrimo(212)) {
      System.out.println("El 212 es primo.");
    }
    
    // siguientePrimo
    System.out.println("\nsiguientePrimo:");
    System.out.println("El siguiente primo mayor a 23 es " 
      + matematicas.Varias.siguientePrimo(23));
    System.out.println("El siguiente primo mayor a 100 es " 
      + matematicas.Varias.siguientePrimo(100));
      
    // potencia
    System.out.println("\npotencia:");
    System.out.println("2^10 = " + matematicas.Varias.potencia(2, 10));
    System.out.println("5^(-3) = " + matematicas.Varias.potencia(5, -3));
    System.out.println("10^6 = " + matematicas.Varias.potencia(10, 6));
    
    // dígitos
    System.out.println("\ndigitos:");
    System.out.println("1023 tiene " + matematicas.Varias.digitos(1023) 
      + " dígitos");
      
    // digitoN
    System.out.println("\ndigitoN:");
    System.out.println("En la posición 0 del 3452 está el " 
      + matematicas.Varias.digitoN(3452, 0));
    System.out.println("En la posición 6 del 857964034 está el " 
      + matematicas.Varias.digitoN(857964034, 6));
    System.out.println("En la posición 4 del 857964034 está el " 
      + matematicas.Varias.digitoN(857964034, 4));
      
    // posicionDeDigito
    System.out.println("\nposicionDeDigito:");
    System.out.println("En el 3452, el dígito 4 está en la posición " 
      + matematicas.Varias.posicionDeDigito(3452, 4));
    System.out.println("En el 78604321, el dígito 1 está en la posición " 
      + matematicas.Varias.posicionDeDigito(78604321, 1));
    System.out.println("En el 78604321, el dígito 7 está en la posición " 
      + matematicas.Varias.posicionDeDigito(78604321, 7));
    System.out.println("En el 78604321, el dígito 5 está en la posición " 
      + matematicas.Varias.posicionDeDigito(78604321, 5));
    System.out.println("En el 78604321, el dígito 0 está en la posición " 
      + matematicas.Varias.posicionDeDigito(78604321, 0));
    
    // quitaPorDetras
    System.out.println("\nquitaPorDetras:");
    System.out.println("Si al 78604321 se le quitan por detrás 4 dígitos, " +
      "se queda como " + matematicas.Varias.quitaPorDetras(78604321, 4));
    System.out.println("Si al 1000 se le quita por detrás 1 dígito, se queda " 
      + "como " + matematicas.Varias.quitaPorDetras(1000, 1));
    
    // quitaPorDelante
    System.out.println("\nquitaPorDelante:");
    System.out.println("Si al 78604321 se le quitan por delante 4 dígitos, se " 
      + "queda como " + matematicas.Varias.quitaPorDelante(78604321, 4));
    System.out.println("Si al 78604000 se le quitan por delante 2 dígitos, se "
      + "queda como " + matematicas.Varias.quitaPorDelante(78604000, 2));
      
    // pegaPorDetras
    System.out.println("\npegaPorDetras:");
    System.out.println("Si al 567 se le pega por detrás el 1 da el " 
      + matematicas.Varias.pegaPorDetras(567, 1));
    System.out.println("Si al 33 se le pega por detrás el 0 da el " 
      + matematicas.Varias.pegaPorDetras(33, 0));
    
    // pegaPorDelante
    System.out.println("\npegaPorDelante:");
    System.out.println("Si al 567 se le pega por delate el 1 da el " 
      + matematicas.Varias.pegaPorDelante(567, 1));
    System.out.println("Si al 33 se le pega por delante el 0 da el " 
      + matematicas.Varias.pegaPorDelante(33, 0));
      
     // trozoDeNumero
    System.out.println("\ntrozoDeNumero:");
    System.out.println("Al 78604000 le cojo el trozo que va de la posición 0 a"
      + " la 3: " + matematicas.Varias.trozoDeNumero(78604000, 0, 3));
    System.out.println("Al 78604000 le cojo el trozo que va de la posición 4 a"
      + " la 6: " + matematicas.Varias.trozoDeNumero(78604000, 4, 6));
    System.out.println("Al 78604000 le cojo el trozo que va de la posición 2 a"
      + " la 2: " + matematicas.Varias.trozoDeNumero(78604000, 2, 2));
      
    // juntaNumeros
    System.out.println("\njuntaNumeros:");
    System.out.println("Juntando el 21 y el 40 da el " 
      + matematicas.Varias.juntaNumeros(21, 40));
    System.out.println("Juntando el 789 y el 250 da el " 
      + matematicas.Varias.juntaNumeros(789, 250));
  } 
}

