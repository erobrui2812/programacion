import java.util.Scanner;

public class T05Ejercicio07 {
    public static void main(String args[]) {
        final int password = 1234;
        int passwordIntroducida;
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        final int maxIntentos = 4;
        boolean fin = false;
        
        while ((contador <= maxIntentos) && (!fin)){
            System.out.println("Dime la contraseña");
            passwordIntroducida = sc.nextInt();

            if(passwordIntroducida == password){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                fin=true;
            }
            else{
                System.out.println("Lo siento, esa no es la combinación");
            }

            contador++;
        }

    sc.close();
    }
}
