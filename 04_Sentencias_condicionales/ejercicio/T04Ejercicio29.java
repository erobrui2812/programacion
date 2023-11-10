import java.util.Scanner;

/**
*
* @author Elías Robles
*/
public class T04Ejercicio29 {
  public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
  
  Double precioPalmera = 1.4;
  Double precioPitufoAceite = 1.2;
  Double precioPitufoTortilla = 1.6;
  Double precioDonut = 1.0;
  Double precioZumo = 1.2;
  Double precioCafe = 1.5;
  String pitufo ="";
  Double cuenta = 0.0;
  Double cuentaBebida = 0.0;
  Double cuentaComida = 0.0;
  System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
  String comida = sc.nextLine();

  if (comida.equalsIgnoreCase("pitufo")) {
    System.out.print("\n¿El pitufo con aceite o tortilla?: ");
    pitufo = sc.nextLine();

    if (pitufo.equalsIgnoreCase("aceite")) {
      cuentaComida+=precioPitufoAceite;

    } else {
      cuentaComida+=precioPitufoTortilla;
    }
  } else if (comida.equalsIgnoreCase("palmera")) {
    cuentaComida+=precioPalmera;
  } else if (comida.equalsIgnoreCase("donut")) {
    cuentaComida+=precioDonut;
  } else {
    System.out.println("Objeto inválido");
  }

  System.out.print("\n¿Qué ha tomado de beber? (zumo o café): ");
  String bebida = sc.nextLine();

  if (bebida.equalsIgnoreCase("zumo")) {
    cuentaBebida+=precioZumo;
  } else if (bebida.equalsIgnoreCase("cafe")) {
    cuentaBebida+=precioCafe;
  }

  cuenta+=cuentaBebida+cuentaComida;

  System.out.printf("\n%-6s: %.2f $",comida,cuentaComida);
  System.out.printf("\n%-6s: %.2f $",bebida,cuentaBebida);
  System.out.printf("\nTotal desayuno: %.2f $",cuenta);
  sc.close();
  }
}
