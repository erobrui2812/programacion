import java.util.Scanner;
/**
*
* @author Elías Robles
*/
public class T05Ejercicio21 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int totalNumeros = 0;
    int totalImpares = 0;
    int totalPares = 0;
    int imparMayor = Integer.MIN_VALUE;
    int parMayor = Integer.MIN_VALUE;
    int numero;

    do {
      System.out.println("Introduzca un número:");
      numero = scanner.nextInt();

      if (numero < 0) {
        break;
      }

      totalNumeros++;

      if (numero % 2 == 0) {
        totalPares++;
        parMayor = Math.max(parMayor, numero);
      } else {
        totalImpares++;
        imparMayor = Math.max(imparMayor, numero);
      }
    } while (true);

    if (totalImpares > 0) {
      System.out.println("La media de los impares es: " + (float) totalImpares / 2);
    } else {
      System.out.println("No se han introducido impares.");
    }

    if (totalPares > 0) {
      System.out.println("El mayor de los pares es: " + parMayor);
    } else {
      System.out.println("No se han introducido pares.");
    }

    System.out.println("Se han introducido " + totalNumeros + " números.");
    scanner.close();
  }
}
