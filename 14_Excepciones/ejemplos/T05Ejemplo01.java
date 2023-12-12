import java.util.Scanner;

/**
* Ejemplo bucle for
* @author Elías Robles
*/
public class T05Ejemplo01 {
  public static void main(String[] args) {
    double numero1;
    double numero2;
    Scanner s = new Scanner(System.in);
    try {
      System.out.println("Introduzca el primer numero");
      numero1 = s.nextDouble();
      System.out.println("Introduzca el segundo numero");
      numero2 = s.nextDouble();
      System.out.println("La media es "+(numero1+numero2)/2);
      s.close();
    } catch (Exception e) {
      System.out.println("No se puede calcular la media");
      System.out.println("los datos introducidos no son correctos");
    } finally {
      System.out.println("Gracias por utilizar este programa");
    }
  }
}
