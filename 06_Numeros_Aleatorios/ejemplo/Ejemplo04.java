public class Ejemplo04 {
  public static void main(String[] args) {
    int numero;
    for (int i = 0; i < 10; i++) {
      numero = (int) (Math.random()*10)+1;
      System.out.println("El número generado es: " +numero);
    }
  }
}
