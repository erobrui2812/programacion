/**
*
* @author Elías Robles
*/
import java.util.Scanner;

public class T05Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer numero:");
        int primerNumero = sc.nextInt();

        System.out.println("Dime el segundo numero:");
        int segundoNumero = sc.nextInt();

        if (primerNumero < segundoNumero) {
            for (int i = primerNumero; i <= segundoNumero; i += 7) {
                System.out.print(i + "-");
            }
            System.out.print(segundoNumero);

        } else if (primerNumero > segundoNumero) {
            for (int i = primerNumero; i >= segundoNumero; i -= 7) {
                System.out.print(i + "-");
            }
            System.out.print(segundoNumero);

        } else {
            System.out.println("Los números son iguales.");
        }

        sc.close();
    }
}

