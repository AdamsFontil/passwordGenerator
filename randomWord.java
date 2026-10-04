import java.util.Scanner;

public class randomWord {
  public static String input() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type a random word, one that is not personably identifiable");

    String word = "";

    while (true) {
      word = scanner.nextLine();
      if (word.length() >= 5 && word.length() <= 32) {
        break;
      } else {
        System.out.println("Please type a word that is between 5 and 32 letters long.");
      }
    }

    System.out.println("Chosen word:" + word);
    return word;
  }
}
