import java.util.Random;

public class callRand {
  static Random random = new Random();

  public static String output(int finalLen, String word) {
    int finalRandom = random.nextInt(word.length() - finalLen);
    System.out.println("random is: " + finalRandom);

    String finalWord = word.substring(finalRandom, finalRandom + finalLen);
    System.out.println("final word: " + finalWord);
    String newFinal = "";
    for (int i = 0; i < finalWord.length(); i++) {
      char letter = finalWord.charAt(i);
      int guess = callRand.output(2);
      if (guess == 1) {
        newFinal += Character.toUpperCase(letter);
      } else {
        newFinal += letter;
      }
    }
    System.out.println("final new word: " + newFinal);
    return newFinal;
  }

  public static int output(int bound) {
    int finalRandom = random.nextInt(bound);
    System.out.println("random is: " + finalRandom);
    return finalRandom;
  }
}
