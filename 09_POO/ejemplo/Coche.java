/**
* Clase de ejemplo coche
*
* @author Elías Robles
*/

public class Coche {
  
  // propiedades
  String marca ;
  String modelo ;
  String color ;
  String matricula ;
  int puertas ;
  int potencia ;

  public static void main(String[] args) {
    Coche miCoche = new Coche();
    Coche tuCoche = new Coche();

    System.out.println("MMatricula del coche 1: "+miCoche.matricula);
    System.out.println("Potencia coche 1: "+miCoche.potencia);
    System.out.println("MMatricula del coche 2: "+tuCoche.matricula);
    System.out.println("Potencia coche 2: "+tuCoche.potencia);

  } 
  
}
