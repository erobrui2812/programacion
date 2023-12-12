/**
*
* @author Elías Robles
*/
public class T05Ejercicio03 {
  public static void main(String[] args) {
    int valorMax = 100;
    int saltar = 5;
    int contador = 5;
    
    do {  
      System.out.println(contador);
      contador+=saltar;
    } while (contador <= valorMax);
  }
}
