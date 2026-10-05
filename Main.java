public class Main { // main function that controls the entire logic of program
  public static void main(String[] args) {
    greet.welcome(); // greets and informs user about passGen
    int passlen = length.input(); // determines how long the password will be
    int[] pattern = Sequence.list(passlen); // the default password length is 3(for random word substring), 2(for
                                            // website substring), 1(symbols in password), 2(favorite number)
    // the default pattern of 3212 creates 8-character passwords. If the user wants
    // more characters the default sequence is adjusted to meet the demand
    // for instance 4212 for 9-characters 4312 for 10 and so on and so forth

    String randWord = randomWord.input(pattern[0]); // returns a substring of the word the user types in. The substring
                                                    // length is determined by pattern[0]
    String[] web = website.input(pattern[1]); // returns modified and original input of website
    String symbol = symbols.input(pattern[2]); // returns a random number of random symbols. The number of symbols is
                                               // determined by pattern[2]
    String favNum = favNumber.input(pattern[3]); // returns random number of fav number the first 2 digits are always
                                                 // what the user has typed in. The others are determined randomly

    String pass = randWord + web[0] + symbol + favNum;
    String message = "passowrd for " + web[1] + ": " + pass + "\n"; // includes \n so that when new passwords are
                                                                    // appended to passwords.txt they are easier to read
    printFile.output(message); // calls printFile to append generated passwords to password.txt

  }
}
