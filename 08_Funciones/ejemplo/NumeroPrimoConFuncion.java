import java.util.Scanner;

/**
 * Clase que comprueba si un número es o no primo mediante el uso de una función
 * 
 * @author Sergio Sánchez
 */

public class NumeroPrimoConFuncion {
  // Funcion definida por el usuario
  public static boolean esPrimo(int n) {
    for (int i = 2; i < n; i++) {
      if ((n%i) == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime un número:");
    int num = sc.nextInt();
    sc.close();
    esPrimo(num);

    if (esPrimo(num)){
      System.out.println("El número " + num + " es primo.");
    } else {
      System.out.println("El número " + num + " no es primo.");
    }
  }
}