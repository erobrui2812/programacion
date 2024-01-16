public class Array03 {
  public static void main(String[] args) {
    int[] array = new int[10];

    array[0] = 8;
    array[1] = 33;
    array[2] = 200;
    array[3] = 150;
    array[4] = 11;
    array[5] = 88;
    array[6] = array[2] * 10;
    array[7] = array[2] / 10;
    array[8] = array[0]+array[1]+array[2];
    array[9] = array[8];

    for (int i=0; i < array.length; i++){
      System.out.println(array[i]);
    }
  }
}
