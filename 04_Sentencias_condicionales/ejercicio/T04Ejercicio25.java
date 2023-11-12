import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T04Ejercicio25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la altura de la bandera en cm: ");
    int altura = sc.nextInt();

    System.out.print("Ahora introduzca la anchura: ");
    int anchura = sc.nextInt();
    sc.nextLine();
    
    System.out.print("¿Quiere escudo bordado? (si/no): ");
    String conEscudo = sc.nextLine();

    String escudoCadena;
    double precioEscudo;
    
    if (conEscudo.equalsIgnoreCase("si")) {
      escudoCadena = "Con escudo";
      precioEscudo = 2.50f;
    } else {
      escudoCadena = "Sin escudo";
      precioEscudo = 0;
    }

    System.out.println("\nGracias. Aquí tiene el desglose de su compra.\n");
    System.out.printf("Bandera de %5d cm2: %5.2f €\n", anchura * altura, (double)anchura * altura / 100);
    System.out.printf("%s:           %5.2f €\n", escudoCadena, precioEscudo);
    System.out.printf("Gastos de envío:      %5.2f €\n", 3.25);
    System.out.printf("Total:                %5.2f €\n", (double)anchura * altura / 100 + precioEscudo + 3.25);
    sc.close();
  }
}