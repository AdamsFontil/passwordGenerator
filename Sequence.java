import java.util.stream.IntStream; // to determine sum of array

public class Sequence { // adjusts the default of 3212 to align and meet character length requirements
                        // set by user
  public static int[] list(int length) { // length determines the sum sequence must meet
    int[] sequence = { 3, 2, 1, 2 }; // default sequence/pattern. They are length requirements for randomWord,
                                     // website, symbols and favNumber respectively
    int targetSum = length; // length the numbers in sequence array must meet

    for (int item : sequence) { // loops through every item in sequence array, done 4 times
      for (int i = 0; i < sequence.length; i++) { // inner loop so that every item of sequence is current 16 times 4 for
                                                  // outer x 4 for inner loop
        int seqSum = IntStream.of(sequence).sum(); // determines the sum of the sequence
        if (seqSum == targetSum) {
          break; // if the sum of the changing sequence ever reaches the target sum exit loop
        }
        sequence[i]++; // increases the current number in the sequence by 1
      }
    }
    return sequence; // returns an array of four integers with a sum that matches the length
                     // requirement set by the user
  }
}
