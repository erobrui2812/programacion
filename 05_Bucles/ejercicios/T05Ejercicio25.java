/**
*
* @author Elías Robles
*/
import java.util.Scanner;

public class T05Ejercicio25 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int num = scanner.nextInt();
    int numReverso = 0;

    while (num != 0) {
      int digito = num % 10;
      numReverso = numReverso * 10 + digito;
      num = num / 10;
    }

    System.out.println("El número al revés es: " + numReverso);
    scanner.close();
  }
}