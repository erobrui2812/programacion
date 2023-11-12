import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T04Ejercicio22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Dime el dia de la semana en número (Lunes a Viernes): €");
    String diaSemana = sc.nextLine();

    final int MINUTOSTOTALES = (4*24*60) + (15*60);
    int diasTranscurridos = 0;
    switch (diaSemana) {
      case "Lunes":
        diasTranscurridos=0;
        break;
      
      case "Martes":
        diasTranscurridos=1;
        break;

      case "Miercoles":
        diasTranscurridos=2;
        break;  

      case "Jueves":
        diasTranscurridos=3;
        break;

      case "Viernes":
        diasTranscurridos=4;
        break;

      default:
        System.out.println("No has introducido un dia válido");
        break;
      }
      System.out.println("Introduce una hora y minutos separados por espacios:");
      int hora = sc.nextInt();
      int minutos = sc.nextInt();
      int minutosTranscurridos = (diasTranscurridos * 24 * 60) + (hora *60) + minutos;
      System.out.println("Faltan " + (MINUTOSTOTALES-minutosTranscurridos) + " minutos para llegar a fin de semana.");
      sc.close();
  }
}  
