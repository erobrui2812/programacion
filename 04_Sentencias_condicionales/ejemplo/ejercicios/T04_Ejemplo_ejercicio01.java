import java.util.Scanner;

    public class T04_Ejemplo_ejercicio01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Dime la edad que tienes: ");
    int edad = sc.nextInt();

    if (edad <= 17) {
        System.out.println("Eres menor de edad");
    } 
    else if ((edad >= 18) && (edad < 65)) {
        System.out.println("Eres mayor de edad");
    } 
    else if ((edad >= 65) && (edad <= 120)) {
        System.out.println("Estas jubilado");
    } 
    else {
        System.out.println("Edad no válida");
    }
        

    sc.close();
    }
}
