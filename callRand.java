import java.util.Random;

public class callRand {
  public static int output(int bound) {
    Random random = new Random();
    int finalRandom = random.nextInt(bound);
    System.out.println("random is: " + finalRandom);
    return finalRandom;
  }
}
