import java.util.Scanner;

public class T05Ejercicio24 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce el número de filas: ");
    int filas = scanner.nextInt();

    for (int i = 1; i <= filas; i++) {
      for (int j = i; j < filas; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= (2 * i - 1); j++) {
        System.out.print(j);
      }

      for (int j = (2 * i - 1); j > i; j--) {
        System.out.print(j);
      }

      System.out.println();
    }

    scanner.close();
  }
}
