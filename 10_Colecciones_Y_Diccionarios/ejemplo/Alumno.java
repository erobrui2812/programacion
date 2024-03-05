public class Alumno {
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