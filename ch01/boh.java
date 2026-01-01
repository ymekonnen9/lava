import java.util.Scanner;

public class boh {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = in.nextInt();
    System.out.println(Integer.toBinaryString(num));
    System.out.println(Integer.toOctalString(num));
    System.out.println(Integer.toHexString(num));
    float reciprocal = 1 / num;
    System.out.println(Double.toHexString(reciprocal));
    in.close();
  }
}