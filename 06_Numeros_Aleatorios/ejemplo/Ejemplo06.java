public class Ejemplo06 {
  public static void main(String[] args) {
    // numero entre -5 y 16
    int numero;
    for (int i = 0; i < 10; i++) {
      numero = (int) (Math.random()*21)-5;
      System.out.println("Numero: " +numero);
    }
  }
}
