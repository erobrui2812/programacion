import java.util.Scanner;

/**
*
* @author Elías Robles
*
*/
public class T04Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Dime el mes en el que naciste");
    String mes = sc.nextLine();

    System.out.println("Dime el dia en el que naciste");
    int dia = sc.nextInt();

    if ((mes.equalsIgnoreCase("enero") && ((dia >= 19) && (dia <= 31))) || (mes.equalsIgnoreCase("febrero") && ((dia >= 1) && (dia <= 18)))) {
      System.out.println("Eres Acuario");

    } else if ((mes.equalsIgnoreCase("febrero") && ((dia >= 19) && (dia <= 29))) || (mes.equalsIgnoreCase("marzo") && ((dia >= 1) && (dia <= 20)))) {
      System.out.println("Eres Piscis");

    } else if ((mes.equalsIgnoreCase("marzo") && ((dia >= 21) && (dia <= 31))) || (mes.equalsIgnoreCase("abril") && ((dia >= 1) && (dia <= 19)))) {
      System.out.println("Eres Aries");

    } else if ((mes.equalsIgnoreCase("abril") && ((dia >= 20) && (dia <= 30))) || (mes.equalsIgnoreCase("mayo") && ((dia >= 1) && (dia <= 20)))) {
      System.out.println("Eres Tauro");

    } else if ((mes.equalsIgnoreCase("mayo") && ((dia >= 21) && (dia <= 31))) || (mes.equalsIgnoreCase("junio") && ((dia >= 1) && (dia <= 20)))) {
      System.out.println("Eres Géminis");

    } else if ((mes.equalsIgnoreCase("junio") && ((dia >= 21) && (dia <= 30))) || (mes.equalsIgnoreCase("julio") && ((dia >= 1) && (dia <= 22)))) {
      System.out.println("Eres Cáncer");

    } else if ((mes.equalsIgnoreCase("julio") && ((dia >= 23) && (dia <= 31))) || (mes.equalsIgnoreCase("agosto") && ((dia >= 1) && (dia <= 22)))) {
      System.out.println("Eres Leo");

    } else if ((mes.equalsIgnoreCase("agosto") && ((dia >= 23) && (dia <= 31))) || (mes.equalsIgnoreCase("septiembre") && ((dia >= 1) && (dia <= 22)))) {
      System.out.println("Eres Virgo");

    } else if ((mes.equalsIgnoreCase("septiembre") && ((dia >= 23) && (dia <= 30))) || (mes.equalsIgnoreCase("octubre") && ((dia >= 1) && (dia <= 22)))) {
      System.out.println("Eres Libra");

    } else if ((mes.equalsIgnoreCase("octubre") && ((dia >= 23) && (dia <= 31))) || (mes.equalsIgnoreCase("noviembre") && ((dia >= 1) && (dia <= 21)))) {
      System.out.println("Eres Escorpio");

    } else if ((mes.equalsIgnoreCase("noviembre") && ((dia >= 22) && (dia <= 30))) || (mes.equalsIgnoreCase("diciembre") && ((dia >= 1) && (dia <= 21)))) {
      System.out.println("Eres Sagitario");

    } else if ((mes.equalsIgnoreCase("diciembre") && ((dia >= 22) && (dia <= 31)) || (mes.equalsIgnoreCase("enero") && ((dia >= 1) && (dia <= 18))))) {
      System.out.println("Eres Capricornio");
      
    } else {
      System.out.println("Fecha de nacimiento no válida");
    }
  
    sc.close();
  }
}
