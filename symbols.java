public class symbols {
  public static String input(int finalLen) {
    char[] symbols = { '!', '@', '#', '$', '%', '^', '&', '*', '+' };
    String finalSymbol = "";
    int rand = callRand.output(symbols.length);
    char randSym = symbols[rand];
    return finalSymbol + randSym;

  }
}
