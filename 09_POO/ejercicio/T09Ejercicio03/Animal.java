package T09Ejercicio03;

public abstract class Animal {
  
  private String sexo;

  public String Animal (String sexo) {
    return this.sexo = sexo;
  }
  
  public void dormir() {
    System.out.println("Zzz");
  }

  public abstract void comer();

}
