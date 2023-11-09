import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T04Ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime 3 numeros separados por espacios.");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();

    if (num1 < num2){
      int aux = num1;
      num1 = num2;
      num2 = aux;
    }

    if (num2 < num3){
      int aux = num2;
      num2 = num3;
      num3 = aux;
    }

    if (num1 < num2){
      int aux = num1;
      num1 = num2;
      num2 = aux;
    }
    
    System.out.println("Primer numero "+num1+", Segundo numero "+num2+", Tercer numero "+num3);
    sc.close();
  }
}
