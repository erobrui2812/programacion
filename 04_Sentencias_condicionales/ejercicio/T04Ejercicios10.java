import java.util.Scanner;

/**
*
* @author Elías Robles
*
  {nombre = "Aries", fechaInicio = {21, 3}, fechaFin = {19, 4}},
  {nombre = "Tauro", fechaInicio = {20, 4}, fechaFin = {20, 5}},
  {nombre = "Géminis", fechaInicio = {21, 5}, fechaFin = {20, 6}},
  {nombre = "Cáncer", fechaInicio = {21, 6}, fechaFin = {22, 7}},
  {nombre = "Leo", fechaInicio = {23, 7}, fechaFin = {22, 8}},
  {nombre = "Virgo", fechaInicio = {23, 8}, fechaFin = {22, 9}},
  {nombre = "Libra", fechaInicio = {23, 9}, fechaFin = {22, 10}},
  {nombre = "Escorpio", fechaInicio = {23, 10}, fechaFin = {21, 11}},
  {nombre = "Sagitario", fechaInicio = {22, 11}, fechaFin = {21, 12}},
  {nombre = "Capricornio", fechaInicio = {22, 12}, fechaFin = {19, 1}},
  {nombre = "Piscis", fechaInicio = {19, 2}, fechaFin = {20, 3}}
*/
public class T04Ejercicios10 {
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
