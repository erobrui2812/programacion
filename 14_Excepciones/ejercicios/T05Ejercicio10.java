import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T05Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int nota = 0;
    int sumadorNotas = 0;
    int vuelta = 0;
    int media = 0;

    while (nota >= 0) {

        System.out.println("Dime una nota");
        nota = sc.nextInt();
        
        if (nota >= 1){
        
            sumadorNotas = sumadorNotas + nota;
            vuelta += 1;
        
        }
    }

    media = sumadorNotas/vuelta;
    System.out.println("La media es " + media);
    
    sc.close();
  }
}
