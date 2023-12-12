import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T05Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    boolean noCincoCaracteres = true;
    
    while (noCincoCaracteres) {
      System.out.println("Dime un numero no superior a 5 caracteres:");
      long n = sc.nextInt();
      String caracteres = ""+n; 
      
      if (caracteres.length() > 5) {
        noCincoCaracteres = false;
        System.out.println("El numero es mayor a 5 digitos.");
      }
    }
    sc.close();
  }
}
