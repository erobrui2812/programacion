public class Ejemplo05 {
  public static void main(String[] args) {
    //genera numeros aleatorios entre [50 y 70)
    int numero;

    for (int i = 0; i < 10; i++) {
      numero = (int) (Math.random()*21)+50;
      System.out.println(numero);
    }
  }
}
