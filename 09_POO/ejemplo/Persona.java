/**
* Superclase Persona para aprender herencia
* @author Elías Robles
*/
public class Persona {
  
  /// Atributos
  protected String nombre; //Atributo de la clase persona
  private int edad;      //Atributo de la clase persona
  private String dni;     //Atributo privado

  ///  Constructores
  public Persona(String nombre,int edad,String id) {
    this.nombre = nombre;
    this.edad = edad;
    this.dni = id;
  }

  /// Getter
  public String getNombre() { return this.nombre;};
  public int getEdad() {return this.edad;}
  public String getDNI() {return this.dni;}

  public void mostrarDatos(){
    System.out.println("Nombre: " +this.getNombre()+"\tEdad: "+ this.getEdad()+ "\tDNI: "+this.getDNI());
  }

  @Override
  public String toString(){
    return  "Persona" + "nombre=" + nombre + ", edad= " + edad + "dni= " + dni +'}' ;
  }
  public static void main(String[] args) {
    
  }
}