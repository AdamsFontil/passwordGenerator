import java.util.Scanner; // to get inputs from users

public class favNumber { // takes a users favNumber add returns that number if it's length requirement is
                         // met, if not adds to that number
  public static String input(int finalLen) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type a lucky number");

    String favNumber = ""; // stores a string for the last argument of the pass variable in the Main file

    while (true) { // ensures that favnumber is always between 2 and 5 characters long
      favNumber = scanner.nextLine();
      if (favNumber.length() >= 2 && favNumber.length() <= 5) {
        break;
      } else {
        System.out.println("Please type a favNumber that is between 2 and 5 digits long."); // if favNumber is not
                                                                                            // between 2 and 5
                                                                                            // characters keep telling
                                                                                            // user to type in correct
                                                                                            // input
      }
    }
    while (favNumber.length() <= finalLen) { // adds random digit to favNumber until it meets the required finalLen set
                                             // the sequence method
      favNumber = favNumber + callRand.output(10); // returns number 0-9
    }
    return favNumber; // a string that is always 2-5 characters long
  }
}
