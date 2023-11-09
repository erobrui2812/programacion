import java.util.Scanner;

/**
*
* @author Elías Robles
*/ 
public class T04Ejercicio19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa un número entero (positivo o negativo de hasta 5 dígitos): ");
    int numeroUsuario = sc.nextInt();
    
    int largo = String.valueOf(Math.abs(numeroUsuario)).length();

    if (largo >= 6) {
      System.out.println("No es válido");
    } else {
      System.out.println("El largo del digito introducido es de "+largo+" digitos.");

    }

    sc.close();
  }
}
