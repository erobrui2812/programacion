import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap02 {
  @SuppressWarnings("rawtypes")
  public static void main(String[] args) {
    HashMap<Integer,String> m = new HashMap<>();
    m.put(11, "Pepe");
    m.put(12, "Juan");
    m.put(13, "Maria");
    m.put(14, "Luis");
    m.put(15, "Ana");
    m.put(16, "Carlos");
    m.put(17, "Sofia");
    m.put(18, "David");
    m.put(19, "Laura");
    m.put(20, "Alejandro");
    System.out.println("los elementos de m utilizando entrySet son:\n"+m.entrySet());

    for (Map.Entry string : m.) {
      System.out.print(string);
      System.out.print(string.getValue());
    }
  }
}
