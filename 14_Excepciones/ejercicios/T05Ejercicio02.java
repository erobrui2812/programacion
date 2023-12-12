public class T05Ejercicio02 {
    public static void main(String args[]){
        int valorMaximo = 100;
        int divisor = 5;

        int contador = 0;
        int valor = 0;

        while (valor < valorMaximo){
            valor = contador*divisor;

            System.out.println(valor);

            contador++;
        }
        
    }
}