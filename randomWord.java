import java.util.Scanner; // to get randomWord from user via terminal

public class randomWord {
  public static String input(int finalLen) { // finalLen determines the length of substring that is returned
    Scanner scanner = new Scanner(System.in); // calls instance to later gather user input
    System.out.println("Please type a random word, one that is not personably identifiable");

    String word = ""; // init word word, which will later be manipulated

    while (true) { // ensures that word entered by user is between 6-32 characters long
      word = scanner.nextLine(); // gathers user input
      if (word.length() >= 6 && word.length() <= 32) {
        break; // if the length of word is appropriate the move on
      } else {
        System.out.println("Please type a word that is between 6 and 32 letters long."); // gently guides user to type
                                                                                         // appropriate input
      }
    }
    String finalWord = callRand.output(finalLen, word); // calls first version of callRand to return a random substring
                                                        // of the original input, with random capitalized letters
    return finalWord; // returns manipulated word
  }
}
