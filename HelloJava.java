public class HelloJava {
  public static void main(String[] args) {
    System.out.print("Hello Java!");

    int y[] = new int[3];
    y[0] = 7;
    y[1] = 8;
    y[2] = 9;

    System.out.print(y[0]+y[1]+y[2]);

    int x[] = new int[] {1,2,3};
    System.out.println(x[0]+x[1]+x[2]);

    int z[] = new int[3];
    int size = z.length;
    System.out.println(size);
  }
}
