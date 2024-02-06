public class PruebaCubo {
  public static void main(String[] args) {
    Cubo cubo = new Cubo(10);
    Cubo cubo2 = new Cubo(8);
    cubo.setContenido(6);
    cubo2.setContenido(1);

    cubo.pinta();
    cubo2.pinta();

    cubo.vuelcaEn(cubo2);
    cubo.pinta();
    cubo2.pinta();

  }
}
