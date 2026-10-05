public class symbols { // returns random symbols, the amount of symbols returned is based on finalLen
  public static String input(int finalLen) {
    char[] symbols = { '!', '@', '#', '$', '%', '^', '&', '*', '+' };
    String finalSymbol = "";
    for (int i = 0; i < finalLen; i++) { // ensures that the finalSymbols have the number of symbols finalLen calls for
      int rand = callRand.output(symbols.length); // returns a random number from 0 to the length of symbols ArrayList
      char randSym = symbols[rand]; // uses that random to select a random symbol from that list
      finalSymbol = finalSymbol + randSym; // adds that random to the list
    }
    return finalSymbol;
  }
}
