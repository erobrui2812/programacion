public class PruebaLibro {
  public static void main(String[] args) {
    Libro lib = new Libro();
    Libro miLibrito = new Libro();
    Libro quijote = new Libro();
    
    lib.titulo = "Atomka";
    lib.autor = "Frank Tilliez";
    lib.numeroDePAg = 490;

    System.out.println("IBN: "+lib.titulo);
    System.out.println("Autor: "+lib.autor);
    System.out.println();
  }
}
