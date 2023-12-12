public class T05Ejercicio05 {
    public static void main(String args[]){
        int valorInicial = 320;
        int valorFinal = 160;
        
        int resta = 20;

        int valorActual = valorInicial;
        int contador = 0;

        while(valorActual>=valorFinal){
            System.out.println(valorActual);

            valorActual = valorActual-resta;
            contador = contador+1;
        }
    }   
}
