public class CocheApp {
  public static void main(String[] args) {
   Coche toyota = new Coche(null, null, null);
   Bicicleta bh = new Bicicleta("BH");

   int opcion = 0;
   while(opcion != 8) {

    opcion = Integer.parseInt(System.console().readLine());
    switch (opcion) {
      case 1:
      int km = Integer.parseInt(System.console().readLine());
        break;
      case 2:

      break;
      default:
        break;
    }
   }
}
}
