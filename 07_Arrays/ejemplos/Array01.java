/**
* Ejemplo Tema 7 Arrays
* @author Elías Robles
*/
public class Array01 {
  public static void main(String[] args) {
    int[] n = {26, -30, 0, 100, 50};
    System.out.println("El valor del array es ");
    System.out.println(n[0]+", "+n[1]+", "+n[2]+", "+n[3]+", "+n[4]+".");

    int suma = n[1] + n[3];
    System.out.println("La suma del segundo y el cuarto hueco es "+ suma);


    System.out.println("El array contiene "+ n.length +" elementos. ¿Cuál deseas ver? (0-4)");
    int indice = Integer.parseInt(System.console().readLine());
    System.out.println("El elemento que se encuentra en la posicion "+ indice + " es el "+ n[indice]);
  }
}
