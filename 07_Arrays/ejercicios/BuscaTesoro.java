/**
*
* @author Elías Robles
*/
public class BuscaTesoro {
  public static void main(String[] args) {
    final int VACIA = 0;
    final int TESORO = 1;
    final int MINA = 2;
    final int JUGADA = 3;
    int fila,columna;

    //Tablero 4 filas 5 columnas
    int tablero [][]= new int [4][5];   

    //Inicializamos el tablero con casillas vacías
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        tablero[i][j] = VACIA;
      }
    }
    //Se coloca una casilla de TESORO de manera aleatoria en el tablero
    int tesoroFila = (int) (Math.random()*4);
    int tesoroColumna = (int) (Math.random()*5);
    tablero[tesoroFila][tesoroColumna] = TESORO;

    //Mina
    int minaFila,minaColumna;

    do{
    minaFila = (int) (Math.random()*4);
    minaColumna = (int) (Math.random()*5);
    
    }while((tesoroFila == minaFila)&&(tesoroColumna == minaColumna));

    tablero[minaFila][minaColumna] = MINA;
    //Iniciamos el juego
    System.out.println("Bienvenido a Busca el Tesoro!\n");
    boolean salida = false;

    do {
      for (int i = tablero.length-1; i >= 0; i--) {
        System.out.print(i+" |");
        for (int j = 0; j < tablero[i].length; j++) {
          if (tablero[i][j] == JUGADA) {
            System.out.printf("%2s","X");
          } else {
            System.out.printf("%2s"," ");
          }
        }
        System.out.println();
      }
      System.out.print("   ");
      for (int i = 0; i < (3*tablero[0].length); i++) {
        System.out.print("-");;
      }
      System.out.print("\n   ");
      for (int j = 0; j < tablero[0].length; j++) {
        System.out.printf("%2d ", j);
      }
      System.out.println();

      //Pido las coordenadas
      System.out.println("Introduce la fila: ");
      fila = Integer.parseInt(System.console().readLine());

      System.out.println("Introduce la columna: ");
      columna = Integer.parseInt(System.console().readLine());

      //Compruebo lo que hay en las coordenadas por el jugador
      switch (tablero[fila][columna]) {
        case VACIA:
          tablero[fila][columna] = JUGADA;
          break;
        case MINA:
          System.out.println("¡Uy! Has pisado una mina!");
          salida = true;
          break;
        case TESORO:
          System.out.println("Has encontrado el tesoro!");
          salida = true;
          break;
        
        default:
          break;
      }
      
    } while (!salida);

    String c = "";
    for (int i = tablero.length - 1; i >= 0; i--) {
      System.out.print(i + " |");
      for (int j = 0; j < tablero[i].length; j++) {
        switch (tablero[i][j]) {
          case VACIA:
            c = " ";
            break;
          case MINA:
            c = "";
            break;
          case TESORO:
            c = "$";
            break;
          case JUGADA:
            c = "X";
            break;
default:
        }
        System.out.printf("%2s", c);
      }
      System.out.println();
    }
    System.out.print("   ");
    for (int i = 0; i < (3*tablero[0].length); i++) {
      System.out.print("-");
    }
    System.out.print("\n   ");
    for (int j = 0; j < tablero[0].length; j++) {
      System.out.printf("%2d", j);
    }

  }  
}
