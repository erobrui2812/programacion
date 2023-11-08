/**
*
* @author Elías Robles
*/
import java.util.Scanner;

public class T04_Ejemplo_ejercicio03 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int selectorDelMenu;
  
  System.out.print("Elije una de las opciones \n");
  System.out.print("1 Cuadrado | 2 Rectangulo | 3 Triangulo \n");
  selectorDelMenu=sc.nextInt();

  if (selectorDelMenu == 1){
    int resultadoCuadrado;
    System.out.println("Dime cuanto mide el lad del cuadrado para calcular su area: ");
    int lado = sc.nextInt();

    resultadoCuadrado= lado*lado;
    System.out.println("El area del cuadrado es "+resultadoCuadrado+".");
  }
  else if(selectorDelMenu == 2){
    int resultadoRectangulo;
    System.out.println("Dime la base del rectangulo:");
    int base = sc.nextInt();

    System.out.println("Dime la altura del rectangulo:");
    int altura = sc.nextInt();

    resultadoRectangulo= base*altura;
    System.out.println("El area del rectangulo es "+resultadoRectangulo+".");
  }
  else if (selectorDelMenu == 3) {
    int resultadoTriangulo;
    System.out.println("Dime la base del triangulo:");
    int base = sc.nextInt();

    System.out.println("Dime la altura del triangulo:");
    int altura = sc.nextInt();

    resultadoTriangulo = (base*altura)/2;
    System.out.println("El area del rectangulo es "+resultadoTriangulo+".");
  }
  sc.close();
  }
}
