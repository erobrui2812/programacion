import matematicas.*;
/**
*
* @author Elías Robles
*/
public class PruebaFunciones {
  public static void main (String [] args) {
    /* int n;
    // Probamos la funcion esPrimo del paquete de matematicas.

    System.out.println("Ingrese un numero: ");
    n = Integer.parseInt(System.console().readLine());
    if (Varias.esPrimo(n)) {
      System.out.println(n + " es un número primo.");
    } else {
      System.out.println("No es primo");
    }

    // Prueba digitos
    System.out.println("Ingrese un numero: ");
    n = Integer.parseInt(System.console().readLine());
    int numDigitos = Varias.digitos(n);
    System.out.print("Los dígitos de " + n + " son: " + numDigitos);

    // Prueba areas
    double r, h;
    System.out.println("\nIngrese el radio y la altura de un cilindro: ");
    r = Double.parseDouble(System.console().readLine());
    h = Double.parseDouble(System.console().readLine());
    System.out.printf("El area del cilindro es %.2f\n", Volumen.volumenCilindro(r, h));
    */

    //Prueba de la funcion int voltea
    System.out.println("Introduzca un número para voltearlo: ");
    int x = Integer.parseInt(System.console().readLine());
    System.out.println("El numero "+x+" volteado es: "+Varias.esCapicua((int) x));
  }
}
