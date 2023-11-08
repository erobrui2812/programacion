import java.util.Scanner;

/**
* Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
  las horas extras. Escribe un programa que calcule el salario semanal de un
  trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
  trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
  la hora
* @author Elías Robles
*/
public class T04Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //creacion e inicialización de variables
    int precioHora = 12;
    int precioHoraExtra = 16;
    
    int horasExtra = 40;
    int sueldo = 0;
    
    System.out.println("Dime las horas que has trabajado esta semana: ");
    int horasTrabajadas = sc.nextInt();

    if (horasTrabajadas > horasExtra) {
      int horasTrabajadasExtra = horasTrabajadas - horasExtra;

      sueldo = (horasExtra*precioHora)+(horasTrabajadasExtra*precioHoraExtra);
    } else {
      sueldo = horasTrabajadas * precioHora;
    }

    System.out.println("Esta semana cobras "+sueldo);
    sc.close();
  }
  
}