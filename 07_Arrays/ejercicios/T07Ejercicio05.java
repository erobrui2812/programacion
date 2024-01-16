public class T07Ejercicio05 {
  public static void main(String[] args) {
    int[] numero = new int[10];
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    
    System.out.println("Introduzca numeros enteros y pulse INTRO: ");

    for (int i=0; i < numero.length; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());

      if (numero[i] > max) {
        max = numero[i];
      }

      if (numero[i] < min) {
        min = numero[i];
      }
    }

    for (int i = 0; i < numero.length; i++) {
      System.out.print(numero[i] + " ");
      
      if (numero[i] == max) {
        System.out.print(" máximo ");
      }

      if (numero[i] == min) {
        System.out.print(" mínimo ");
      }
    }
  }
}
