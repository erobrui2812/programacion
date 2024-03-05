import java.util.Scanner;

class Alumno {
    private String nombre;
    private double notaMedia;

    public Alumno(String nombre, double notaMedia) {
        this.nombre = nombre;
        this.notaMedia = notaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Nota Media: " + notaMedia;
    }
}

public class AlumnoApp {
    private static final int MAX_ALUMNOS = 100;
    private static Alumno[] listaAlumnos = new Alumno[MAX_ALUMNOS];
    private static int numAlumnos = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Añadir alumno");
            System.out.println("2. Listar alumnos");
            System.out.println("3. Modificar alumno");
            System.out.println("4. Eliminar alumno");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de nextInt()

            switch (opcion) {
                case 1:
                    añadirAlumno();
                    break;
                case 2:
                    listarAlumnos();
                    break;
                case 3:
                    modificarAlumno();
                    break;
                case 4:
                    eliminarAlumno();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);
    }

    private static void añadirAlumno() {
        if (numAlumnos >= MAX_ALUMNOS) {
            System.out.println("No se pueden añadir más alumnos, la lista está llena.");
            return;
        }

        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la nota media del alumno: ");
        double notaMedia = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea después de nextDouble()

        Alumno alumno = new Alumno(nombre, notaMedia);
        listaAlumnos[numAlumnos] = alumno;
        numAlumnos++;
        System.out.println("Alumno añadido correctamente.");
    }

    private static void listarAlumnos() {
        if (numAlumnos == 0) {
            System.out.println("No hay alumnos en la lista.");
        } else {
            System.out.println("Lista de alumnos:");
            for (int i = 0; i < numAlumnos; i++) {
                System.out.println(listaAlumnos[i]);
            }
        }
    }

    private static void modificarAlumno() {
        if (numAlumnos == 0) {
            System.out.println("No hay alumnos para modificar.");
            return;
        }

        System.out.print("Ingrese el nombre del alumno a modificar: ");
        String nombre = scanner.nextLine();

        for (int i = 0; i < numAlumnos; i++) {
            if (listaAlumnos[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.print("Ingrese la nueva nota media: ");
                double nuevaNotaMedia = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea después de nextDouble()
                listaAlumnos[i].setNotaMedia(nuevaNotaMedia);
                System.out.println("Alumno modificado correctamente.");
                return;
            }
        }

        System.out.println("Alumno no encontrado.");
    }

    private static void eliminarAlumno() {
        if (numAlumnos == 0) {
            System.out.println("No hay alumnos para eliminar.");
            return;
        }

        System.out.print("Ingrese el nombre del alumno a eliminar: ");
        String nombre = scanner.nextLine();

        for (int i = 0; i < numAlumnos; i++) {
            if (listaAlumnos[i].getNombre().equalsIgnoreCase(nombre)) {
                for (int j = i; j < numAlumnos - 1; j++) {
                    listaAlumnos[j] = listaAlumnos[j + 1];
                }
                numAlumnos--;
                System.out.println("Alumno eliminado correctamente.");
                return;
            }
        }

        System.out.println("Alumno no encontrado.");
    }
}
