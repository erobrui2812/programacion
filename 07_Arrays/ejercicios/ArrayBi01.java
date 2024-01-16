public class ArrayBi01 {
  public static void main(String[] args) {
    int[][] n = new int[3][2];
    n[0][0] = 20;
    n[1][0] = 67;
    n[1][1] = 33;
    n[2][1] = 7;
    
    //n = {{29,0},{67,33},{0,7}};

    System.out.println("numero de fila: "+ n.length);
    System.out.println("numero de columnas: "+ n[0].length);
    for (int fila = 0; fila < n.length; fila++) {
      for (int columna = 0; columna < n[columna].length; columna++) {
        System.out.printf("%10d ", n[fila][columna]);
        Thread.sleep(1000);
      }
      System.out.printf("\r");
    }
  }
}
