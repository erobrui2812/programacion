import java.util.Scanner;
/**
*
* @author Elías Robles
*/
public class T04Ejercicio27 {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

    System.out.println("Elija un sabor (manzana, fresa o chocolate): ");
    String sabor = sc.nextLine().toLowerCase();

    double precioSabor = 0;
    double precioNata = 0;
    double precioNombre = 0;
    String tipoChocolate = "";

    switch (sabor) {
      case "manzana":
        precioSabor = 18;
        break;

      case "fresa":
        precioSabor = 16;
        break;

      case "chocolate":
        System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
        tipoChocolate = sc.nextLine().toLowerCase();

        if (tipoChocolate.equals("negro")) {
          precioSabor = 14;

        } else if (tipoChocolate.equals("blanco")) {
          precioSabor = 15;
        }
        break;

      default:
    }

    System.out.print("¿Quiere nata? (si o no): ");
    String conNata = sc.nextLine();
    
    System.out.print("¿Quiere ponerle un nombre? (si o no): ");
    String conNombre = sc.nextLine();

    System.out.print("Tarta de " + sabor);

    if (sabor.equals("chocolate")) {
      System.out.print(" " + tipoChocolate);
    }

    System.out.printf(": %.2f €\n", precioSabor);
    
    if (conNata.equalsIgnoreCase("si")) {
      precioNata = 2.5;
      System.out.printf("Con nata: %.2f €\n", precioNata);
    }
    
    if (conNombre.equalsIgnoreCase("si")) {
      precioNombre = 2.75;
      System.out.printf("Con nombre: %.2f €\n", precioNombre);
    }
    
    System.out.printf("Total: %.2f €\n", precioSabor + precioNata + precioNombre);
    sc.close();
  }
}