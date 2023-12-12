/**
*
* @author Elías Robles
*/
public class T05Ejercicio04 {
  public static void main(String[] args) {
    int valorInicial = 320;
    int valorFinal = 160;
    int resta = 20;

    for (int i = valorInicial; i >= valorFinal; i-=resta) {
      System.out.println(i);
    }
  }
}
