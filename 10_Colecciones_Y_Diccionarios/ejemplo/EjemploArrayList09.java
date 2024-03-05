/* Creacion de objetos de la clase gato. */

import java.util.ArrayList;

public class EjemploArrayList09 {
  public static void main(String[] args) {
    ArrayList<Alumno> alumnado = new ArrayList<Alumno>();
    alumnado.add(new Alumno("Jose", 6));
    alumnado.add(new Alumno("Luis", 5));
    alumnado.add(new Alumno("Juan", 9));

    for (int i = 0; i < alumnado.size(); i++) {
      System.out.println(alumnado.get(i));
    }
  }
}
