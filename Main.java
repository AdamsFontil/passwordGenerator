import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    greet.welcome();
    int passlen = length.input();
    int[] pattern = Sequence.list(passlen);

    System.out.println("received" + Arrays.toString(pattern));
    String randWord = randomWord.input(pattern[0]);
    String[] web = website.input(pattern[1]);
    String symbol = symbols.input(pattern[2]);
    String favNum = favNumber.input(pattern[2]);

    String pass = randWord + web[0] + symbol + favNum;
    System.out.println("passowrd for " + web[1] + ":" + pass);

  }
}
