import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T04Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Dime un número y te digo si es multiplo de 5");
    int numero = sc.nextInt();

    if ((numero%5)==0) {
      System.out.println("Es múltiplo de 5.");
    } else {
      System.out.println("No es multiplo de 5.");
    }


    sc.close();
  }
}
