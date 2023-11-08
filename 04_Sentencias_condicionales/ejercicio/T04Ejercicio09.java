import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T04Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Resolución de ecuación cuadrática ax^2 + bx + c = 0");
    System.out.print("Ingrese el coeficiente a: ");
    double a = sc.nextDouble();

    System.out.print("Ingrese el coeficiente b: ");
    double b = sc.nextDouble();

    System.out.print("Ingrese el coeficiente c: ");
    double c = sc.nextDouble();

    double discriminante = b * b - 4 * a * c;

    if (discriminante > 0) {
      double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
      double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
      
      System.out.println("Las soluciones son x1 = " + x1 + " y x2 = " + x2);
    
    } else if (discriminante == 0) {
      double x = -b / (2 * a);
    
      System.out.println("La solución doble es x = " + x);
    
    } else {
      System.out.println("No hay soluciones reales");
    
    }

    sc.close();
    }
}

//REMINDER: Estudia mates