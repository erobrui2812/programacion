package ejercicio.T09Ejercicio12;

public class Libro extends Publicacion implements Prestado{
  int año;
  int ISBN;
  String titulo;
  boolean prestado;

  public Libro(int año, int ISBN, String titulo) {
    super(año);
    this.prestado = false;
    this.año = año;
    this.ISBN = ISBN;
    this.titulo = titulo;
  }


  @Override
  public void presta(){
    this.prestado = true;
  }

  @Override
  public void devuelve(){
    if (this.prestado == true) {
      this.prestado = false;
    } else {
      System.out.println("El libro no se encuentra prestado");
    }
  }

  public String prestar(){
    this.prestado = true;
    return "El libro está prestado.";
  }

  public String devolver(){
    this.prestado = false;
    return "(no prestado)";
  }



  @Override
  public String toString(){
    String prestamoString;
    if (this.prestado) {
      prestamoString = prestar();
    } else {
      prestamoString = devolver();
    }
    return "ISBN: "+this.ISBN+", título: "+this.titulo+", año de publicación: "+this.getAño()+ prestamoString;
  }

  @Override
  public String estaPrestado(){
    return this.prestado ? "El libro está prestado." : "(no prestado)";
  }
  
  public static void main(String[] args) {
    Libro l1 = new Libro(2005, 8436789, "La sombra del viento");
    System.out.println(l1);
    l1.presta();
    System.out.println(l1);
    l1.devuelve();
    System.out.println(l1);

  }


  
}