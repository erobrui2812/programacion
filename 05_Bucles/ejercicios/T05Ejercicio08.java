import java.util.Scanner;

public class T05Ejercicio08 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número y te mostraré su tabla de multiplicar:");
        int numero = sc.nextInt();
        sc.nextLine();

        int valorActual;
        int contador = 0;
        int maxMultiplicacion = 10;

        while (contador < maxMultiplicacion) {
            contador++;
            valorActual = numero * contador;
            System.out.println(valorActual);
        }

        sc.close();
    }
}