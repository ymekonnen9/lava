import java.math.BigInteger;

public class BIgInt {

  public static BigInteger factorial(int i) {
    if (i <= 1) {
      return BigInteger.ONE;
    }
    return BigInteger.valueOf(i).multiply(factorial(i - 1));
  }

  public static void main(String[] args) {
    int n = 1000;
    System.out.println(factorial(n));
  }
}
