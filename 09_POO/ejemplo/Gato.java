public class Gato {
  //Atributos
  String nombre;
  String color;
  String raza;
  String sexo;
  int edad;
  double peso;

  //constructores
  Gato(String nombre){
    this.nombre = nombre;
  }
  Gato(String nombre, String color, String raza, String sexo, int edad, double peso){
    this.nombre = nombre;
    this.color = color;
    this.edad = edad;
    this.raza = raza;
    this.sexo = sexo;
    this.peso = peso;
  }
  //metodos 
  void maulla(){
    System.out.println("Miauuu");
  }

  void ronronea(){
    System.out.println("Brrrrrrrrr");
  }

  void come(String comida){
    if(comida.equalsIgnoreCase("pescado")) {
       System.out.println("Ñam ñam");
    } else {
      System.out.println("Soy un gato y solo como pescado");
    }
  }

  void peleaCon(Gato contrincante){
    if(this.sexo.equals(contrincante.sexo) && this.sexo.equalsIgnoreCase("macho")){
      System.out.println("Ven aquí que te reviento");
    } else {
      System.out.println("No me gusta pelear");
    }
  }
}