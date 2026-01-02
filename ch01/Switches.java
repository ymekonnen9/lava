import java.util.Arrays;

public class Switches {
  public static void main(String[] args) {
    String direction = "W";
    Integer[] res = switch (direction) {
      case "N" -> new Integer[] { 0, 1 };
      case "W" -> new Integer[] { -1, 0 };
      case "S" -> new Integer[] { 0, -1 };
      case "E" -> new Integer[] { 1, 0 };
      default -> {
        throw new IllegalArgumentException("The direction you entered is not valid");
      }

    };

    System.out.println(Arrays.toString(res));
  }
}
