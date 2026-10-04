import java.util.Random;

public class callRand {
  public static String output(int finalLen, String word) {
    Random random = new Random();
    int finalRandom = random.nextInt(word.length() - finalLen);
    System.out.println("random is: " + finalRandom);

    String finalWord = word.substring(finalRandom, finalRandom + finalLen);
    System.out.println("final word: " + finalWord);

    return finalWord;
  }

  public static int output(int bound) {
    Random random = new Random();
    int finalRandom = random.nextInt(bound);
    System.out.println("random is: " + finalRandom);
    return finalRandom;
  }
}
