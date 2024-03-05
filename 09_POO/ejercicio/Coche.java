public class Coche extends Vehiculo {
  private String matricula;
  private String marca;
  private String modelo;
  private int kilometraje;
  private static int kilometrajeTotal = 0;
  
  public Coche(String matricula, String marca, String modelo){
    this.kilometraje = 0;
    this.modelo = modelo;
    this.marca = marca;
    this.matricula = matricula;
  }

  public int getKilometraje(){
    return this.kilometraje;
  }

  
  public static void main(String[] args) {
    
  }
  
}