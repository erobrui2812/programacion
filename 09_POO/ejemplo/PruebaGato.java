public class PruebaGato {
  public static void main(String[] args) {
    // Gato garfield = new Gato();
    // garfield.sexo = "macho";
    // Gato kitty = new Gato();
    // kitty.sexo = "hembra";
    // Gato missy = new Gato();
    // missy.sexo = "hembra";
    // Gato botas = new Gato();
    // botas.sexo = "macho";

    // garfield.come("Carne");
    // garfield.maulla();
    // garfield.ronronea();
    // garfield.peleaCon(kitty);
    // kitty.peleaCon(missy);
    // botas.peleaCon(garfield);
    // botas.peleaCon(missy);
    
    System.out.println("¿Cuantos gatos quieres crear?");
    int num = Integer.parseInt(System.console().readLine());
    String[] nombres = {"Garfield","Botas","Willy","Pancho","Misifú"};
    String[] colores = {"Marrón","Negro","Pardo"};
    Gato[] gaticos = new Gato[num];

    for (int i = 0; i < num; i++) {
      int nombreAleatorio = (int)(Math.random()*5);
      int colorAleatorio = (int)(Math.random()*3);
      System.out.println("Dime la raza del gato:");
      String raza = System.console().readLine();
      gaticos[i] = new Gato(nombres[nombreAleatorio],colores[colorAleatorio],raza,"Macho",0,0);
    }
    
    for (int i = 0; i < gaticos.length; i++) {
      System.out.println(gaticos[i].nombre);
      System.out.println(gaticos[i].color);
    }
    

  }
}
