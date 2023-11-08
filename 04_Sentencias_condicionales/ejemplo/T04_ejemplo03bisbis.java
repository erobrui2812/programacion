import java.util.Scanner;

public class T04_ejemplo03bisbis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaSemana;
        
        System.out.println("Dime un dia de la semana:");
        diaSemana = sc.nextInt();
        switch (diaSemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Es lectivo");
                break;

            case 6:
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
