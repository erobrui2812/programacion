public abstract class Vehiculo {
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;
  
  // atributos
  private int kilometrosRecorridos;


  public Vehiculo(){
    this.kilometrosRecorridos = 0;
  }

  public int getKilometrosRecorridos(){
    return this.kilometrosRecorridos;
  }

  public void recorre(int cantidad) {
    this.kilometrosRecorridos += cantidad;
    kilometrosTotales += cantidad;
  }
  public  int getKilometrosTotales(){
    return kilometrosTotales;
  }
}
