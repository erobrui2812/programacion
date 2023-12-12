import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T05EjemplosWhile02bis {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero = 0;
    int contadorPositivos= 0;
    int suma = 0;
    while (numero >= 0) {
      System.out.println("Dime numeros positivos, si introduces un negativo el programa acabará:");
      numero = sc.nextInt();
      if (numero >= 1) {
        contadorPositivos++;
        suma+=numero;
      }
    }      
    System.out.println("Hay "+contadorPositivos+" número positivos"+"\nAdemas que la suma de estos numeros es "+suma);
    sc.close();
  }
}