import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T04Ejercicio21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Nota del primer control: ");
    double primerControl = sc.nextDouble();
    sc.nextLine();
    System.out.print("\nNota del segundo control: ");
    double segundoControl = sc.nextDouble();
    sc.nextLine();

    double mediaNota = (primerControl+segundoControl)/2;  
    if (mediaNota < 5) {
      System.out.print("\n¿Has aprobado la recuperación? ");
      
      String apto = sc.nextLine();
      if (apto.equalsIgnoreCase("apto")) {
        mediaNota=5;
      }
    }
    System.out.printf("\nTu nota de programación es %.1f.",mediaNota);
    sc.close();
  } 
}
