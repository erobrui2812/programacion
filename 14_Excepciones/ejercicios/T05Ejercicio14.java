import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T05Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Dime el la base para calcular la potencia: ");
    int base = sc.nextInt();
    System.out.print("\nDime el exponente (positivo): ");
    int exponente = sc.nextInt();
    int acumulador = base;
    
    sc.close();

    if (exponente < 0) {
      System.out.println("Que te habia dicho");
    } else {
      for (int i = exponente; i-1 >=1; i--) {
        acumulador = acumulador * base;
      }
      System.out.printf(" %4d ^ %4d = %-10d",base,exponente,acumulador);
    }
  }
}
