import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T04Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Dime el caracter con el que quieres rellenar la imagen:");
    String caracter = sc.nextLine();

    System.out.println("Dime hicia donde quieres que apunte la piramide: 1-IZQ, 2-DER, 3-ARRIBA, 4-ABAJO");
    int direccion = sc.nextInt();

    switch (direccion) {
      case 1:
        System.out.println(" "+" "+caracter);
        System.out.println(" "+caracter+caracter);
        System.out.println(caracter+caracter+caracter);
        System.out.println(" "+caracter+caracter);
        System.out.println(" "+" "+caracter);
        break;
        
        case 2:
        System.out.println(caracter+" "+" ");
        System.out.println(caracter+caracter+" ");
        System.out.println(caracter+caracter+caracter);
        System.out.println(caracter+caracter+" ");
        System.out.println(caracter+" "+" ");
        break;
      
        case 3:
        System.out.println(" "+" "+caracter);
        System.out.println(" "+caracter+caracter+caracter);
        System.out.println(caracter+caracter+caracter+caracter+caracter);
        break;
      
        case 4:
        System.out.println(caracter+caracter+caracter+caracter+caracter);
        System.out.println(" "+caracter+caracter+caracter);
        System.out.println(" "+" "+caracter);
        break;
      
      default:
        System.out.println("No has introducido la direccion correcta");
        break;
    }

    sc.close();
  }  
}
