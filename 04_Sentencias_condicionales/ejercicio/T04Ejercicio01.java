import java.util.Scanner;
/**
*
* @author Elías Robles
*/
public class T04Ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime un dia de la semana, y te digo que tenemos a primera hora");
    String dia = sc.nextLine();

    if (dia.equalsIgnoreCase("Lunes")){
      System.out.println("Lunes a primera hora toca, FOL");
    } else if (dia.equalsIgnoreCase("Martes")){
      System.out.println("Martes a primera hora toca, Programación");
    } else if (dia.equalsIgnoreCase("Miercoles")){
      System.out.println("Miercoles a primera hora toca, Entornos");
    } else if (dia.equalsIgnoreCase("Jueves")){
      System.out.println("Jueves a primera hora toca, Bases de datos");
    } else if (dia.equalsIgnoreCase("Viernes")){
      System.out.println("Viernes a primera hora toca, Lenguajes de marcas");
    }
    
    sc.close();
}
}