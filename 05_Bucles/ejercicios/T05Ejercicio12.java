import java.util.Scanner;

public class T05Ejercicio12 {
    public static void main(String args[]) {
    
        Scanner sc = new Scanner(System.in);

        int primerTermino = 0;
        int segundoTermino = 1;
        int sumaTermino = 0;
        int n = 0;
        int vuelta = 1;

        System.out.println("Dime cuantos numero de la serie quieres mostrar:");
        n = sc.nextInt();

        while(vuelta <= n ) {

            System.out.print(primerTermino);
            
            if (vuelta == n) {
                System.out.print(".");
            }
            else {
                System.out.print(" , ");
            }

            sumaTermino = primerTermino + segundoTermino;
            primerTermino = segundoTermino;
            segundoTermino = sumaTermino;

            vuelta++;
        }


        sc.close();
    }
}
