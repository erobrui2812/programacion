import java.util.Scanner;

public class T04_ejemplo03bis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaSemana;
        
        System.out.println("Dime un dia de la semana:");
        diaSemana = sc.nextInt();
        switch (diaSemana) {
            case 1,2,3,4,5:
                System.out.println("Es lectivo");
                break;

            case 6,7:
                System.out.println("Es fin de semana");
                break;
            
            default:
                System.out.println("No valido, introduce un dia de la semana.");
                break;
        }

        sc.close();
    }
}
