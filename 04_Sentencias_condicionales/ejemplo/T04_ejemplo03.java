import java.util.Scanner;

public class T04_ejemplo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaSemana;
        
        System.out.println("Dime un dia de la semana:");
        diaSemana = sc.nextInt();
        switch (diaSemana) {
            case 1:
                System.out.println("Es lectivo");
                break;

            case 2:
                System.out.println("Es lectivo");
                break;

            case 3:
                System.out.println("Es lectivo");
                break;

            case 4:
                System.out.println("Es lectivo");
                break;

            case 5:
                System.out.println("Es lectivo");
                break;

            case 6:
                System.out.println("Es fin de semana");
                break;
            
            case 7:
                System.out.println("Es fin de semana");
                break;
            
            default:
                System.out.println("No valido, introduce un dia de la semana.");
                break;
        }

        sc.close();
    }
}
