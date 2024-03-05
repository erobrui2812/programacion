import java.util.ArrayList;
import java.util.Collections;

public class EjemploArrayList08 {
  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    numeros.add(1);
    numeros.add(12);
    numeros.add(38);
    numeros.add(44);
    numeros.add(93);
    numeros.add(100);
    numeros.add(8);

    System.out.println("Orden original:");
    for (Integer enteros : numeros) {
      System.out.println(enteros);
    }
    
    Collections.sort(numeros);
    System.out.println("Array ordenado");
    for (Integer enteros : numeros) {
      System.out.println(enteros);
    }
  }
}
