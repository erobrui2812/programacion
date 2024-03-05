package Alumnos;
public class Alumno {
  //Atributos
  private String nombre;
  private double notaMedia;

  public String getNombre(){return nombre;}
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public double getNotaMedia() {return notaMedia;}
  public void setNotaMedia(double nota) {
    this.notaMedia = nota;
  }
  @Override
  public String toString() {
    return "Alumno [nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
  }


}