public class T05Ejercicio06 {
  public static void main(String[] args) {
    final int valorInicial = 320;
    final int valorFinal = 160;
    int resta = 20;

    int valorActual = valorInicial;
    do {
      System.out.println(valorActual);
      valorActual-=resta;
    } while (valorActual >= valorFinal);
  }
}
