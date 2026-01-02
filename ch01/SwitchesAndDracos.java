import java.util.Arrays;

public class SwitchesAndDracos {
  public static void main(String[] args) {
    String str = "E";
    int x = 0, y = 0;
    switch (str) {
      case "N" -> y += 1;
      case "W" -> x -= 1;
      case "S" -> y -= 1;
      case "E" -> x += 1;
      default -> {
        throw new IllegalArgumentException("you enetered a wrong character as a direction");
      }
    }
    ;
    System.out.println(Arrays.toString(new int[] { x, y }));
  }
}
