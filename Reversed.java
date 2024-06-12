public class Main {
  public static void main(String[] args) {

 String originalString = "Geeks";
  String reversedString = "";

  for (int i = originalString.length() - 1; i >= 0; i--) {
      reversedString += originalString.charAt(i);
  }

  System.out.println("Original String: " + originalString);
  System.out.println("Reversed String: " + reversedString);
}
}
