import java.util.Scanner;

public class T04_ejemplo02 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);      
        int numeroEnRango;

        System.out.println("Dime un numero entre 1 y 100:");
        numeroEnRango=sc.nextInt();

        if ((numeroEnRango >= 1) && (numeroEnRango <= 100)) {
            System.out.println("Enhorabuena! El numero introducido esta en el rango indicado.");
        } else {
            System.out.println("Te he dicho entre 1 y 100");
        }
        sc.close();
    }
}
