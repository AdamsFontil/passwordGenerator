import java.util.Scanner;

public class length {
  public static int input() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many characters long would you like your password to be?");

    int length = 0;

    while (true) {
      try {
        length = Integer.valueOf(scanner.nextLine());
        if (length >= 8 && length <= 16) {
          break;
        } else {
          System.out.println("Please type a number between 8 and 16.");
        }
      } catch (Exception ex) {
        System.out.println("Please type a number.");
      }
    }

    System.out.println("Generating a " + length + "-character password...");
    return length;
  }
}
