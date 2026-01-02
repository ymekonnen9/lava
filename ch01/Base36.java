import java.util.Random;

public class Base36 {
  public static void main(String[] args) {
    Random rand = new Random();
    Long num = rand.nextLong();
    System.out.println(Long.toString(num, 36));
  }
}
