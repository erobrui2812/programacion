import java.util.Scanner;

public class T05Ejercicio07 {
    public static void main(String args[]) {
        int password = 1234;
        int passwordIntroducida;
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int maxIntentos = 4;

        while (contador <= maxIntentos){
            System.out.println("Dime la contraseña");
            passwordIntroducida = sc.nextInt();

            if(passwordIntroducida == password){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                contador=maxIntentos;
            }
            else{
                System.out.println("Lo siento, esa no es la combinación");
            }

            contador++;
        }

    sc.close();
    }
}
