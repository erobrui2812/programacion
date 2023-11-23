import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T05Ejercicio32 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número entero positivo: ");
    long num = sc.nextLong();
    sc.close();
    long sum = 0;
    System.out.print("Los dígitos pares son: ");

    while (num > 0) {
      int digit = (int) (num % 10);
      if (digit % 2 == 0) {
        System.out.print(digit + " ");
        sum += digit;
      }
      num /= 10;
    }

    System.out.println("\nLa suma de los dígitos pares es: " + sum);
 } 
}
