public class T07EjercicioBi03 {
  public static void main(String[] args) throws InterruptedException {
    int[][] tabla = new int[4][5];
    int fila,columna;

    System.out.println("Número de filas: "+tabla.length);
    System.out.println("Número de columnas: "+tabla[0].length);

    //rellenar el array con numeros aleatorios
    for (fila=0 ; fila<tabla.length ; fila++) {
      for (columna=0 ; columna<tabla[fila].length; columna++){
        tabla[fila][columna]=(int)(Math.random()*900+100);
        Thread.sleep(200);
      }
    }

    //Mostramos el array
    int sumaFila;
    
    for (fila = 0; fila < tabla.length; fila++) {
      sumaFila=0;
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("%8d", tabla[fila][columna]);
        sumaFila = sumaFila+tabla[fila][columna];
        Thread.sleep(200);
      }
      System.out.printf(" |%8d\n", sumaFila);
      
    }
    for (columna=0; columna < 41;columna++) {
      System.out.printf("-");
    }
    System.out.print("|--------\n");

    int sumaColumna;
    int sumaTotal=0;
    for (columna = 0; columna < tabla[0].length; columna++) {
      sumaColumna = 0;
      for (fila = 0; fila < tabla.length; fila++) {
        sumaColumna = sumaColumna + tabla[fila][columna];
        Thread.sleep(200);
      }
      System.out.printf("%8d" , sumaColumna); //Muestro la suma de la fila y salto de linea
      sumaTotal += sumaColumna;
    }

    System.out.printf(" |%8d",sumaTotal);
  }
}
