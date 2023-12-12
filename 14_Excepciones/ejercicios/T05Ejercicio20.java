/**
*
* @author Elías Robles
*/
public class T05Ejercicio20 {
  public static void main(String[] args) {
    System.out.print("Introduzca el caracter de relleno: ");
    String caracter = System.console().readLine();

    System.out.print("Introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    int nivel = 1;
    int espaciosPorDelante = alturaIntroducida - 1;
    int espaciosPorDentro = 0;

    while (nivel < alturaIntroducida) {
      for (int i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
      
      System.out.print(caracter);

      for (int i = 1; i < espaciosPorDentro; i++) {
        System.out.print(" ");
      }

      if (nivel > 1) {
        System.out.print(caracter);
      }
      System.out.println();
      
      nivel++;
      espaciosPorDelante--;
      espaciosPorDentro += 2;
    }

    for (int i = 1; i < alturaIntroducida * 2; i++) {
      System.out.print(caracter);
    }
  }
}