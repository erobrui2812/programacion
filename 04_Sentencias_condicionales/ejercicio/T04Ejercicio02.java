import java.util.Scanner;

/**
*Realiza un programa que pida una hora por teclado y que muestre luego buenos
días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
horas, los minutos no se deben introducir por teclado.
*
* @author Elías Robles
*/
public class T04Ejercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Dime las horas en formato 24h: ");
    int hora = sc.nextInt();

    switch (hora) {
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
        System.out.println("Buenos días!");
        break;
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
        System.out.println("Buenas tardes!");
        break;
      case 21:
      case 22:
      case 23:
      case 24:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        System.out.println("Buenas noches!");
        break;
      default:
        System.out.println("Introduce un numero válido.");
        break;
    }
    
    sc.close();
  }
}
