/**
*
* @author Elías Robles
*/
import java.util.Scanner;
public class T04Ejercicio23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Introduzca la base imponible: ");
    double baseImponible = sc.nextDouble();
    sc.nextLine();
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIVA = sc.nextLine().toLowerCase();

    System.out.print("Introduce el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigoPromocional = sc.nextLine().toLowerCase();

    int porcentajeIVA = 0;

    switch (tipoIVA) {
      case "general":
        porcentajeIVA = 21;
        break;
      
      case "reducido":
        porcentajeIVA = 10;
        break;
      
      case "superreducido":
        porcentajeIVA = 4;
        break;
      
      default:
        System.out.println("No has introducido un valor correcto de IVA");
        break;
    }

    double iva = baseImponible * porcentajeIVA / 100;
    double precioIva = baseImponible + iva;

    double descuento = 0;
    switch (codigoPromocional) {
      case "nopro":
        descuento = 0;
        break;
      
      case "mitad":
        descuento = baseImponible / 2;
        break;
      
      case "meno5":
        descuento = 5;
        break;

      case "5porc":
        descuento = baseImponible * (5 / 100);
        break;
    
      default:
        System.out.println("No has introducido un valor correcto de código promocional");
        break;
    }

    double total = precioIva - descuento;
    
    System.out.printf("%-20s %6.2f\n","Base imponible", baseImponible);
    System.out.printf("IVA (%2d%%)            %6.2f\n", porcentajeIVA, iva);
    System.out.printf("%-20s %6.2f\n","Precio con IVA", precioIva);
    System.out.printf("Cód. promo. (%5s) -%6.2f\n", codigoPromocional, descuento);
    System.out.printf("%-20s %6.2f\n","TOTAL", total);

    sc.close();
  }
}
