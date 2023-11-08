import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T04Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Por favor, introduzca el valor de a: ");
    double a = sc.nextDouble();

    System.out.print("Ahora introduzca el valor de b: ");
    double b = sc.nextDouble();

    //Calculo de la incognita
    double x = -b / a;

    if (a == 0) {
      System.out.println("Esa ecuación no tiene solución real");

    } else {
      System.out.printf("\nx = %.4",x);
      
    }
    sc.close();
  }
}
