import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T04Ejercicio17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Dime un número largo y te dire el ultimo de la cadena:");

    String numero = sc.nextLine();
    
    int ultimaPosicion;
    ultimaPosicion=numero.length();

    char mostrar = numero.charAt(ultimaPosicion-1);
    
    if (Character.isDigit(mostrar)) {
      System.out.println(mostrar);
    
    } else {
      System.out.println("No es un numero");
    }
    

    sc.close();
  }
  
}