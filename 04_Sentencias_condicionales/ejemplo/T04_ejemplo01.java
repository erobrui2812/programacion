import java.util.Scanner;

public class T04_ejemplo01 {
    public static void  main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        System.out.print("¿Que nota has sacdo en el últimoe examen? ");
        nota = sc.nextInt();

        if(nota>=5) {
            System.out.println("Has aprobado. Enhorabuena!");
        } else {
            System.out.println("Has suspendido.");
        }

        sc.close();
    }
    
}