import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T04Ejercicio18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Dime un número de hasta 5 y te dire el primero de la cadena:");

    String numero = sc.nextLine();
    
    int ultimaPosicion;
    ultimaPosicion=numero.length();

    char mostrar = numero.charAt(0);
    
    if ((ultimaPosicion <=5)&&(Character.isDigit(mostrar))) {
      System.out.println(mostrar);
    
    } else {
      System.out.println("No es un numero, o te has pasado de 5 caracteres.");
    }
    

    sc.close();
  }
}
