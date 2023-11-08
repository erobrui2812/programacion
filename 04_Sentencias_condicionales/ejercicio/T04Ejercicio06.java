import java.util.Scanner;

/**
* Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
  una altura h. Aplica la fórmula t =
  √2h
  g
  siendo g = 9.81m/s
  2
*
* @author Elías Robles
*/
public class T04Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double g = 9.81;

    System.out.println("Dime la altura desde la que tiras el objeto:");
    double h = sc.nextDouble();

    if (h <= 0) {
      System.out.println("Altura inválida.");
    
    } else {
      double operacion = (2*h)/g;
      double t = Math.sqrt(operacion);
      
      System.out.printf("\nEl objeto tarda en llegar al suelo %.3f segundos.",t);
    }
    
    sc.close();
  }
}
