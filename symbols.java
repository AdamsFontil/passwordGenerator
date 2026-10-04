public class symbols {
  public static String input(int finalLen) {
    char[] symbols = { '!', '@', '#', '$', '%', '^', '&', '*', '+' };
    String finalSymbol = "";
    for (int i = 0; i < finalLen; i++) {
      int rand = callRand.output(symbols.length);
      char randSym = symbols[rand];
      finalSymbol = finalSymbol + randSym;
    }
    return finalSymbol;
  }
}
