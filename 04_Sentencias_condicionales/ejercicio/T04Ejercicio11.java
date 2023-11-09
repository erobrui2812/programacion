import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T04Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Dime una hora y minutos separados por espacios y te digo lo que falta para la media noche: ");
    int hora = sc.nextInt();
    int minutos = sc.nextInt();
    System.out.println();

    int segundosTranscurridos = (hora * 3600) + (minutos * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos.\n", hora, minutos, segundosHastaMedianoche);

    sc.close();
  }  
}
