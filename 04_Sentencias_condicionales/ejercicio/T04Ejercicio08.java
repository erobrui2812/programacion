import java.util.Scanner;

/**
*
  Realiza un programa que calcule la media de tres notas.
* @author Elías Robles
*/
public class T04Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Dime 3 notas y te hago la media:");
    double notaPrimera = sc.nextDouble();
    double notaSegunda = sc.nextDouble();
    double notaTercera = sc.nextDouble();

    if ((notaPrimera < 0)||(notaPrimera > 10)) {
      System.out.println("Notas entre 0 y 10!!");

    } else if ((notaSegunda < 0)||(notaSegunda > 10)) {
      System.out.println("Notas entre 0 y 10!!");

    } else if ((notaTercera < 0)||(notaTercera > 10)) {
      System.out.println("Notas entre 0 y 10!!");

    } else {
      double media = (notaPrimera+notaSegunda+notaTercera) / 3;
      String printeable = "";
      if (media < 5) {
        printeable = "insuficiente";
      } else if (media == 5) {
        printeable = "suficiente";
      } else if (media == 6) {
        printeable = "un bien";
      } else if ((media >=7)&&(media<=8)) {
        printeable = "notable";
      } else {
        printeable = "sobresaliente";
      }
      
      System.out.printf("\nLa nota media es %-10s",printeable);
    }
    
    sc.close();
  }  
}
