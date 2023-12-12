import java.util.Scanner;
/**
*
* @author Elías Robles
*/
public class T05Ejercicio17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Dime un numero entero positivo: ");
    int numero = sc.nextInt();
    sc.close();
    int numeroPrint = numero;
    System.out.println(numeroPrint);
    if (numero > 0) {
      for (int i = 1; i <= 100; i++) {
        numeroPrint+=numero+i;
        System.out.println(numeroPrint);
      }
    }
  }  
}
