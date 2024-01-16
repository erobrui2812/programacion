public class T05EjercicioBi05 {
  public static void main(String[] args) {
    int[][] tabla = new int[6][10];
    int fila,columna;

    int minimoValor = Integer.MAX_VALUE;
    int maximoValor = Integer.MIN_VALUE;

    int minCol = 0;
    int minFil = 0;
    int maxCol = 0;
    int maxFil = 0;

    for (fila=0 ; fila<tabla.length ; fila++) {
      for (columna=0 ; columna<tabla[fila].length; columna++){
        tabla[fila][columna]=(int)(Math.random()*1001);

        if (tabla[fila][columna] < minimoValor) {
          minimoValor = tabla[fila][columna];
          minCol = columna;
          minFil = fila;
        }
        if (tabla[fila][columna] > maximoValor) {
          maximoValor = tabla[fila][columna];
          maxCol = columna;
          maxFil = fila;
        }
      }
    }

    for (fila = 0; fila < tabla.length; fila++) {
      
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("%8d", tabla[fila][columna]);
        
      }
      System.out.printf("\n");
      
    }

    System.out.println("El minimo es: "+minimoValor+" y se encuentra en "+minCol+" y "+minFil+".");
    System.out.println("El maximo es: "+maximoValor+" y se encuentra en "+maxCol+" y "+maxFil+".");

  }
}
