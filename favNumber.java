import java.util.Scanner;

public class favNumber {
  public static String input() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type a lucky number");

    String favNumber = "";

    while (true) {
      favNumber = scanner.nextLine();
      if (favNumber.length() >= 2 && favNumber.length() <= 5) {
        break;
      } else {
        System.out.println("Please type a favNumber that is between 2 and 5 digits long.");
      }
    }

    System.out.println("Chosen favNumber:" + favNumber);
    return favNumber;
  }
}
