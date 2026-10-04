import java.util.Arrays;
import java.util.stream.IntStream;

public class Sequence {
  public static int[] list(int length) {
    int[] sequence = { 3, 2, 1, 2 };
    int targetSum = length;
    // int difference = targetSum - seqSum;

    for (int item : sequence) {
      for (int i = 0; i < sequence.length; i++) {
        int seqSum = IntStream.of(sequence).sum();
        if (seqSum == targetSum) {
          System.out.println("final found" + Arrays.toString(sequence));
          System.out.println("sum" + seqSum);
          break;
        }
        sequence[i]++;
      }
    }
    System.out.println("final seq " + Arrays.toString(sequence));
    return sequence;
  }
}
