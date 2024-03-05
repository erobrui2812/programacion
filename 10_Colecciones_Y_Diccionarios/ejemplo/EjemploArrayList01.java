import java.util.ArrayList;

public class EjemploArrayList01 {
  public static void main(String[] args) {
    ArrayList<String> colores = new ArrayList<String>();
    System.out.println("Nº de elementos: "+colores.size());
    colores.add("sexo");
    colores.add("sexo1");
    colores.add("sexo2");
    System.out.println("Nº de elementos: "+colores.size());
    colores.add("sexo3");
    System.out.println("Nº de elementos: "+colores.size());
    for (int i = 0; i < colores.size(); i++) {
      System.out.println(colores.get(i));;
    }
  }
}