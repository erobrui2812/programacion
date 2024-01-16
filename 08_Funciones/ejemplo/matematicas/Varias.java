package matematicas;

/**
 * Funciones matemáticas de propósito general
 * 
 * @author Sergio Sánchez
 */
public class Varias {

  /**
   * Comprueba si un número entero positivo es primo o no.
   * Un número es primo cuando únicamente es divisible entre
   * él mismo y la unidad.
   * 
   * @param x un número entero positivo
   * @return boolean <code>true</code> si el número es primo o <code>false</code> en caso contrario
   */
  public static boolean esPrimo(int x) {
    
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    
    return true;
  }

  /**
   * Devuelve el número de dígitos que contiene un número entero
   * 
   * @param x un número entero
   * @return int la cantidad de dígitos que contiene el número
   */
  public static int digitos(int x) {
    
    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }



  
  /** 
   * Voltear un número introducido desde teclado
   * @param x un número de tipo long
   * @return long el número volteado
   */

  public static long voltear(long x) {
    if (x < 0) {
      return -voltear(-x);
    }

    long numeroVolteado = 0;
    while (x > 0) {
      numeroVolteado = (numeroVolteado*10) + (x % 10);
      x/=10;
    }

    return numeroVolteado;
  }



  
  /** 
   * Voltear un número introducido desde teclado
   * @param x un número de tipo int
   * @return int el número volteado
   */

  public static int voltear(int x) {
    return (int) voltear((long) x);
  }


  public static boolean esCapicua(long x) {
    boolean resultado;
    if (x == voltear(x)) {
      resultado = true;
    } else {
      resultado = false;
    }

    return resultado;
  }

  public static int siguientePrimo(int x) {
    do {
      x++;
      esPrimo(x);
    } while (esPrimo(x) == false);

    return x;
  }

  //Primera Funcion
  public static double calcularPromedio(int[] array) {
    if (array.length == 0) {
        return 0.0;
    }

    int suma = 0;
    for (int numero : array) {
        suma += numero;
    }

    return (double) suma / array.length;
}

//Segunda Funcion
public static boolean esPalindromo(String palabra) {
  String palabraInvertida = new StringBuilder(palabra).reverse().toString();
  return palabra.equals(palabraInvertida);
}

//Tercera funcion
public static double celsiusToFahrenheit(double celsius) {
  return (celsius * 9 / 5) + 32;
}

//Cuarta funcion
public static int calcularMCD(int a, int b) {
  while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
  }
  return a;
}


}
