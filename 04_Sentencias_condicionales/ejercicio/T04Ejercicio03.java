import java.util.Scanner;

/**
*Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
*
* @author Elías Robles
*/
public class T04Ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime un numero y te devuelvo un dia de la semana: ");
    int diaSemana = sc.nextInt();
    if (diaSemana==1){
      System.out.println("Lunes");
    } else if (diaSemana==2){
      System.out.println("Martes");
    } else if (diaSemana==3){
      System.out.println("Miercoles");
    } else if (diaSemana==4){
      System.out.println("Jueves");
    } else if (diaSemana==5){
      System.out.println("Viernes");
    } else if (diaSemana==6){
      System.out.println("Sábado");
    } else if (diaSemana==7){
      System.out.println("Domingo");
    } else {
      System.out.println("Introduce un número válido.");
    }
    sc.close();
  }
}
