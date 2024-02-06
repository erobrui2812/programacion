public class Terminal {
  /// Atributos
  private String numero;
  private int tiempoConversacion; //segundos

  //Constructores
  public Terminal (String numero) {
    this.numero = numero;
  }
  //Getters

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public int getTiempoConversacion() {
    return tiempoConversacion;
  }

  public void setTiempoConversacion(int tiempoConversacion) {
    this.tiempoConversacion = tiempoConversacion;
  }

  @Override
  public String toString() {
    return "Nº " + getNumero() + " - " + getTiempoConversacion() + "s de conversación";
  }
  
  public void llama(Terminal t, int tiempoConversacion) {
    this.tiempoConversacion += tiempoConversacion;
    t.tiempoConversacion += tiempoConversacion;
  }
}
