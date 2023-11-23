/**
*
* @author Elías Robles
*/
public class T05Ejercicio22 {
  public static void main(String[] args) {
    int contador = 0;

    for (int i = 2; i <= 100; i++) {
      boolean esPrimo = true;

      for (int j = 2; j * j <= i; j++) {
        if (i % j == 0) {
          esPrimo = false;
          break;
        }
      }

      if (esPrimo) {
        contador++;
        System.out.print(i + " ");
      }
    }

    System.out.println("\nHay " + contador + " números primos entre 2 y 100.");
  }  
}
