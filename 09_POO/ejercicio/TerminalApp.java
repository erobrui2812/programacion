public class TerminalApp {
  public static void main(String[] args) {
    // Terminal t1 = new Terminal("675 13 24 24");
    // Terminal t2 = new Terminal("675 23 24 24");
    // Terminal t3 = new Terminal("675 33 24 24");
    // Terminal t4 = new Terminal("675 43 24 24");
    // Terminal t5 = new Terminal("675 53 24 24");
    // t1.llama(t5, 10);
    // t2.llama(t3, 1000);
    // System.out.println(t1.toString());
    // System.out.println(t2.toString());
    // System.out.println(t3.toString());
    // System.out.println(t4.toString());
    // System.out.println(t5.toString());
    Movil t1 = new Movil("675 13 24 24","rata");
    Movil t2 = new Movil("675 23 24 24","rata");
    Movil t3 = new Movil("675 33 24 24","rata");
    Movil t4 = new Movil("675 43 24 24","rata");
    Movil t5 = new Movil("675 53 24 24","rata");

    t1.llama(t5,  10);
    System.out.println(t1.toString());
  }
}
