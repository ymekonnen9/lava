import java.math.BigInteger;
import java.util.Scanner;

public class UnsignedInt {
  public static void main(String[] args) {
    System.out.println("Enter 2 number between 0 and 4294967295");
    Scanner in = new Scanner(System.in);
    int n1 = (int) in.nextLong();
    int n2 = (int) in.nextLong();
    in.close();

    Long sum = Integer.toUnsignedLong(n1) + Integer.toUnsignedLong(n2);
    Long difference = Integer.toUnsignedLong(n1) - Integer.toUnsignedLong(n2);
    BigInteger product = BigInteger.valueOf(Integer.toUnsignedLong(n1))
        .multiply(BigInteger.valueOf(Integer.toUnsignedLong(n2)));
    double quotient = Integer.divideUnsigned(n1, n2);
    double remainder = Integer.remainderUnsigned(n1, n2);
    System.out.print(sum + "\n" + difference + "\n" + product + "\n" + quotient + "\n" + remainder);
  }
}
