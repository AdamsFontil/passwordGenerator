import java.util.Scanner; // to get length input from users

public class length {
  public static int input() { // takes no inputs
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many characters long would you like your password to be?");

    int length = 0; // init length variable

    while (true) { // ensures that users always type an int between 8-16 so that the password is
                   // moderately safe
      try {
        length = Integer.valueOf(scanner.nextLine()); // prompts users about how long they'd like their password be
        if (length >= 8 && length <= 16) {
          break; // if user types an appropriate length exists the loop
        } else {
          System.out.println("Please type a number between 8 and 16."); // keeps asking user to type a length between 8
                                                                        // and 16
        }
      } catch (Exception ex) {
        System.out.println("Please type a number."); // if input is not an int, throw error, so the program continues to
                                                     // run
      }
    }

    System.out.println("Generating a " + length + "-character password...");
    return length;
  }
}
