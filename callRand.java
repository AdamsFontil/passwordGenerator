
// imports random to return a random number or random substring
import java.util.Random;

// callRand uses method overloading to create to different methods, each yield different outputs
// based on the arguements feed into each method
public class callRand {
  // this version of callRand return a substring of a given word, the length is
  // determined by the first parameter
  public static String output(int finalLen, String word) {
    Random random = new Random(); // calls instance of Random for the method to function
    int finalRandom = random.nextInt(word.length() - finalLen); // calls the second version of callRand to generate a
                      // random int that determines where the substring of the word should start. By subtracting the length of the word
                      // from the finalLen(given by the sequence), the substring will always start a random point that can reach the end of the word without
                      // causing an error where the index is out of range

    String finalWord = word.substring(finalRandom, finalRandom + finalLen); // substring should start randomly, and go up by the finalLen(set by the sequence method, which determines how long randomWord, website and other variables should be to meet the character requirements)
    String newFinal = ""; // to store finalWord substring, with randomly capitalized letters
    for (int i = 0; i < finalWord.length(); i++) { // loops through finalWord substring and randomly capitilize a character
      char letter = finalWord.charAt(i);
      int guess = callRand.output(2); // capitalize a character one third of the time
      if (guess == 1) {
        newFinal += Character.toUpperCase(letter); // converts letter to upper
      } else {
        newFinal += Character.toLowerCase(letter); // converts letter to lower
      }
    }
    return newFinal; //returns substring with randomly capitalized letters
  }

  public static int output(int bound) { // returns random number based on a given bound/range
    Random random = new Random();
    int finalRandom = random.nextInt(bound);
    return finalRandom;
  }
}
