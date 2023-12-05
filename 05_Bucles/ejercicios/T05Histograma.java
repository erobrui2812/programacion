import java.util.Scanner;
/**
*
* @author Elías Robles
*/
public class T05Histograma {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero = 0;
    int numeroFilas = 0;
    int numeroGuardado = 0;
    int numeroAcumulado = 0;
    int multiplicador = 1;
    int resto = 10;
    int divisor = 1;
    boolean principio=false;
    
    System.out.println("Dime un caracter para rellenar el histograma: ");
    char relleno = sc.next().charAt(0);

    System.out.println("Introduzca numeros entre 0 y 9. Si desea parar introduzca numero negativo");
    while ((numero>=0)&&(numero<10)) {
      numero = sc.nextInt();
      numeroFilas ++;
      numeroGuardado = numero;
      
      if ((numeroGuardado>=0)&&(numeroGuardado<10)) {
        numeroGuardado *= multiplicador;
        multiplicador *= 10;
        numeroAcumulado = numeroAcumulado + numeroGuardado;
        principio = true;
      }
    }

    if (principio=true) {
      System.out.println(" ---------------------------------------");
    }

    for (int i = 0; i < (numeroFilas-1); i++) {
      int digito = ((numeroAcumulado%resto)/divisor);
      
      System.out.print("| " + digito + " |");
      
      for (int j = 0; j < digito; j++) {
        System.out.print(" " + relleno + " |");
      }

      int huecos = 9 - digito;
      for (int j = 0; j < huecos; j++) {
        System.out.print("   |");
      }
      System.out.println( "");
      System.out.println(" ---------------------------------------");


      resto *= 10;
      divisor *= 10;
    }
    sc.close();
  }
}