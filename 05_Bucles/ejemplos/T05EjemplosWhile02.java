import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T05EjemplosWhile02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero = 0;
    int contadorPositivos= 0;
      
    while (numero >= 0) {
      System.out.println("Dime numeros positivos, si introduces un negativo el programa acabará:");
      numero = sc.nextInt();

      if (numero >= 1) {
        contadorPositivos++;
      }
    }      
    System.out.println("Hay "+contadorPositivos+" número positivos");
    sc.close();
  }
}