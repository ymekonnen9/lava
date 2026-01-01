import java.util.Scanner;

public class max {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter 3 numbers");
    int x = in.nextInt();
    int y = in.nextInt();
    int z = in.nextInt();

    System.out.println(Math.max(x, Math.max(y, z)));
    in.close();

  }

}
