import java.util.Scanner;
/**
*
* @author Elías Robles
*/
public class T04Ejercicio28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String turno = sc.nextLine();
    
    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
    String turno2 = sc.nextLine();

    if (turno.equalsIgnoreCase(turno2)) {
        System.out.println("Empate");

    } else if ((turno.equalsIgnoreCase("piedra")) && (turno2.equalsIgnoreCase("papel"))) {
        System.out.println("Gana el jugador 2");

    } else if ((turno.equalsIgnoreCase("papel")) && (turno2.equalsIgnoreCase("piedra"))) {
        System.out.println("Gana el jugador 1");

    } else if ((turno.equalsIgnoreCase("piedra")) && (turno2.equalsIgnoreCase("tijera"))) {
        System.out.println("Gana el jugador 1");

    } else if ((turno.equalsIgnoreCase("tijera")) && (turno2.equalsIgnoreCase("piedra"))) {
        System.out.println("Gana el jugador 2");

    } else if ((turno.equalsIgnoreCase("papel")) && (turno2.equalsIgnoreCase("tijera"))) {
        System.out.println("Gana el jugador 2");

    } else if ((turno.equalsIgnoreCase("tijera")) && (turno2.equalsIgnoreCase("papel"))) {
        System.out.println("Gana el jugador 1");
    }

    sc.close();
  }
}
