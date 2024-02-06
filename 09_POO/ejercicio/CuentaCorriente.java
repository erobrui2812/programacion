public class CuentaCorriente {
  private double saldo;
  private String numCuenta;
  
  public CuentaCorriente(){
    generarAleatorio();
  }
  
  public CuentaCorriente(double saldoInicial){
    generarAleatorio();
    this.saldo = saldoInicial;
  }

  private void generarAleatorio(){
    for (int i = 0; i < 10; i++) {
      this.numCuenta += (int)(Math.random()*10);
    }
  }
  public void ingresarDinero(double cantidad) {
    this.saldo +=cantidad;
  }
  public void cargo(double cantidad) {
    this.saldo -= cantidad;
  }

  public void transferencia (CuentaCorriente destino, double cantidad) {
    destino.saldo += cantidad;
    this.saldo -= cantidad;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public static void main(String[] args) {
    CuentaCorriente cuenta = new CuentaCorriente();
    
  }
}