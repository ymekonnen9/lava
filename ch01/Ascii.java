import java.util.Scanner;

public class Ascii {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a statement");
    String input = in.nextLine();
    in.close();
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) < 127) {
        continue;
      }
      System.out.println((int) input.charAt(i));

    }
  }
}
