import java.util.Scanner;
/**
*
* @author Elías Robles
*/
public class T05Ejercicio23 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int suma = 0;
    int contador = 0;
    
    while (true) {
      System.out.print("Introduce un número (0 para terminar): ");
      int numero = scanner.nextInt();

      if (numero == 0) {
        break;
      }

      suma += numero;
      contador++;

      if (suma > 10000) {
        System.out.println("Se ha excedido el límite de 10000. La suma acumulada es: " + suma);
        System.out.println("Se han introducido " + contador + " números.");
        System.out.println("La media es: " + (double) suma / contador);
        break;
      }
    }

    scanner.close();
  }
}