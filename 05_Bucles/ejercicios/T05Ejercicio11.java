import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T05Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Dime un número: ");
    int numero = sc.nextInt();
    sc.close();
    
    for (int i = numero; i <= numero+5; i++) {
      System.out.printf("\n| %5d | %5d | %5d |",i,i*i,i*i*i);
    }
    
    
  }
}
