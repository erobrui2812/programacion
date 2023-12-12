import java.util.Scanner;

/**
*
* @author Elías Robles
*/
class T05Ejercicio31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Dime la altura de la L: ");
    int alturaL = sc.nextInt();
    sc.close();

    for (int i = 1; i < alturaL; i++) {
      System.out.print("*");
      System.out.println();
    }

    for (int j = 1; j <= ((alturaL/2)+1); j++){
      System.out.print("*");
    }
  }
  
}