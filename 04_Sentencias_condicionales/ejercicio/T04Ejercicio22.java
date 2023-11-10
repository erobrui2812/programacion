import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T04Ejercicio22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Dime el dia de la semana en número (Lunes a Viernes): ");
    int diaSemana = sc.nextInt();

    if ((diaSemana >=1)&&(diaSemana <=7)) {
      System.out.print("Dime la hora y los minutos separados por espacio: ");
      int horas = sc.nextInt();
      int minutos = sc.nextInt();
      int minutosEnUnDia = 24 * 60;
      int minutosHoy = (horas * 60) + minutos;
      int minutosRestantesHoy = minutosEnUnDia - minutosHoy;
      int minutosHastaFinDeSemana += ((5 - diaSemana) % 5) * minutosEnUnDia;
      
    } else {
      System.out.println("No has introducido un dia válido");
    }
    
    sc.close();
  }  
}
