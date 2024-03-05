import java.util.HashMap;

public class Ejercicio1 {
  public static void main(String[] args) {
    String usuario;
    String pass;
    boolean accede = false;
    int intentos = 1;
    int maxIntentos = 3;
    HashMap<String,String> bbdd = new HashMap<String,String>();
    bbdd.put("admin","1234");
    bbdd.put("fulanito", "abcd");
    bbdd.put("menganito", "1245689037");

    do {
      
      System.out.println("Por favor, introduce el nombre de usuario: ");
      usuario = System.console().readLine();
      System.out.println("Por favor, introduce la contraseña: ");
      pass = System.console().readLine();
      if (bbdd.containsKey(usuario)){
        if (bbdd.get(usuario).equals(pass)) {
          accede = true;
          System.out.println("Bienvenido a su zona privada");
        } else {
          System.out.println("Contraseña incorrecta");
          System.out.println("Le quedan "+ (maxIntentos-intentos) +" intentos.");
          intentos++;
        }
      } else {
        System.out.println("Usuario no válido");
        System.out.println("Le quedan "+ (maxIntentos-intentos) +" intentos.");
        intentos++;
      }
    } while (accede != true && intentos <= maxIntentos);

  }
}
