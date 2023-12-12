import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T05Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero y separado por un espacio a cuanto lo quieres elevar: ");
    int base = sc.nextInt();
    int exponente = sc.nextInt();
    sc.close();
    int numero = 1;
    for (int i = 1; i <= exponente; i++) {
      numero*=base;
      System.out.println(base+" elevado a "+i+" = "+numero);
    }
  }  
}
