import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    greet.welcome();
    int passlen = length.input();
    int[] pattern = Sequence.list(passlen);

    System.out.println("received" + Arrays.toString(pattern));
    String randWord = randomWord.input(pattern[0]);
    // String web = website.input();
    // String favNum = favNumber.input();
    // String symbol = "@#";

    // String pass = randWord.substring(0, pattern[0]) + web.substring(1,
    // pattern[1]) + symbol.substring(0, pattern[2])
    // + favNum.substring(0, pattern[3]);
    // System.out.println("passowrd for " + web + ":" + pass);

  }
}
