/**
* Tablas de multiplicar del 2, 4, y 6
* @author Elías Robles
*/
public class T05Ejemplo02 {
  public static void main(String[] args) {

    for (int i = 2; i <= 6; i+=2){
      for (int j=0; j <=10; j++) {
        System.out.println(i+" * "+j+" = "+i*j);
      }
    }
  }
}
