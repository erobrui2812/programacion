public class Profesor extends Persona{
  private String departamento;
  private double sueldo;
  //Constructor por defecto
  public Profesor(String nombre,int edad,String id, String departamento, double sueldo) {
    super(nombre,edad,id);
    this.sueldo = sueldo;
    this.departamento = departamento;
  }
}
