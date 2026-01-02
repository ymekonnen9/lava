public class Equality {
  public static void main(String[] args) {
    String location = "Los Angeles";
    String home2 = "Los Angeles is so nice".substring(0, 11);
    System.out.println(location != home2);
    System.out.println(location.equals(home2));
  }
}
