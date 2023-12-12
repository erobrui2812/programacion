/**
*
* @author Elías Robles
*/
public class T05EjemploDoWhile02 {
  public static void main(String[] args) {
    
    int numero = 0;
    
    do {
    System.out.print("Introduce un numero par: ");
    numero = Integer.parseInt(System.console().readLine());  
    if (numero % 2 == 0) {
      System.out.println("Ay que bonito ese numero par "+numero);
    }
    else {
      System.out.println("Que feo los número impares");
    }
    } while (numero % 2 == 0);
  }
}
