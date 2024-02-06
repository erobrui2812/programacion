public class Estudiante extends Persona {
  private int creditos;

  /// Constructores
  public Estudiante(String nombre,int edad,String id) {
    super(nombre,edad,id);
    this.creditos = 60;
  }

  public Estudiante(String nombre,int edad,String id,int creditos) {
    super(nombre,edad,id);
    this.creditos = creditos;
  }

  public int getCreditos(){return this.creditos;}
  
  // @Override
  // public void mostrarDatos(){
  //   super.mostrarDatos();
  //   System.out.println("Estudiante matriculado de "+ getCreditos() + " creditos.");
  // }

  @Override
  public String toString(){
    return super.toString()+ "[Estudiante] Creditos: "+getCreditos();
  }

  public static void main(String[] args) {
    Estudiante estud1 = new Estudiante("Juan",25,"A123");
    System.out.println(estud1);
    estud1.toString();
  }
}
