public class Cubo {
  /// Atributos
  private int capacidad; //cantidad max en lítros
  private int contenido; //contenido en litros

  /// Constructor
  public Cubo (int cap){
    this.capacidad = cap;
  }

  // Métodos Getter
  public int getCapacidad(){
    return this.capacidad;
  }

  public int getContenido(){
    return this.contenido;
  }

  // Métodos Setter
  public void setContenido(int litros){
    this.contenido = litros;
  }

  // Métodos
  public void vaciarCubo(){
    this.contenido = 0;
    System.out.println("Se ha vaciado el cubo");
  }

  public void llenarCubo(){
    this.contenido = this.capacidad;
    System.out.println("Llenado completado");
  }

  public void pinta() {
    for (int nivel = this.capacidad; nivel > 0; nivel--) {
    if (this.contenido >= nivel) {
    System.out.println("#~~~~#");
    } else {
    System.out.println("#    #");
    }
    }
    System.out.println("######");
  }

  public void vuelcaEn(Cubo destino) {
    int libres = destino.getCapacidad() - destino.getContenido();
    if (libres > 0) {
      if (this.contenido <= libres) {
        destino.setContenido(destino.getContenido() + this.contenido);
        this.vaciarCubo();
      } else {
        this.contenido -= libres;
        destino.llenarCubo();
      }
    }
  }
}