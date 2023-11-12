import java.util.Scanner;

/**
 * Description: Program to calculate the salary of an employee based on their position, travel days, and marital status.
 * Author: Elías Robles
 */
public class T04Ejercicio24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("1 - Programador junior");
    System.out.println("2 - Prog. senior");
    System.out.println("3 - Jefe de proyecto");
    System.out.print("Introduzca el cargo del empleado (1 - 3): ");
    int cargo = sc.nextInt();

    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    int diasViaje = sc.nextInt();

    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estadoCivil = sc.nextInt();

    sc.close();

    double sueldoBase = 0.0;
    int sueldoDietas = 30;
    double dietas = diasViaje * sueldoDietas;

    switch (cargo) {
      case 1:
        sueldoBase = 950.0;
        break;

      case 2:
        sueldoBase = 1200.0;
        break;

      case 3:
        sueldoBase = 1600.0;
        break;

      default:
        System.out.println("Cargo inválido");
    }

    int IRPF = 0;
    switch (estadoCivil) {
      case 1:
        IRPF = 25;
        break;

      case 2:
        IRPF = 20;
        break;

      default:
        System.out.println("Estado civil inválido");
    }

    double sueldoBruto = sueldoBase + dietas;
    double retencion = (sueldoBruto * IRPF) / 100;
    double sueldoNeto = sueldoBruto - retencion;
    System.out.printf("\n%-20s %.2f", "Sueldo base", sueldoBase);
    System.out.printf("\n%-6s (%-1d viajes)      %.2f", "Dietas", diasViaje, dietas);
    System.out.printf("\n\n%-20s %.2f", "Sueldo bruto", sueldoBruto);
    System.out.printf("\n%-20s %.2f", "Retención IRPF", retencion);
    System.out.printf("\n\n%-20s %.2f", "Sueldo neto", sueldoNeto);
  }
}
