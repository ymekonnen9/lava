import java.util.Scanner;

public class degree {
  public static void main(String[] args) {
    System.out.println("Enter a degree to be normalized");
    Scanner in = new Scanner(System.in);
    int degree = in.nextInt();
    int normalized = ((degree % 360) + 360) % 360;
    int normalized2 = Math.floorMod(degree, 360);
    System.out.println(normalized2);
    System.out.println(normalized);
    in.close();
  }
}
