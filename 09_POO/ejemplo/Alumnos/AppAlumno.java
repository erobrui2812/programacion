package Alumnos;

public class AppAlumno {
  public static void main(String[] args) {
    Alumno[] alumnos = new Alumno[5];
    
    for (int i = 0; i < alumnos.length; i++) {
      alumnos[i] = new Alumno();
      System.out.println("Nombre del alumno "+i+" : ");
      String nombre = System.console().readLine();
      alumnos[i].setNombre(nombre);
      System.out.println("Nota del alumno "+i+" : ");
      Double nota = Double.parseDouble(System.console().readLine());
      alumnos[i].setNotaMedia(nota);
    }

    for (Alumno a : alumnos) {
      System.out.println(a.toString());
    }
  }
}
