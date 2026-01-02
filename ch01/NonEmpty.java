import java.util.Scanner;

public class NonEmpty {
  public static void main(String[] args) {
    System.out.println("Say something");
    Scanner in = new Scanner(System.in);
    String said = in.nextLine();
    in.close();
    String[] subs = said.split(" ");
    for (String sub : subs) {
      System.out.println(sub);
    }
  }
}
