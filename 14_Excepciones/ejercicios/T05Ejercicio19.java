/**
*
* @author Elías Robles
*/
import java.util.Scanner;

public class T05Ejercicio19 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el numero de asteriscos que deseas pintar");
        int vuelta=sc.nextInt();
        String asterisco="*";
        String espacio=" ";
        
        for (int i = 1; i <= vuelta; i++){
            for (int j = 1; j <= vuelta-i; j++){
                System.out.print(espacio);
            }

            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.print(asterisco);
            }

            System.out.println();
        }
        sc.close();
    }
}