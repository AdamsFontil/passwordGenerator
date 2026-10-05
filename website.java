import java.util.Scanner; // to get input from user

public class website {
  public static String[] input(int finalLen) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type the website that this password will be used for");

    String website = "";

    while (true) { // ensures that the website provided by the user is between 6 and 32 characters
      website = scanner.nextLine();
      if (website.length() >= 6 && website.length() <= 32) {
        break; // if length is met then stop
      } else {
        System.out.println("Please type a website that is between 6 and 32 letters long."); // keeps telling user to
                                                                                            // provide appropriate input
      }
    }

    String finalWeb = callRand.output(finalLen, website); // returns a substring of website that is finalLen long
    String[] finalVals = { finalWeb, website }; // allows program to have access to manipulated web and original website
                                                // input
    return finalVals; // returns finalVals an array of the original website input
                      // and the modified website input
  }
}
