public class Equality {
  public static void main(String[] args) {
    String location = "Los Angeles";
    String[] home2 = new String[] { "Los", " ", "Angeles" };
    String location2 = String.join("", home2);
    System.out.println(location2);
    System.out.println(location != location2);
    System.out.println(location.equals(location2));
  }
}
