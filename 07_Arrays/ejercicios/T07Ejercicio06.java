/**
*
* @author Elías Robles
*/
public class T07Ejercicio06 {
  public static void main(String[] args) {
    int[] numero = new int[15];
    System.out.println("Introduzca los numeros enteros y pulse INTRO: ");
    for (int i = 0; i < numero.length; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    
    for (int i = 0; i < numero.length; i++) {
      System.out.printf("%3d",numero[i]);
    }

    int aux = numero[14];
    for (int j = numero.length; j > 0; j--) {
    
    }
  }
}
