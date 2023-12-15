import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T05Ejercicio34 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número: ");
    int primerNum = sc.nextInt();
    System.out.print("Introduzca otro número: ");
    int segundoNum = sc.nextInt();

    String primerCad = ""+primerNum;
    int largoPrimer = primerCad.length();

    String segundoCad = ""+segundoNum;
    int largoSegundo = segundoCad.length();
    
    String cadPrimer = "";
    String cadSegundo = "";

    int contador = 0; 
    while (largoPrimer > contador) {
      char primero = primerCad.charAt(contador);
      if (Character.isDigit(primero) && (primero % 2 == 0)) {
        cadPrimer += primero;
      } else {
        cadSegundo += primero;
      }
      contador++;
    }

    
    contador = 0; 
    while (largoSegundo > contador) {
      char segundo = segundoCad.charAt(contador);
      if (Character.isDigit(segundo) && (segundo % 2 == 1)) {
        cadSegundo += segundo;
      } else {
        cadPrimer += segundo;
      }
      contador++;
    }

    System.out.println("El número formado por los dígitos pares es "+cadPrimer);
    System.out.println("El número formado por los dígitos impares es "+cadSegundo);

    sc.close();
  }  
}